package net.sarazan.kotlinx.lambda
import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import com.amazonaws.services.lambda.runtime.RequestStreamHandler
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.InternalSerializationApi
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.serializer
import java.io.InputStream
import java.io.OutputStream
import kotlin.reflect.KClass

private val json = Json {
    isLenient = true
    ignoreUnknownKeys = true
}

inline fun<reified I : Any, O: Any> requestHandler(crossinline fn: suspend (I, Context) -> O): KotlinRequestHandler<I, O> {
    return object : KotlinRequestHandler<I, O>(I::class) {
        override suspend fun onRequest(input: I, context: Context): O {
            return fn(input, context)
        }
    }
}

abstract class KotlinRequestHandler<I : Any, O : Any>(
    val input: KClass<I>
) : RequestStreamHandler, RequestHandler<I, O> {

    protected abstract suspend fun onRequest(input: I, context: Context): O

    @InternalSerializationApi
    @OptIn(ExperimentalSerializationApi::class)
    final override fun handleRequest(input: InputStream, output: OutputStream, context: Context) {
        val i = json.decodeFromString(this.input.serializer(), input.toString())
        handleRequest(i, context).let {
            val str = json.encodeToString(it::class.serializer())
            output.write(str.encodeToByteArray())
        }
    }

    final override fun handleRequest(input: I, context: Context): O = runBlocking {
        onRequest(input, context)
    }
}