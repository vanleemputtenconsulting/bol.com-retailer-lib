# PromotionsApi

All URIs are relative to *https://api.bol.com*

 Method                                              | HTTP request                                         | Description                     
-----------------------------------------------------|------------------------------------------------------|---------------------------------
 [**getProducts**](PromotionsApi.md#getProducts)     | **GET** /retailer/promotions/{promotion-id}/products | Get a list of products          
 [**getPromotion**](PromotionsApi.md#getPromotion)   | **GET** /retailer/promotions/{promotion-id}          | Get a promotion by promotion id 
 [**getPromotions**](PromotionsApi.md#getPromotions) | **GET** /retailer/promotions                         | Get a list of promotions        

<a name="getProducts"></a>

# **getProducts**

> Products getProducts(promotionId, page)

Get a list of products

Gets a paginated list of all products that are present within a promotion.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PromotionsApi;


PromotionsApi apiInstance=new PromotionsApi();
        String promotionId="promotionId_example"; // String | The identifier of the promotion.
        Integer page=1; // Integer | The requested page number with a page size of 50 items.
        try{
        Products result=apiInstance.getProducts(promotionId,page);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling PromotionsApi#getProducts");
        e.printStackTrace();
        }
```

### Parameters

 Name            | Type        | Description                                             | Notes                     
-----------------|-------------|---------------------------------------------------------|---------------------------
 **promotionId** | **String**  | The identifier of the promotion.                        |
 **page**        | **Integer** | The requested page number with a page size of 50 items. | [optional] [default to 1] 

### Return type

[**Products**](Products.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+json

<a name="getPromotion"></a>

# **getPromotion**

> Promotion getPromotion(promotionId)

Get a promotion by promotion id

Gets the details of a promotion.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PromotionsApi;


PromotionsApi apiInstance=new PromotionsApi();
        String promotionId="promotionId_example"; // String | The identifier of the promotion.
        try{
        Promotion result=apiInstance.getPromotion(promotionId);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling PromotionsApi#getPromotion");
        e.printStackTrace();
        }
```

### Parameters

 Name            | Type       | Description                      | Notes 
-----------------|------------|----------------------------------|-------
 **promotionId** | **String** | The identifier of the promotion. |

### Return type

[**Promotion**](Promotion.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+json

<a name="getPromotions"></a>

# **getPromotions**

> Promotions getPromotions(promotionType, page)

Get a list of promotions

Gets a paginated list of all promotions for a retailer.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PromotionsApi;


PromotionsApi apiInstance=new PromotionsApi();
        List<String> promotionType=Arrays.asList("promotionType_example"); // List<String> | The type(s) of promotion to be retrieved.
        Integer page=1; // Integer | The requested page number with a page size of 50 items.
        try{
        Promotions result=apiInstance.getPromotions(promotionType,page);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling PromotionsApi#getPromotions");
        e.printStackTrace();
        }
```

### Parameters

 Name              | Type                                | Description                                             | Notes                        
-------------------|-------------------------------------|---------------------------------------------------------|------------------------------
 **promotionType** | [**List&lt;String&gt;**](String.md) | The type(s) of promotion to be retrieved.               | [enum: AWARENESS, PRICE_OFF] 
 **page**          | **Integer**                         | The requested page number with a page size of 50 items. | [optional] [default to 1]    

### Return type

[**Promotions**](Promotions.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+json

