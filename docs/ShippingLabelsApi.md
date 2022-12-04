# ShippingLabelsApi

All URIs are relative to *https://api.bol.com*

 Method                                                            | HTTP request                                          | Description             
-------------------------------------------------------------------|-------------------------------------------------------|-------------------------
 [**getDeliveryOptions**](ShippingLabelsApi.md#getDeliveryOptions) | **POST** /retailer/shipping-labels/delivery-options   | Get delivery options    
 [**getShippingLabel**](ShippingLabelsApi.md#getShippingLabel)     | **GET** /retailer/shipping-labels/{shipping-label-id} | Get a shipping label    
 [**postShippingLabel**](ShippingLabelsApi.md#postShippingLabel)   | **POST** /retailer/shipping-labels                    | Create a shipping label 

<a name="getDeliveryOptions"></a>

# **getDeliveryOptions**

> DeliveryOptionsResponse getDeliveryOptions(body)

Get delivery options

Retrieves all available delivery options based on the supplied configuration of order items that has to be shipped.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ShippingLabelsApi;


ShippingLabelsApi apiInstance=new ShippingLabelsApi();
        DeliveryOptionsRequest body=new DeliveryOptionsRequest(); // DeliveryOptionsRequest | 
        try{
        DeliveryOptionsResponse result=apiInstance.getDeliveryOptions(body);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling ShippingLabelsApi#getDeliveryOptions");
        e.printStackTrace();
        }
```

### Parameters

 Name     | Type                                                    | Description | Notes      
----------|---------------------------------------------------------|-------------|------------
 **body** | [**DeliveryOptionsRequest**](DeliveryOptionsRequest.md) |             | [optional] 

### Return type

[**DeliveryOptionsResponse**](DeliveryOptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/vnd.retailer.v8+json
- **Accept**: application/vnd.retailer.v8+json

<a name="getShippingLabel"></a>

# **getShippingLabel**

> List&lt;byte[]&gt; getShippingLabel(shippingLabelId)

Get a shipping label

Retrieves a shipping label by shipping label id. Metadata for the shipping label is added as headers in the response. If
you are only interested in the metadata, you can do a HEAD request to retrieve only the headers without the label data.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ShippingLabelsApi;


ShippingLabelsApi apiInstance=new ShippingLabelsApi();
        String shippingLabelId="6ff736b5-cdd0-4150-8c67-78269ee986f5"; // String | The shipping label id.
        try{
        List<byte[]>result=apiInstance.getShippingLabel(shippingLabelId);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling ShippingLabelsApi#getShippingLabel");
        e.printStackTrace();
        }
```

### Parameters

 Name                | Type       | Description            | Notes 
---------------------|------------|------------------------|-------
 **shippingLabelId** | **String** | The shipping label id. |

### Return type

**List&lt;byte[]&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+pdf

<a name="postShippingLabel"></a>

# **postShippingLabel**

> ProcessStatus postShippingLabel(body)

Create a shipping label

Create a shipping label with a shipping label offer id retrieved from get delivery options.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ShippingLabelsApi;


ShippingLabelsApi apiInstance=new ShippingLabelsApi();
        ShippingLabelRequest body=new ShippingLabelRequest(); // ShippingLabelRequest | 
        try{
        ProcessStatus result=apiInstance.postShippingLabel(body);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling ShippingLabelsApi#postShippingLabel");
        e.printStackTrace();
        }
```

### Parameters

 Name     | Type                                                | Description | Notes      
----------|-----------------------------------------------------|-------------|------------
 **body** | [**ShippingLabelRequest**](ShippingLabelRequest.md) |             | [optional] 

### Return type

[**ProcessStatus**](ProcessStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/vnd.retailer.v8+json
- **Accept**: application/vnd.retailer.v8+json

