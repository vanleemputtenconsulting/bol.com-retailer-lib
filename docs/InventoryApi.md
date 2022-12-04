# InventoryApi

All URIs are relative to *https://api.bol.com*

 Method                                           | HTTP request                | Description           
--------------------------------------------------|-----------------------------|-----------------------
 [**getInventory**](InventoryApi.md#getInventory) | **GET** /retailer/inventory | Get LVB/FBB inventory 

<a name="getInventory"></a>

# **getInventory**

> InventoryResponse getInventory(page, quantity, stock, state, query)

Get LVB/FBB inventory

The inventory endpoint is a specific LVB/FBB endpoint. It provides a paginated list containing your fulfilment by
bol.com inventory. This endpoint does not provide information about your own stock.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InventoryApi;


InventoryApi apiInstance=new InventoryApi();
        Integer page=1; // Integer | The requested page number with a page size of 50 items.
        List<String> quantity=Arrays.asList("0-10,20-30"); // List<String> | Filter inventory by providing a range of quantity (min-range)-(max-range). Note that if no state query is submitted in the same request, then the quantity will be filtered on regularStock by default.
        String stock="SUFFICIENT"; // String | Filter inventory by stock level.
        String state="REGULAR"; // String | Filter inventory by stock type.
        String query="0000007740404"; // String | Filter inventory by EAN or product title.
        try{
        InventoryResponse result=apiInstance.getInventory(page,quantity,stock,state,query);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling InventoryApi#getInventory");
        e.printStackTrace();
        }
```

### Parameters

 Name         | Type                                | Description                                                                                                                                                                                             | Notes                                       
--------------|-------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------
 **page**     | **Integer**                         | The requested page number with a page size of 50 items.                                                                                                                                                 | [optional] [default to 1]                   
 **quantity** | [**List&lt;String&gt;**](String.md) | Filter inventory by providing a range of quantity (min-range)-(max-range). Note that if no state query is submitted in the same request, then the quantity will be filtered on regularStock by default. | [optional]                                  
 **stock**    | **String**                          | Filter inventory by stock level.                                                                                                                                                                        | [optional] [enum: SUFFICIENT, INSUFFICIENT] 
 **state**    | **String**                          | Filter inventory by stock type.                                                                                                                                                                         | [optional] [enum: REGULAR, GRADED]          
 **query**    | **String**                          | Filter inventory by EAN or product title.                                                                                                                                                               | [optional]                                  

### Return type

[**InventoryResponse**](InventoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+json

