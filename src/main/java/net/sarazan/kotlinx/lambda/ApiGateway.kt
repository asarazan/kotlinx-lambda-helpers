// To parse the JSON, install kotlin's serialization plugin and do:
//
// val json                                                                               = Json(JsonConfiguration.Stable)
// val aPIGatewayAuthorizerResultContext                                                  = json.parse(APIGatewayAuthorizerResultContext.serializer(), jsonString)
// val aPIGatewayEventDefaultAuthorizerContext                                            = json.parse(APIGatewayEventDefaultAuthorizerContext.serializer(), jsonString)
// val aPIGatewayEventRequestContext                                                      = json.parse(APIGatewayEventRequestContext.serializer(), jsonString)
// val aPIGatewayEventRequestContextWithAuthorizer                                        = json.parse(APIGatewayEventRequestContextWithAuthorizer.serializer(), jsonString)
// val aPIGatewayEventIdentity                                                            = json.parse(APIGatewayEventIdentity.serializer(), jsonString)
// val aPIGatewayEventRequestContextWithAuthorizerAPIGatewayEventDefaultAuthorizerContext = json.parse(APIGatewayEventRequestContextWithAuthorizerAPIGatewayEventDefaultAuthorizerContext.serializer(), jsonString)
// val aPIGatewayEventRequestContextWithAuthorizerTAuthorizerContext                      = json.parse(APIGatewayEventRequestContextWithAuthorizerTAuthorizerContext.serializer(), jsonString)
// val tAuthorizerContext                                                                 = json.parse(TAuthorizerContext.serializer(), jsonString)

package net.sarazan.kotlinx.lambda

import kotlinx.serialization.*
import kotlinx.serialization.json.*

typealias APIGatewayAuthorizerResultContext = HashMap<String, APIGatewayAuthorizerResultContextValue>
typealias TAuthorizerContext = JsonObject

sealed class APIGatewayAuthorizerResultContextValue {
    class BoolValue(val value: Boolean)  : APIGatewayAuthorizerResultContextValue()
    class DoubleValue(val value: Double) : APIGatewayAuthorizerResultContextValue()
    class StringValue(val value: String) : APIGatewayAuthorizerResultContextValue()
    class NullValue()                    : APIGatewayAuthorizerResultContextValue()
}

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
