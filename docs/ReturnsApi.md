# ReturnsApi

All URIs are relative to *https://api.bol.com*

 Method                                         | HTTP request                          | Description               
------------------------------------------------|---------------------------------------|---------------------------
 [**createReturn**](ReturnsApi.md#createReturn) | **POST** /retailer/returns            | Create a return           
 [**getReturn**](ReturnsApi.md#getReturn)       | **GET** /retailer/returns/{return-id} | Get a return by return id 
 [**getReturns**](ReturnsApi.md#getReturns)     | **GET** /retailer/returns             | Get returns               
 [**handleReturn**](ReturnsApi.md#handleReturn) | **PUT** /retailer/returns/{rma-id}    | Handle a return by rma id 

<a name="createReturn"></a>

# **createReturn**

> ProcessStatus createReturn(body)

Create a return

Create a return, and automatically handle it with the provided handling result. When successfully created, the resulting
return id is provided in the process status.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReturnsApi;


ReturnsApi apiInstance=new ReturnsApi();
        CreateReturnRequest body=new CreateReturnRequest(); // CreateReturnRequest | 
        try{
        ProcessStatus result=apiInstance.createReturn(body);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling ReturnsApi#createReturn");
        e.printStackTrace();
        }
```

### Parameters

 Name     | Type                                              | Description | Notes      
----------|---------------------------------------------------|-------------|------------
 **body** | [**CreateReturnRequest**](CreateReturnRequest.md) |             | [optional] 

### Return type

[**ProcessStatus**](ProcessStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+json

<a name="getReturn"></a>

# **getReturn**

> ModelReturn getReturn(returnId)

Get a return by return id

Retrieve a return based on the return id.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReturnsApi;


ReturnsApi apiInstance=new ReturnsApi();
        String returnId="returnId_example"; // String | Unique identifier for a return.
        try{
        ModelReturn result=apiInstance.getReturn(returnId);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling ReturnsApi#getReturn");
        e.printStackTrace();
        }
```

### Parameters

 Name         | Type       | Description                     | Notes 
--------------|------------|---------------------------------|-------
 **returnId** | **String** | Unique identifier for a return. |

### Return type

[**ModelReturn**](ModelReturn.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+json

<a name="getReturns"></a>

# **getReturns**

> ReturnsResponse getReturns(page, handled, fulfilmentMethod)

Get returns

Get a paginated list of multi-item returns. Handled returns are sorted by date in descending order, while unhandled
returns are sorted by date in ascending order.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReturnsApi;


ReturnsApi apiInstance=new ReturnsApi();
        Integer page=1; // Integer | The page to get with a page size of 50.
        Boolean handled=true; // Boolean | The status of the returns you wish to see, shows either handled or unhandled returns.
        String fulfilmentMethod="FBR"; // String | The fulfilment method. Fulfilled by the retailer (FBR) or fulfilled by bol.com (FBB).
        try{
        ReturnsResponse result=apiInstance.getReturns(page,handled,fulfilmentMethod);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling ReturnsApi#getReturns");
        e.printStackTrace();
        }
```

### Parameters

 Name                 | Type        | Description                                                                           | Notes                                        
----------------------|-------------|---------------------------------------------------------------------------------------|----------------------------------------------
 **page**             | **Integer** | The page to get with a page size of 50.                                               | [optional] [default to 1]                    
 **handled**          | **Boolean** | The status of the returns you wish to see, shows either handled or unhandled returns. | [optional]                                   
 **fulfilmentMethod** | **String**  | The fulfilment method. Fulfilled by the retailer (FBR) or fulfilled by bol.com (FBB). | [optional] [default to FBR] [enum: FBR, FBB] 

### Return type

[**ReturnsResponse**](ReturnsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+json

<a name="handleReturn"></a>

# **handleReturn**

> ProcessStatus handleReturn(rmaId, body)

Handle a return by rma id

Allows the user to handle a return. This can be to either handle an open return, or change the handlingResult of an
already handled return. Please refer to the Returns documentation for further details.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReturnsApi;


ReturnsApi apiInstance=new ReturnsApi();
        Long rmaId=789L; // Long | The RMA (Return Merchandise Authorization) identifier of the return.
        ReturnRequest body=new ReturnRequest(); // ReturnRequest | The handling result requested by the retailer.
        try{
        ProcessStatus result=apiInstance.handleReturn(rmaId,body);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling ReturnsApi#handleReturn");
        e.printStackTrace();
        }
```

### Parameters

 Name      | Type                                  | Description                                                          | Notes      
-----------|---------------------------------------|----------------------------------------------------------------------|------------
 **rmaId** | **Long**                              | The RMA (Return Merchandise Authorization) identifier of the return. |
 **body**  | [**ReturnRequest**](ReturnRequest.md) | The handling result requested by the retailer.                       | [optional] 

### Return type

[**ProcessStatus**](ProcessStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/vnd.retailer.v8+json
- **Accept**: application/vnd.retailer.v8+json

