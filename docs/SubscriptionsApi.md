# SubscriptionsApi

All URIs are relative to *https://api.bol.com*

 Method                                                                                           | HTTP request                                            | Description                                                      
--------------------------------------------------------------------------------------------------|---------------------------------------------------------|------------------------------------------------------------------
 [**deletePushNotificationSubscription**](SubscriptionsApi.md#deletePushNotificationSubscription) | **DELETE** /retailer/subscriptions/{subscription-id}    | Delete push notification subscription                            
 [**getPushNotificationSubscription**](SubscriptionsApi.md#getPushNotificationSubscription)       | **GET** /retailer/subscriptions/{subscription-id}       | Get push notification subscription by id                         
 [**getPushNotificationSubscriptions**](SubscriptionsApi.md#getPushNotificationSubscriptions)     | **GET** /retailer/subscriptions                         | Get push notification subscriptions                              
 [**getSubscriptionKeys**](SubscriptionsApi.md#getSubscriptionKeys)                               | **GET** /retailer/subscriptions/signature-keys          | Retrieve public keys for push notification signature validation. 
 [**postPushNotificationSubscription**](SubscriptionsApi.md#postPushNotificationSubscription)     | **POST** /retailer/subscriptions                        | Create push notification subscription                            
 [**postTestPushNotification**](SubscriptionsApi.md#postTestPushNotification)                     | **POST** /retailer/subscriptions/test/{subscription-id} | Send test push notification for subscriptions                    
 [**putPushNotificationSubscription**](SubscriptionsApi.md#putPushNotificationSubscription)       | **PUT** /retailer/subscriptions/{subscription-id}       | Update push notification subscription                            

<a name="deletePushNotificationSubscription"></a>

# **deletePushNotificationSubscription**

> ProcessStatus deletePushNotificationSubscription(subscriptionId)

Delete push notification subscription

Delete a push notification subscription with the provided id.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscriptionsApi;


SubscriptionsApi apiInstance = new SubscriptionsApi();
String subscriptionId = "1234"; // String | A unique identifier for the subscription.
try {
    ProcessStatus result = apiInstance.deletePushNotificationSubscription(subscriptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#deletePushNotificationSubscription");
    e.printStackTrace();
}
```

### Parameters

 Name               | Type       | Description                               | Notes 
--------------------|------------|-------------------------------------------|-------
 **subscriptionId** | **String** | A unique identifier for the subscription. |

### Return type

[**ProcessStatus**](ProcessStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/vnd.retailer.v8+json
- **Accept**: application/vnd.retailer.v8+json

<a name="getPushNotificationSubscription"></a>

# **getPushNotificationSubscription**

> SubscriptionResponse getPushNotificationSubscription(subscriptionId)

Get push notification subscription by id

Retrieve a configured and active push notification subscription with the provided id.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscriptionsApi;


SubscriptionsApi apiInstance = new SubscriptionsApi();
String subscriptionId = "1234"; // String | A unique identifier for the subscription.
try {
    SubscriptionResponse result = apiInstance.getPushNotificationSubscription(subscriptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#getPushNotificationSubscription");
    e.printStackTrace();
}
```

### Parameters

 Name               | Type       | Description                               | Notes 
--------------------|------------|-------------------------------------------|-------
 **subscriptionId** | **String** | A unique identifier for the subscription. |

### Return type

[**SubscriptionResponse**](SubscriptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+json

<a name="getPushNotificationSubscriptions"></a>

# **getPushNotificationSubscriptions**

> SubscriptionsResponse getPushNotificationSubscriptions()

Get push notification subscriptions

Retrieve a list of all configured and active push notification subscriptions.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscriptionsApi;


SubscriptionsApi apiInstance = new SubscriptionsApi();
try {
    SubscriptionsResponse result = apiInstance.getPushNotificationSubscriptions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#getPushNotificationSubscriptions");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**SubscriptionsResponse**](SubscriptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+json

<a name="getSubscriptionKeys"></a>

# **getSubscriptionKeys**

> KeySetResponse getSubscriptionKeys()

Retrieve public keys for push notification signature validation.

Retrieve a list of public keys that should be used to validate the signature header for push notifications received from
bol.com.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscriptionsApi;


SubscriptionsApi apiInstance = new SubscriptionsApi();
try {
    KeySetResponse result = apiInstance.getSubscriptionKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#getSubscriptionKeys");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**KeySetResponse**](KeySetResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+json

<a name="postPushNotificationSubscription"></a>

# **postPushNotificationSubscription**

> ProcessStatus postPushNotificationSubscription(body)

Create push notification subscription

Create a push notification subscription for one (or more) of the available resources. The configured URL has to support
https scheme.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscriptionsApi;


SubscriptionsApi apiInstance = new SubscriptionsApi();
CreateSubscriptionRequest body = new CreateSubscriptionRequest(); // CreateSubscriptionRequest | 
try {
    ProcessStatus result = apiInstance.postPushNotificationSubscription(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#postPushNotificationSubscription");
    e.printStackTrace();
}
```

### Parameters

 Name     | Type                                                          | Description | Notes      
----------|---------------------------------------------------------------|-------------|------------
 **body** | [**CreateSubscriptionRequest**](CreateSubscriptionRequest.md) |             | [optional] 

### Return type

[**ProcessStatus**](ProcessStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/vnd.retailer.v8+json
- **Accept**: application/vnd.retailer.v8+json

<a name="postTestPushNotification"></a>

# **postTestPushNotification**

> ProcessStatus postTestPushNotification(subscriptionId)

Send test push notification for subscriptions

Send a test push notification to all subscriptions for the provided event.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscriptionsApi;


SubscriptionsApi apiInstance = new SubscriptionsApi();
String subscriptionId = "1234"; // String | A unique identifier for the subscription.
try {
    ProcessStatus result = apiInstance.postTestPushNotification(subscriptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#postTestPushNotification");
    e.printStackTrace();
}
```

### Parameters

 Name               | Type       | Description                               | Notes 
--------------------|------------|-------------------------------------------|-------
 **subscriptionId** | **String** | A unique identifier for the subscription. |

### Return type

[**ProcessStatus**](ProcessStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/vnd.retailer.v8+json
- **Accept**: application/vnd.retailer.v8+json

<a name="putPushNotificationSubscription"></a>

# **putPushNotificationSubscription**

> ProcessStatus putPushNotificationSubscription(subscriptionId, body)

Update push notification subscription

Update an existing push notification subscription with the supplied id. The configured URL has to support https scheme.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscriptionsApi;


SubscriptionsApi apiInstance = new SubscriptionsApi();
String subscriptionId = "1234"; // String | A unique identifier for the subscription.
UpdateSubscriptionRequest body = new UpdateSubscriptionRequest(); // UpdateSubscriptionRequest | 
try {
    ProcessStatus result = apiInstance.putPushNotificationSubscription(subscriptionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#putPushNotificationSubscription");
    e.printStackTrace();
}
```

### Parameters

 Name               | Type                                                          | Description                               | Notes      
--------------------|---------------------------------------------------------------|-------------------------------------------|------------
 **subscriptionId** | **String**                                                    | A unique identifier for the subscription. |
 **body**           | [**UpdateSubscriptionRequest**](UpdateSubscriptionRequest.md) |                                           | [optional] 

### Return type

[**ProcessStatus**](ProcessStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/vnd.retailer.v8+json
- **Accept**: application/vnd.retailer.v8+json

