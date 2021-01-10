// To parse the JSON, install kotlin's serialization plugin and do:
//
// val json                                                                                                 = Json(JsonConfiguration.Stable)
// val aPIGatewayAuthorizerResultContext                                                                    = json.parse(APIGatewayAuthorizerResultContext.serializer(), jsonString)
// val aPIGatewayEventDefaultAuthorizerContext                                                              = json.parse(APIGatewayEventDefaultAuthorizerContext.serializer(), jsonString)
// val aPIGatewayEventRequestContext                                                                        = json.parse(APIGatewayEventRequestContext.serializer(), jsonString)
// val aPIGatewayEventRequestContextWithAuthorizer                                                          = json.parse(APIGatewayEventRequestContextWithAuthorizer.serializer(), jsonString)
// val aPIGatewayEventIdentity                                                                              = json.parse(APIGatewayEventIdentity.serializer(), jsonString)
// val handler                                                                                              = json.parse(Handler.serializer(), jsonString)
// val context                                                                                              = json.parse(Context.serializer(), jsonString)
// val cognitoIdentity                                                                                      = json.parse(CognitoIdentity.serializer(), jsonString)
// val clientContext                                                                                        = json.parse(ClientContext.serializer(), jsonString)
// val clientContextClient                                                                                  = json.parse(ClientContextClient.serializer(), jsonString)
// val clientContextEnv                                                                                     = json.parse(ClientContextEnv.serializer(), jsonString)
// val callback                                                                                             = json.parse(Callback.serializer(), jsonString)
// val aPIGatewayProxyHandler                                                                               = json.parse(APIGatewayProxyHandler.serializer(), jsonString)
// val aPIGatewayProxyCallback                                                                              = json.parse(APIGatewayProxyCallback.serializer(), jsonString)
// val aPIGatewayProxyHandlerV2                                                                             = json.parse(APIGatewayProxyHandlerV2.serializer(), jsonString)
// val aPIGatewayProxyCallbackV2                                                                            = json.parse(APIGatewayProxyCallbackV2.serializer(), jsonString)
// val aPIGatewayProxyEvent                                                                                 = json.parse(APIGatewayProxyEvent.serializer(), jsonString)
// val aPIGatewayProxyWithLambdaAuthorizerHandler                                                           = json.parse(APIGatewayProxyWithLambdaAuthorizerHandler.serializer(), jsonString)
// val aPIGatewayProxyWithCognitoAuthorizerHandler                                                          = json.parse(APIGatewayProxyWithCognitoAuthorizerHandler.serializer(), jsonString)
// val aPIGatewayProxyWithLambdaAuthorizerEvent                                                             = json.parse(APIGatewayProxyWithLambdaAuthorizerEvent.serializer(), jsonString)
// val aPIGatewayProxyWithLambdaAuthorizerEventRequestContext                                               = json.parse(APIGatewayProxyWithLambdaAuthorizerEventRequestContext.serializer(), jsonString)
// val aPIGatewayEventLambdaAuthorizerContext                                                               = json.parse(APIGatewayEventLambdaAuthorizerContext.serializer(), jsonString)
// val aPIGatewayProxyWithCognitoAuthorizerEvent                                                            = json.parse(APIGatewayProxyWithCognitoAuthorizerEvent.serializer(), jsonString)
// val aPIGatewayProxyCognitoAuthorizer                                                                     = json.parse(APIGatewayProxyCognitoAuthorizer.serializer(), jsonString)
// val aPIGatewayProxyEventHeaders                                                                          = json.parse(APIGatewayProxyEventHeaders.serializer(), jsonString)
// val aPIGatewayProxyEventMultiValueHeaders                                                                = json.parse(APIGatewayProxyEventMultiValueHeaders.serializer(), jsonString)
// val aPIGatewayProxyEventPathParameters                                                                   = json.parse(APIGatewayProxyEventPathParameters.serializer(), jsonString)
// val aPIGatewayProxyEventQueryStringParameters                                                            = json.parse(APIGatewayProxyEventQueryStringParameters.serializer(), jsonString)
// val aPIGatewayProxyEventMultiValueQueryStringParameters                                                  = json.parse(APIGatewayProxyEventMultiValueQueryStringParameters.serializer(), jsonString)
// val aPIGatewayProxyEventStageVariables                                                                   = json.parse(APIGatewayProxyEventStageVariables.serializer(), jsonString)
// val aPIGatewayProxyEventBase                                                                             = json.parse(APIGatewayProxyEventBase.serializer(), jsonString)
// val aPIGatewayProxyResult                                                                                = json.parse(APIGatewayProxyResult.serializer(), jsonString)
// val aPIGatewayProxyEventV2                                                                               = json.parse(APIGatewayProxyEventV2.serializer(), jsonString)
// val aPIGatewayProxyResultV2                                                                              = json.parse(APIGatewayProxyResultV2.serializer(), jsonString)
// val aPIGatewayProxyStructuredResultV2                                                                    = json.parse(APIGatewayProxyStructuredResultV2.serializer(), jsonString)
// val proxyHandler                                                                                         = json.parse(ProxyHandler.serializer(), jsonString)
// val proxyCallback                                                                                        = json.parse(ProxyCallback.serializer(), jsonString)
// val aPIGatewayEvent                                                                                      = json.parse(APIGatewayEvent.serializer(), jsonString)
// val proxyResult                                                                                          = json.parse(ProxyResult.serializer(), jsonString)
// val aPIGatewayEventRequestContextWithAuthorizerAPIGatewayEventDefaultAuthorizerContext                   = json.parse(APIGatewayEventRequestContextWithAuthorizerAPIGatewayEventDefaultAuthorizerContext.serializer(), jsonString)
// val aPIGatewayEventRequestContextWithAuthorizerTAuthorizerContext                                        = json.parse(APIGatewayEventRequestContextWithAuthorizerTAuthorizerContext.serializer(), jsonString)
// val tAuthorizerContext                                                                                   = json.parse(TAuthorizerContext.serializer(), jsonString)
// val aPIGatewayProxyEventBaseAPIGatewayEventDefaultAuthorizerContext                                      = json.parse(APIGatewayProxyEventBaseAPIGatewayEventDefaultAuthorizerContext.serializer(), jsonString)
// val aPIGatewayProxyEventBaseAPIGatewayEventLambdaAuthorizerContextTAuthorizerContext                     = json.parse(APIGatewayProxyEventBaseAPIGatewayEventLambdaAuthorizerContextTAuthorizerContext.serializer(), jsonString)
// val aPIGatewayEventRequestContextWithAuthorizerAPIGatewayEventLambdaAuthorizerContextTAuthorizerContext  = json.parse(APIGatewayEventRequestContextWithAuthorizerAPIGatewayEventLambdaAuthorizerContextTAuthorizerContext.serializer(), jsonString)
// val pinkeyofTAuthorizerContextTAuthorizerContextPExtendsnullNullString                                   = json.parse(PinkeyofTAuthorizerContextTAuthorizerContextPExtendsnullNullString.serializer(), jsonString)
// val aPIGatewayEventRequestContextWithAuthorizerAPIGatewayEventLambdaAuthorizerContextTAuthorizerContext1 = json.parse(APIGatewayEventRequestContextWithAuthorizerAPIGatewayEventLambdaAuthorizerContextTAuthorizerContext1.serializer(), jsonString)
// val pinkeyofTAuthorizerContextTAuthorizerContextPExtendsnullNullString1                                  = json.parse(PinkeyofTAuthorizerContextTAuthorizerContextPExtendsnullNullString1.serializer(), jsonString)
// val pinkeyofTAuthorizerContextTAuthorizerContextPExtendsnullNullString2                                  = json.parse(PinkeyofTAuthorizerContextTAuthorizerContextPExtendsnullNullString2.serializer(), jsonString)
// val aPIGatewayProxyEventBaseAPIGatewayProxyCognitoAuthorizer                                             = json.parse(APIGatewayProxyEventBaseAPIGatewayProxyCognitoAuthorizer.serializer(), jsonString)
// val aPIGatewayEventRequestContextWithAuthorizerAPIGatewayProxyCognitoAuthorizer                          = json.parse(APIGatewayEventRequestContextWithAuthorizerAPIGatewayProxyCognitoAuthorizer.serializer(), jsonString)
// val aPIGatewayProxyEventBaseTAuthorizerContext                                                           = json.parse(APIGatewayProxyEventBaseTAuthorizerContext.serializer(), jsonString)
// val aPIGatewayEventRequestContextWithAuthorizerTAuthorizerContext1                                       = json.parse(APIGatewayEventRequestContextWithAuthorizerTAuthorizerContext1.serializer(), jsonString)
// val tAuthorizerContext1                                                                                  = json.parse(TAuthorizerContext1.serializer(), jsonString)
// val t                                                                                                    = json.parse(T.serializer(), jsonString)

package net.sarazan.kotlinx.lambda

import kotlinx.serialization.*
import kotlinx.serialization.json.*

typealias APIGatewayAuthorizerResultContext = HashMap<String, APIGatewayAuthorizerResultContextValue>
typealias Handler = JsonObject
typealias Callback = JsonObject
typealias APIGatewayProxyHandler = JsonObject
typealias APIGatewayProxyCallback = JsonObject
typealias APIGatewayProxyHandlerV2 = JsonObject
typealias APIGatewayProxyCallbackV2 = JsonObject
typealias APIGatewayProxyWithLambdaAuthorizerHandler = JsonObject
typealias APIGatewayProxyWithCognitoAuthorizerHandler = JsonObject
typealias APIGatewayProxyEventHeaders = HashMap<String, String>
typealias APIGatewayProxyEventMultiValueHeaders = HashMap<String, List<String>>
typealias APIGatewayProxyEventPathParameters = HashMap<String, String>
typealias APIGatewayProxyEventQueryStringParameters = HashMap<String, String>
typealias APIGatewayProxyEventMultiValueQueryStringParameters = HashMap<String, List<String>>
typealias APIGatewayProxyEventStageVariables = HashMap<String, String>
typealias ProxyHandler = JsonObject
typealias ProxyCallback = JsonObject
typealias TAuthorizerContext = JsonObject
typealias PinkeyofTAuthorizerContextTAuthorizerContextPExtendsnullNullString = JsonObject
typealias PinkeyofTAuthorizerContextTAuthorizerContextPExtendsnullNullString1 = JsonObject
typealias PinkeyofTAuthorizerContextTAuthorizerContextPExtendsnullNullString2 = JsonObject
typealias TAuthorizerContext1 = JsonObject
typealias T = JsonObject

sealed class APIGatewayAuthorizerResultContextValue {
    class BoolValue(val value: Boolean)  : APIGatewayAuthorizerResultContextValue()
    class DoubleValue(val value: Double) : APIGatewayAuthorizerResultContextValue()
    class StringValue(val value: String) : APIGatewayAuthorizerResultContextValue()
    class NullValue()                    : APIGatewayAuthorizerResultContextValue()
}

@Serializable
data class APIGatewayEventRequestContextWithAuthorizerTAuthorizerContext (
    @SerialName("accountId")
    val accountID: String,

    @SerialName("apiId")
    val apiID: String,

    val authorizer: JsonObject,
    val connectedAt: Double? = null,

    @SerialName("connectionId")
    val connectionID: String? = null,

    val domainName: String? = null,
    val domainPrefix: String? = null,
    val eventType: String? = null,

    @SerialName("extendedRequestId")
    val extendedRequestID: String? = null,

    val httpMethod: String,
    val identity: APIGatewayEventIdentity,
    val messageDirection: String? = null,

    @SerialName("messageId")
    val messageID: String? = null,

    val path: String,
    val protocol: String,

    @SerialName("requestId")
    val requestID: String,

    val requestTime: String? = null,
    val requestTimeEpoch: Double,

    @SerialName("resourceId")
    val resourceID: String,

    val resourcePath: String,
    val routeKey: String? = null,
    val stage: String
)

@Serializable
data class APIGatewayEventIdentity (
    val accessKey: String? = null,

    @SerialName("accountId")
    val accountID: String? = null,

    val apiKey: String? = null,

    @SerialName("apiKeyId")
    val apiKeyID: String? = null,

    val caller: String? = null,
    val cognitoAuthenticationProvider: String? = null,
    val cognitoAuthenticationType: String? = null,

    @SerialName("cognitoIdentityId")
    val cognitoIdentityID: String? = null,

    @SerialName("cognitoIdentityPoolId")
    val cognitoIdentityPoolID: String? = null,

    @SerialName("principalOrgId")
    val principalOrgID: String? = null,

    @SerialName("sourceIp")
    val sourceIP: String,

    val user: String? = null,
    val userAgent: String? = null,
    val userArn: String? = null
)

/**
 * {@link Handler} context parameter.
 * See {@link https://docs.aws.amazon.com/lambda/latest/dg/nodejs-prog-model-context.html
 * AWS documentation}.
 */
@Serializable
data class Context (
    @SerialName("awsRequestId")
    val awsRequestID: String,

    val callbackWaitsForEmptyEventLoop: Boolean,
    val clientContext: ClientContext? = null,
    val functionName: String,
    val functionVersion: String,
    val identity: CognitoIdentity? = null,
    val invokedFunctionArn: String,
    val logGroupName: String,
    val logStreamName: String,
    val memoryLimitInMB: String
)

@Serializable
data class ClientContext (
    val client: ClientContextClient,

    @SerialName("Custom")
    val custom: JsonObject? = null,

    val env: ClientContextEnv
)

@Serializable
data class ClientContextClient (
    val appPackageName: String,
    val appTitle: String,
    val appVersionCode: String,
    val appVersionName: String,

    @SerialName("installationId")
    val installationID: String
)

@Serializable
data class ClientContextEnv (
    val locale: String,
    val make: String,
    val model: String,
    val platform: String,
    val platformVersion: String
)

@Serializable
data class CognitoIdentity (
    @SerialName("cognitoIdentityId")
    val cognitoIdentityID: String,

    @SerialName("cognitoIdentityPoolId")
    val cognitoIdentityPoolID: String
)

@Serializable
data class APIGatewayProxyEventBaseAPIGatewayEventDefaultAuthorizerContext (
    val body: String? = null,
    val headers: Map<String, String>,
    val httpMethod: String,
    val isBase64Encoded: Boolean,
    val multiValueHeaders: Map<String, List<String>>,
    val multiValueQueryStringParameters: Map<String, List<String>>? = null,
    val path: String,
    val pathParameters: Map<String, String>? = null,
    val queryStringParameters: Map<String, String>? = null,
    val requestContext: APIGatewayEventRequestContextWithAuthorizerAPIGatewayEventDefaultAuthorizerContext,
    val resource: String,
    val stageVariables: Map<String, String>? = null
)

@Serializable
data class APIGatewayEventRequestContextWithAuthorizerAPIGatewayEventDefaultAuthorizerContext (
    @SerialName("accountId")
    val accountID: String,

    @SerialName("apiId")
    val apiID: String,

    val authorizer: JsonObject? = null,
    val connectedAt: Double? = null,

    @SerialName("connectionId")
    val connectionID: String? = null,

    val domainName: String? = null,
    val domainPrefix: String? = null,
    val eventType: String? = null,

    @SerialName("extendedRequestId")
    val extendedRequestID: String? = null,

    val httpMethod: String,
    val identity: APIGatewayEventIdentity,
    val messageDirection: String? = null,

    @SerialName("messageId")
    val messageID: String? = null,

    val path: String,
    val protocol: String,

    @SerialName("requestId")
    val requestID: String,

    val requestTime: String? = null,
    val requestTimeEpoch: Double,

    @SerialName("resourceId")
    val resourceID: String,

    val resourcePath: String,
    val routeKey: String? = null,
    val stage: String
)

@Serializable
data class APIGatewayProxyEventBaseAPIGatewayEventLambdaAuthorizerContextTAuthorizerContext (
    val body: String? = null,
    val headers: Map<String, String>,
    val httpMethod: String,
    val isBase64Encoded: Boolean,
    val multiValueHeaders: Map<String, List<String>>,
    val multiValueQueryStringParameters: Map<String, List<String>>? = null,
    val path: String,
    val pathParameters: Map<String, String>? = null,
    val queryStringParameters: Map<String, String>? = null,
    val requestContext: APIGatewayEventRequestContextWithAuthorizerAPIGatewayEventLambdaAuthorizerContextTAuthorizerContext,
    val resource: String,
    val stageVariables: Map<String, String>? = null
)

@Serializable
data class APIGatewayEventRequestContextWithAuthorizerAPIGatewayEventLambdaAuthorizerContextTAuthorizerContext (
    @SerialName("accountId")
    val accountID: String,

    @SerialName("apiId")
    val apiID: String,

    val authorizer: APIGatewayEventRequestContextWithAuthorizerAPIGatewayEventLambdaAuthorizerContextTAuthorizerContextAuthorizer,
    val connectedAt: Double? = null,

    @SerialName("connectionId")
    val connectionID: String? = null,

    val domainName: String? = null,
    val domainPrefix: String? = null,
    val eventType: String? = null,

    @SerialName("extendedRequestId")
    val extendedRequestID: String? = null,

    val httpMethod: String,
    val identity: APIGatewayEventIdentity,
    val messageDirection: String? = null,

    @SerialName("messageId")
    val messageID: String? = null,

    val path: String,
    val protocol: String,

    @SerialName("requestId")
    val requestID: String,

    val requestTime: String? = null,
    val requestTimeEpoch: Double,

    @SerialName("resourceId")
    val resourceID: String,

    val resourcePath: String,
    val routeKey: String? = null,
    val stage: String
)

@Serializable
data class APIGatewayEventRequestContextWithAuthorizerAPIGatewayEventLambdaAuthorizerContextTAuthorizerContextAuthorizer (
    val integrationLatency: Double,

    @SerialName("principalId")
    val principalID: String
)

@Serializable
data class APIGatewayEventRequestContextWithAuthorizerAPIGatewayEventLambdaAuthorizerContextTAuthorizerContext1 (
    @SerialName("accountId")
    val accountID: String,

    @SerialName("apiId")
    val apiID: String,

    val authorizer: APIGatewayProxyWithLambdaAuthorizerEventRequestContextAuthorizer,
    val connectedAt: Double? = null,

    @SerialName("connectionId")
    val connectionID: String? = null,

    val domainName: String? = null,
    val domainPrefix: String? = null,
    val eventType: String? = null,

    @SerialName("extendedRequestId")
    val extendedRequestID: String? = null,

    val httpMethod: String,
    val identity: APIGatewayEventIdentity,
    val messageDirection: String? = null,

    @SerialName("messageId")
    val messageID: String? = null,

    val path: String,
    val protocol: String,

    @SerialName("requestId")
    val requestID: String,

    val requestTime: String? = null,
    val requestTimeEpoch: Double,

    @SerialName("resourceId")
    val resourceID: String,

    val resourcePath: String,
    val routeKey: String? = null,
    val stage: String
)

@Serializable
data class APIGatewayProxyWithLambdaAuthorizerEventRequestContextAuthorizer (
    val integrationLatency: Double,

    @SerialName("principalId")
    val principalID: String
)

@Serializable
data class APIGatewayEventLambdaAuthorizerContext (
    val integrationLatency: Double,

    @SerialName("principalId")
    val principalID: String
)

@Serializable
data class APIGatewayProxyEventBaseAPIGatewayProxyCognitoAuthorizer (
    val body: String? = null,
    val headers: Map<String, String>,
    val httpMethod: String,
    val isBase64Encoded: Boolean,
    val multiValueHeaders: Map<String, List<String>>,
    val multiValueQueryStringParameters: Map<String, List<String>>? = null,
    val path: String,
    val pathParameters: Map<String, String>? = null,
    val queryStringParameters: Map<String, String>? = null,
    val requestContext: APIGatewayEventRequestContextWithAuthorizerAPIGatewayProxyCognitoAuthorizer,
    val resource: String,
    val stageVariables: Map<String, String>? = null
)

@Serializable
data class APIGatewayEventRequestContextWithAuthorizerAPIGatewayProxyCognitoAuthorizer (
    @SerialName("accountId")
    val accountID: String,

    @SerialName("apiId")
    val apiID: String,

    val authorizer: APIGatewayProxyCognitoAuthorizer,
    val connectedAt: Double? = null,

    @SerialName("connectionId")
    val connectionID: String? = null,

    val domainName: String? = null,
    val domainPrefix: String? = null,
    val eventType: String? = null,

    @SerialName("extendedRequestId")
    val extendedRequestID: String? = null,

    val httpMethod: String,
    val identity: APIGatewayEventIdentity,
    val messageDirection: String? = null,

    @SerialName("messageId")
    val messageID: String? = null,

    val path: String,
    val protocol: String,

    @SerialName("requestId")
    val requestID: String,

    val requestTime: String? = null,
    val requestTimeEpoch: Double,

    @SerialName("resourceId")
    val resourceID: String,

    val resourcePath: String,
    val routeKey: String? = null,
    val stage: String
)

@Serializable
data class APIGatewayProxyCognitoAuthorizer (
    val claims: Map<String, String>
)

@Serializable
data class APIGatewayProxyEventBaseTAuthorizerContext (
    val body: String? = null,
    val headers: Map<String, String>,
    val httpMethod: String,
    val isBase64Encoded: Boolean,
    val multiValueHeaders: Map<String, List<String>>,
    val multiValueQueryStringParameters: Map<String, List<String>>? = null,
    val path: String,
    val pathParameters: Map<String, String>? = null,
    val queryStringParameters: Map<String, String>? = null,
    val requestContext: APIGatewayEventRequestContextWithAuthorizerTAuthorizerContext1,
    val resource: String,
    val stageVariables: Map<String, String>? = null
)

@Serializable
data class APIGatewayEventRequestContextWithAuthorizerTAuthorizerContext1 (
    @SerialName("accountId")
    val accountID: String,

    @SerialName("apiId")
    val apiID: String,

    val authorizer: JsonObject,
    val connectedAt: Double? = null,

    @SerialName("connectionId")
    val connectionID: String? = null,

    val domainName: String? = null,
    val domainPrefix: String? = null,
    val eventType: String? = null,

    @SerialName("extendedRequestId")
    val extendedRequestID: String? = null,

    val httpMethod: String,
    val identity: APIGatewayEventIdentity,
    val messageDirection: String? = null,

    @SerialName("messageId")
    val messageID: String? = null,

    val path: String,
    val protocol: String,

    @SerialName("requestId")
    val requestID: String,

    val requestTime: String? = null,
    val requestTimeEpoch: Double,

    @SerialName("resourceId")
    val resourceID: String,

    val resourcePath: String,
    val routeKey: String? = null,
    val stage: String
)

/**
 * Works with Lambda Proxy Integration for Rest API or HTTP API integration Payload Format
 * version 1.0
 */
@Serializable
data class ProxyResult (
    val body: String,
    val headers: Map<String, Header>? = null,
    val isBase64Encoded: Boolean? = null,
    val multiValueHeaders: Map<String, List<Header>>? = null,
    val statusCode: Double
)

@Serializable
sealed class Header {

    @Serializable
    class BoolValue(val value: Boolean) : Header()

    @Serializable
    class DoubleValue(val value: Double) : Header()

    @Serializable
    class StringValue(val value: String) : Header()
}

/**
 * Works with HTTP API integration Payload Format version 2.0
 */
@Serializable
data class APIGatewayProxyEventV2 (
    val body: String? = null,
    val cookies: List<String>? = null,
    val headers: Map<String, String>,
    val isBase64Encoded: Boolean,
    val pathParameters: Map<String, String>? = null,
    val queryStringParameters: Map<String, String>? = null,
    val rawPath: String,
    val rawQueryString: String,
    val requestContext: RequestContext,
    val routeKey: String,
    val stageVariables: Map<String, String>? = null,
    val version: String
)

@Serializable
data class RequestContext (
    @SerialName("accountId")
    val accountID: String,

    @SerialName("apiId")
    val apiID: String,

    val authorizer: Authorizer? = null,
    val domainName: String,
    val domainPrefix: String,
    val http: HTTP,

    @SerialName("requestId")
    val requestID: String,

    val routeKey: String,
    val stage: String,
    val time: String,
    val timeEpoch: Double
)

@Serializable
data class Authorizer (
    val jwt: Jwt
)

@Serializable
data class Jwt (
    val claims: Map<String, Claim>,
    val scopes: List<String>
)

@Serializable
sealed class Claim {
    @Serializable
    class BoolValue(val value: Boolean)             : Claim()
    @Serializable
    class DoubleValue(val value: Double)            : Claim()
    @Serializable
    class StringArrayValue(val value: List<String>) : Claim()
    @Serializable
    class StringValue(val value: String)            : Claim()
}

@Serializable
data class HTTP (
    val method: String,
    val path: String,
    val protocol: String,

    @SerialName("sourceIp")
    val sourceIP: String,

    val userAgent: String
)

sealed class APIGatewayProxyResultV2 {
    class APIGatewayProxyStructuredResultV2ClassValue(val value: APIGatewayProxyStructuredResultV2Class) : APIGatewayProxyResultV2()
    class StringValue(val value: String)                                                                 : APIGatewayProxyResultV2()
}

/**
 * Interface for structured response with `statusCode` and`headers`
 * Works with HTTP API integration Payload Format version 2.0
 */
@Serializable
data class APIGatewayProxyStructuredResultV2Class (
    val body: String? = null,
    val cookies: List<String>? = null,
    val headers: Map<String, Header>? = null,
    val isBase64Encoded: Boolean? = null,
    val statusCode: Double? = null
)

/**
 * Interface for structured response with `statusCode` and`headers`
 * Works with HTTP API integration Payload Format version 2.0
 */
@Serializable
data class APIGatewayProxyStructuredResultV2 (
    val body: String? = null,
    val cookies: List<String>? = null,
    val headers: Map<String, Header>? = null,
    val isBase64Encoded: Boolean? = null,
    val statusCode: Double? = null
)
