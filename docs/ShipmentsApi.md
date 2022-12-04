# ShipmentsApi

All URIs are relative to *https://api.bol.com*

 Method                                           | HTTP request                              | Description                   
--------------------------------------------------|-------------------------------------------|-------------------------------
 [**getShipment**](ShipmentsApi.md#getShipment)   | **GET** /retailer/shipments/{shipment-id} | Get a shipment by shipment id 
 [**getShipments**](ShipmentsApi.md#getShipments) | **GET** /retailer/shipments               | Get shipment list             

<a name="getShipment"></a>

# **getShipment**

> Shipment getShipment(shipmentId)

Get a shipment by shipment id

Retrieve a single shipment by its corresponding id.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ShipmentsApi;


ShipmentsApi apiInstance=new ShipmentsApi();
        String shipmentId="shipmentId_example"; // String | The id of the shipment.
        try{
        Shipment result=apiInstance.getShipment(shipmentId);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling ShipmentsApi#getShipment");
        e.printStackTrace();
        }
```

### Parameters

 Name           | Type       | Description             | Notes 
----------------|------------|-------------------------|-------
 **shipmentId** | **String** | The id of the shipment. |

### Return type

[**Shipment**](Shipment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+json

<a name="getShipments"></a>

# **getShipments**

> ShipmentsResponse getShipments(page, fulfilmentMethod, orderId)

Get shipment list

A paginated list to retrieve all your shipments up to 3 months old. The shipments will be sorted by date in descending
order.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ShipmentsApi;


ShipmentsApi apiInstance=new ShipmentsApi();
        Integer page=1; // Integer | The page to get with a page size of 50.
        String fulfilmentMethod="FBR"; // String | The fulfilment method. Fulfilled by the retailer (FBR) or fulfilled by bol.com (FBB).
        String orderId="orderId_example"; // String | The id of the order. Only valid without fulfilment-method. The default fulfilment-method is ignored.
        try{
        ShipmentsResponse result=apiInstance.getShipments(page,fulfilmentMethod,orderId);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling ShipmentsApi#getShipments");
        e.printStackTrace();
        }
```

### Parameters

 Name                 | Type        | Description                                                                                          | Notes                                        
----------------------|-------------|------------------------------------------------------------------------------------------------------|----------------------------------------------
 **page**             | **Integer** | The page to get with a page size of 50.                                                              | [optional] [default to 1]                    
 **fulfilmentMethod** | **String**  | The fulfilment method. Fulfilled by the retailer (FBR) or fulfilled by bol.com (FBB).                | [optional] [default to FBR] [enum: FBR, FBB] 
 **orderId**          | **String**  | The id of the order. Only valid without fulfilment-method. The default fulfilment-method is ignored. | [optional]                                   

### Return type

[**ShipmentsResponse**](ShipmentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+json

