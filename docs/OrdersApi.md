# OrdersApi

All URIs are relative to *https://api.bol.com*

 Method                                              | HTTP request                          | Description                              
-----------------------------------------------------|---------------------------------------|------------------------------------------
 [**cancelOrderItem**](OrdersApi.md#cancelOrderItem) | **PUT** /retailer/orders/cancellation | Cancel an order item by an order item id 
 [**getOrder**](OrdersApi.md#getOrder)               | **GET** /retailer/orders/{order-id}   | Get an order by order id                 
 [**getOrders**](OrdersApi.md#getOrders)             | **GET** /retailer/orders              | Get a list of orders                     
 [**shipOrderItem**](OrdersApi.md#shipOrderItem)     | **PUT** /retailer/orders/shipment     | Ship order item                          

<a name="cancelOrderItem"></a>

# **cancelOrderItem**

> ProcessStatus cancelOrderItem(body)

Cancel an order item by an order item id

This endpoint can be used to either confirm a cancellation request by the customer or to cancel an order item you
yourself are unable to fulfil.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrdersApi;


OrdersApi apiInstance=new OrdersApi();
        ContainerForTheOrderItemsThatHaveToBeCancelled_ body=new ContainerForTheOrderItemsThatHaveToBeCancelled_(); // ContainerForTheOrderItemsThatHaveToBeCancelled_ | 
        try{
        ProcessStatus result=apiInstance.cancelOrderItem(body);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling OrdersApi#cancelOrderItem");
        e.printStackTrace();
        }
```

### Parameters

 Name     | Type                                                                                                      | Description | Notes      
----------|-----------------------------------------------------------------------------------------------------------|-------------|------------
 **body** | [**ContainerForTheOrderItemsThatHaveToBeCancelled_**](ContainerForTheOrderItemsThatHaveToBeCancelled_.md) |             | [optional] 

### Return type

[**ProcessStatus**](ProcessStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/vnd.retailer.v8+json
- **Accept**: application/vnd.retailer.v8+json

<a name="getOrder"></a>

# **getOrder**

> Order getOrder(orderId)

Get an order by order id

Gets an order by order id. The order can be partially shipped or cancelled, and the message contains the quantity
shipped or cancelled items. The unitPrice takes account of volume discounts.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrdersApi;


OrdersApi apiInstance=new OrdersApi();
        String orderId="orderId_example"; // String | The id of the order to get.
        try{
        Order result=apiInstance.getOrder(orderId);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling OrdersApi#getOrder");
        e.printStackTrace();
        }
```

### Parameters

 Name        | Type       | Description                 | Notes 
-------------|------------|-----------------------------|-------
 **orderId** | **String** | The id of the order to get. |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+json

<a name="getOrders"></a>

# **getOrders**

> ReducedOrders getOrders(page, fulfilmentMethod, status, changeIntervalMinute, latestChangeDate)

Get a list of orders

Gets a paginated list of all orders for a retailer.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrdersApi;


OrdersApi apiInstance=new OrdersApi();
        Integer page=1; // Integer | The requested page number with a page size of 50 items.
        String fulfilmentMethod="FBR"; // String | Fulfilled by the retailer (FBR) or fulfilled by bol.com (FBB). In order to retrieve both FBR and FBB orders, ALL can be used as a parameter.
        String status="OPEN"; // String | To filter on order status. You can filter on either all orders independent from their status, open orders (excluding shipped and cancelled orders), and shipped orders.
        Integer changeIntervalMinute=56; // Integer | To filter on the period in minutes during which the latest change was performed on an order item.
        String latestChangeDate="latestChangeDate_example"; // String | To filter on the date on which the latest change was performed on an order item. Up to 3 months of history is supported.
        try{
        ReducedOrders result=apiInstance.getOrders(page,fulfilmentMethod,status,changeIntervalMinute,latestChangeDate);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling OrdersApi#getOrders");
        e.printStackTrace();
        }
```

### Parameters

 Name                     | Type        | Description                                                                                                                                                             | Notes                                                   
--------------------------|-------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------
 **page**                 | **Integer** | The requested page number with a page size of 50 items.                                                                                                                 | [optional] [default to 1]                               
 **fulfilmentMethod**     | **String**  | Fulfilled by the retailer (FBR) or fulfilled by bol.com (FBB). In order to retrieve both FBR and FBB orders, ALL can be used as a parameter.                            | [optional] [default to FBR] [enum: FBR, FBB, ALL]       
 **status**               | **String**  | To filter on order status. You can filter on either all orders independent from their status, open orders (excluding shipped and cancelled orders), and shipped orders. | [optional] [default to OPEN] [enum: OPEN, SHIPPED, ALL] 
 **changeIntervalMinute** | **Integer** | To filter on the period in minutes during which the latest change was performed on an order item.                                                                       | [optional]                                              
 **latestChangeDate**     | **String**  | To filter on the date on which the latest change was performed on an order item. Up to 3 months of history is supported.                                                | [optional]                                              

### Return type

[**ReducedOrders**](ReducedOrders.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+json

<a name="shipOrderItem"></a>

# **shipOrderItem**

> ProcessStatus shipOrderItem(body)

Ship order item

Ship a single order item within a customer order by providing shipping information. If you purchased a shipping label
you should add the shippingLabelId to this message and leave the transport element empty. If you will ship the item
using your own transporter method you must omit the shippingLabelId entirely and fill in the transport element with the
fields from GET shipping labels.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrdersApi;


OrdersApi apiInstance=new OrdersApi();
        ShipmentRequest body=new ShipmentRequest(); // ShipmentRequest | 
        try{
        ProcessStatus result=apiInstance.shipOrderItem(body);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling OrdersApi#shipOrderItem");
        e.printStackTrace();
        }
```

### Parameters

 Name     | Type                                      | Description | Notes      
----------|-------------------------------------------|-------------|------------
 **body** | [**ShipmentRequest**](ShipmentRequest.md) |             | [optional] 

### Return type

[**ProcessStatus**](ProcessStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/vnd.retailer.v8+json
- **Accept**: application/vnd.retailer.v8+json

