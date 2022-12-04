# ReplenishmentsApi

All URIs are relative to *https://api.bol.com*

 Method                                                                                    | HTTP request                                                                    | Description                                         
-------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------|-----------------------------------------------------
 [**getDeliveryDates**](ReplenishmentsApi.md#getDeliveryDates)                             | **GET** /retailer/replenishments/delivery-dates                                 | Get delivery dates                                  
 [**getLoadCarrierLabels**](ReplenishmentsApi.md#getLoadCarrierLabels)                     | **GET** /retailer/replenishments/{replenishment-id}/load-carrier-labels         | Get load carrier labels                             
 [**getPickList**](ReplenishmentsApi.md#getPickList)                                       | **GET** /retailer/replenishments/{replenishment-id}/pick-list                   | Get pick list                                       
 [**getProductDestinations**](ReplenishmentsApi.md#getProductDestinations)                 | **GET** /retailer/replenishments/product-destinations/{product-destinations-id} | Get product destinations by product destinations id 
 [**getReplenishment**](ReplenishmentsApi.md#getReplenishment)                             | **GET** /retailer/replenishments/{replenishment-id}                             | Get a replenishment by replenishment id             
 [**getReplenishments**](ReplenishmentsApi.md#getReplenishments)                           | **GET** /retailer/replenishments                                                | Get replenishments                                  
 [**postPickupTimeSlots**](ReplenishmentsApi.md#postPickupTimeSlots)                       | **POST** /retailer/replenishments/pickup-time-slots                             | Post pickup time slots                              
 [**postProductLabels**](ReplenishmentsApi.md#postProductLabels)                           | **POST** /retailer/replenishments/product-labels                                | Post product labels                                 
 [**postReplenishment**](ReplenishmentsApi.md#postReplenishment)                           | **POST** /retailer/replenishments                                               | Create a replenishment                              
 [**postRequestProductDestinations**](ReplenishmentsApi.md#postRequestProductDestinations) | **POST** /retailer/replenishments/product-destinations                          | Request product destinations                        
 [**putReplenishment**](ReplenishmentsApi.md#putReplenishment)                             | **PUT** /retailer/replenishments/{replenishment-id}                             | Update a replenishment by replenishment id          

<a name="getDeliveryDates"></a>

# **getDeliveryDates**

> DeliveryDatesResponse getDeliveryDates()

Get delivery dates

Retrieve a list of available delivery dates for a replenishment.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReplenishmentsApi;


ReplenishmentsApi apiInstance=new ReplenishmentsApi();
        try{
        DeliveryDatesResponse result=apiInstance.getDeliveryDates();
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling ReplenishmentsApi#getDeliveryDates");
        e.printStackTrace();
        }
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**DeliveryDatesResponse**](DeliveryDatesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+json

<a name="getLoadCarrierLabels"></a>

# **getLoadCarrierLabels**

> List&lt;byte[]&gt; getLoadCarrierLabels(replenishmentId, labelType)

Get load carrier labels

Retrieve the load carrier labels.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReplenishmentsApi;


ReplenishmentsApi apiInstance=new ReplenishmentsApi();
        String replenishmentId="2312078154"; // String | The unique identifier of the replenishment.
        String labelType="WAREHOUSE"; // String | The type of label which you want to print.
        try{
        List<byte[]>result=apiInstance.getLoadCarrierLabels(replenishmentId,labelType);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling ReplenishmentsApi#getLoadCarrierLabels");
        e.printStackTrace();
        }
```

### Parameters

 Name                | Type       | Description                                 | Notes                                                          
---------------------|------------|---------------------------------------------|----------------------------------------------------------------
 **replenishmentId** | **String** | The unique identifier of the replenishment. |
 **labelType**       | **String** | The type of label which you want to print.  | [optional] [default to WAREHOUSE] [enum: WAREHOUSE, TRANSPORT] 

### Return type

**List&lt;byte[]&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+pdf

<a name="getPickList"></a>

# **getPickList**

> List&lt;byte[]&gt; getPickList(replenishmentId)

Get pick list

Retrieve the pick list.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReplenishmentsApi;


ReplenishmentsApi apiInstance=new ReplenishmentsApi();
        String replenishmentId="2312078154"; // String | The unique identifier of the replenishment.
        try{
        List<byte[]>result=apiInstance.getPickList(replenishmentId);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling ReplenishmentsApi#getPickList");
        e.printStackTrace();
        }
```

### Parameters

 Name                | Type       | Description                                 | Notes 
---------------------|------------|---------------------------------------------|-------
 **replenishmentId** | **String** | The unique identifier of the replenishment. |

### Return type

**List&lt;byte[]&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+pdf

<a name="getProductDestinations"></a>

# **getProductDestinations**

> ProductDestinationsResponse getProductDestinations(productDestinationsId)

Get product destinations by product destinations id

Gets the product destinations for one or more products by product destinations id.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReplenishmentsApi;


ReplenishmentsApi apiInstance=new ReplenishmentsApi();
        String productDestinationsId="9483fc7e-faf3-4814-864e-dee412044c27"; // String | The identifier of the product destinations requested.
        try{
        ProductDestinationsResponse result=apiInstance.getProductDestinations(productDestinationsId);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling ReplenishmentsApi#getProductDestinations");
        e.printStackTrace();
        }
```

### Parameters

 Name                      | Type       | Description                                           | Notes 
---------------------------|------------|-------------------------------------------------------|-------
 **productDestinationsId** | **String** | The identifier of the product destinations requested. |

### Return type

[**ProductDestinationsResponse**](ProductDestinationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+json

<a name="getReplenishment"></a>

# **getReplenishment**

> ReplenishmentResponse getReplenishment(replenishmentId)

Get a replenishment by replenishment id

Gets a replenishment by replenishment id.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReplenishmentsApi;


ReplenishmentsApi apiInstance=new ReplenishmentsApi();
        String replenishmentId="2312078154"; // String | The unique identifier of the replenishment.
        try{
        ReplenishmentResponse result=apiInstance.getReplenishment(replenishmentId);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling ReplenishmentsApi#getReplenishment");
        e.printStackTrace();
        }
```

### Parameters

 Name                | Type       | Description                                 | Notes 
---------------------|------------|---------------------------------------------|-------
 **replenishmentId** | **String** | The unique identifier of the replenishment. |

### Return type

[**ReplenishmentResponse**](ReplenishmentResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+json

<a name="getReplenishments"></a>

# **getReplenishments**

> ReplenishmentsResponse getReplenishments(reference, ean, startDate, endDate, state, page)

Get replenishments

Gets a list of replenishments.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReplenishmentsApi;


ReplenishmentsApi apiInstance=new ReplenishmentsApi();
        String reference="REFERENCE1"; // String | Custom user defined reference to identify the replenishment.
        String ean="0000007740404"; // String | The EAN number associated with this product.
        String startDate="2021-01-01"; // String | The creation start date to find the replenishment. In ISO 8601 format.
        String endDate="2021-01-02"; // String | The end date of the range to find the replenishment. In ISO 8601 format.
        List<String> state=Arrays.asList("ANNOUNCED"); // List<String> | The current state(s) of the replenishment.
        Integer page=1; // Integer | The requested page number with a page size of 50 items.
        try{
        ReplenishmentsResponse result=apiInstance.getReplenishments(reference,ean,startDate,endDate,state,page);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling ReplenishmentsApi#getReplenishments");
        e.printStackTrace();
        }
```

### Parameters

 Name          | Type                                | Description                                                              | Notes                     
---------------|-------------------------------------|--------------------------------------------------------------------------|---------------------------
 **reference** | **String**                          | Custom user defined reference to identify the replenishment.             | [optional]                
 **ean**       | **String**                          | The EAN number associated with this product.                             | [optional]                
 **startDate** | **String**                          | The creation start date to find the replenishment. In ISO 8601 format.   | [optional]                
 **endDate**   | **String**                          | The end date of the range to find the replenishment. In ISO 8601 format. | [optional]                
 **state**     | [**List&lt;String&gt;**](String.md) | The current state(s) of the replenishment.                               | [optional]                
 **page**      | **Integer**                         | The requested page number with a page size of 50 items.                  | [optional] [default to 1] 

### Return type

[**ReplenishmentsResponse**](ReplenishmentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+json

<a name="postPickupTimeSlots"></a>

# **postPickupTimeSlots**

> PickupTimeSlotsResponse postPickupTimeSlots(body)

Post pickup time slots

Retrieve pickup time slots.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReplenishmentsApi;


ReplenishmentsApi apiInstance=new ReplenishmentsApi();
        PickupTimeSlotsRequest body=new PickupTimeSlotsRequest(); // PickupTimeSlotsRequest | 
        try{
        PickupTimeSlotsResponse result=apiInstance.postPickupTimeSlots(body);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling ReplenishmentsApi#postPickupTimeSlots");
        e.printStackTrace();
        }
```

### Parameters

 Name     | Type                                                    | Description | Notes      
----------|---------------------------------------------------------|-------------|------------
 **body** | [**PickupTimeSlotsRequest**](PickupTimeSlotsRequest.md) |             | [optional] 

### Return type

[**PickupTimeSlotsResponse**](PickupTimeSlotsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/vnd.retailer.v8+json
- **Accept**: application/vnd.retailer.v8+json

<a name="postProductLabels"></a>

# **postProductLabels**

> List&lt;byte[]&gt; postProductLabels(body)

Post product labels

Retrieve product labels.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReplenishmentsApi;


ReplenishmentsApi apiInstance=new ReplenishmentsApi();
        ProductLabelsRequest body=new ProductLabelsRequest(); // ProductLabelsRequest | 
        try{
        List<byte[]>result=apiInstance.postProductLabels(body);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling ReplenishmentsApi#postProductLabels");
        e.printStackTrace();
        }
```

### Parameters

 Name     | Type                                                | Description | Notes      
----------|-----------------------------------------------------|-------------|------------
 **body** | [**ProductLabelsRequest**](ProductLabelsRequest.md) |             | [optional] 

### Return type

**List&lt;byte[]&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/vnd.retailer.v8+json
- **Accept**: application/vnd.retailer.v8+pdf

<a name="postReplenishment"></a>

# **postReplenishment**

> ProcessStatus postReplenishment(body)

Create a replenishment

Creates a replenishment.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReplenishmentsApi;


ReplenishmentsApi apiInstance=new ReplenishmentsApi();
        CreateReplenishmentRequest body=new CreateReplenishmentRequest(); // CreateReplenishmentRequest | 
        try{
        ProcessStatus result=apiInstance.postReplenishment(body);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling ReplenishmentsApi#postReplenishment");
        e.printStackTrace();
        }
```

### Parameters

 Name     | Type                                                            | Description | Notes      
----------|-----------------------------------------------------------------|-------------|------------
 **body** | [**CreateReplenishmentRequest**](CreateReplenishmentRequest.md) |             | [optional] 

### Return type

[**ProcessStatus**](ProcessStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/vnd.retailer.v8+json
- **Accept**: application/vnd.retailer.v8+json

<a name="postRequestProductDestinations"></a>

# **postRequestProductDestinations**

> ProcessStatus postRequestProductDestinations(body)

Request product destinations

Requests a list of product destinations by EANs.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReplenishmentsApi;


ReplenishmentsApi apiInstance=new ReplenishmentsApi();
        RequestProductDestinationsRequest body=new RequestProductDestinationsRequest(); // RequestProductDestinationsRequest | 
        try{
        ProcessStatus result=apiInstance.postRequestProductDestinations(body);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling ReplenishmentsApi#postRequestProductDestinations");
        e.printStackTrace();
        }
```

### Parameters

 Name     | Type                                                                          | Description | Notes      
----------|-------------------------------------------------------------------------------|-------------|------------
 **body** | [**RequestProductDestinationsRequest**](RequestProductDestinationsRequest.md) |             | [optional] 

### Return type

[**ProcessStatus**](ProcessStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/vnd.retailer.v8+json
- **Accept**: application/vnd.retailer.v8+json

<a name="putReplenishment"></a>

# **putReplenishment**

> ProcessStatus putReplenishment(replenishmentId, body)

Update a replenishment by replenishment id

Updates a replenishment.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReplenishmentsApi;


ReplenishmentsApi apiInstance=new ReplenishmentsApi();
        String replenishmentId="2312078154"; // String | The unique identifier of the replenishment.
        UpdateReplenishmentRequest body=new UpdateReplenishmentRequest(); // UpdateReplenishmentRequest | 
        try{
        ProcessStatus result=apiInstance.putReplenishment(replenishmentId,body);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling ReplenishmentsApi#putReplenishment");
        e.printStackTrace();
        }
```

### Parameters

 Name                | Type                                                            | Description                                 | Notes      
---------------------|-----------------------------------------------------------------|---------------------------------------------|------------
 **replenishmentId** | **String**                                                      | The unique identifier of the replenishment. |
 **body**            | [**UpdateReplenishmentRequest**](UpdateReplenishmentRequest.md) |                                             | [optional] 

### Return type

[**ProcessStatus**](ProcessStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/vnd.retailer.v8+json
- **Accept**: application/vnd.retailer.v8+json

