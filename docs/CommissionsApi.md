# CommissionsApi

All URIs are relative to *https://api.bol.com*

 Method                                                 | HTTP request                       | Description                                              
--------------------------------------------------------|------------------------------------|----------------------------------------------------------
 [**getCommission**](CommissionsApi.md#getCommission)   | **GET** /retailer/commission/{ean} | Get all commissions and reductions by EAN per single EAN 
 [**getCommissions**](CommissionsApi.md#getCommissions) | **POST** /retailer/commission      | Get all commissions and reductions by EAN in bulk        

<a name="getCommission"></a>

# **getCommission**

> Commission getCommission(ean, unitPrice, condition)

Get all commissions and reductions by EAN per single EAN

Commissions can be filtered by condition, which defaults to NEW. We will calculate the commission amount from the EAN
and price.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CommissionsApi;


CommissionsApi apiInstance=new CommissionsApi();
        String ean="0000007740404"; // String | The EAN number associated with this product.
        BigDecimal unitPrice=new BigDecimal(); // BigDecimal | The price of the product with a period as a decimal separator. The price should always have two decimals precision.
        String condition="NEW"; // String | The condition of the offer.
        try{
        Commission result=apiInstance.getCommission(ean,unitPrice,condition);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling CommissionsApi#getCommission");
        e.printStackTrace();
        }
```

### Parameters

 Name          | Type           | Description                                                                                                         | Notes                                                                       
---------------|----------------|---------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------
 **ean**       | **String**     | The EAN number associated with this product.                                                                        |
 **unitPrice** | **BigDecimal** | The price of the product with a period as a decimal separator. The price should always have two decimals precision. |
 **condition** | **String**     | The condition of the offer.                                                                                         | [optional] [default to NEW] [enum: NEW, AS_NEW, GOOD, REASONABLE, MODERATE] 

### Return type

[**Commission**](Commission.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+json

<a name="getCommissions"></a>

# **getCommissions**

> BulkCommissionResponse getCommissions(body)

Get all commissions and reductions by EAN in bulk

Gets all commissions and possible reductions by EAN, price, and optionally condition.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CommissionsApi;


CommissionsApi apiInstance=new CommissionsApi();
        BulkCommissionRequest body=new BulkCommissionRequest(); // BulkCommissionRequest | 
        try{
        BulkCommissionResponse result=apiInstance.getCommissions(body);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling CommissionsApi#getCommissions");
        e.printStackTrace();
        }
```

### Parameters

 Name     | Type                                                  | Description | Notes      
----------|-------------------------------------------------------|-------------|------------
 **body** | [**BulkCommissionRequest**](BulkCommissionRequest.md) |             | [optional] 

### Return type

[**BulkCommissionResponse**](BulkCommissionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/vnd.retailer.v8+json
- **Accept**: application/vnd.retailer.v8+json

