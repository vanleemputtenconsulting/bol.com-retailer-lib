# ProductContentApi

All URIs are relative to *https://api.bol.com*

 Method                                                                      | HTTP request                                        | Description                        
-----------------------------------------------------------------------------|-----------------------------------------------------|------------------------------------
 [**getCatalogProduct**](ProductContentApi.md#getCatalogProduct)             | **GET** /retailer/content/catalog-products/{ean}    | Get catalog product details by EAN 
 [**getChunkRecommendations**](ProductContentApi.md#getChunkRecommendations) | **POST** /retailer/content/chunk-recommendations    | Get chunk recommendations          
 [**getUploadReport**](ProductContentApi.md#getUploadReport)                 | **GET** /retailer/content/upload-report/{upload-id} | Get an upload report by upload id  
 [**postProductContent**](ProductContentApi.md#postProductContent)           | **POST** /retailer/content/products                 | Create content for a product       

<a name="getCatalogProduct"></a>

# **getCatalogProduct**

> CatalogProduct getCatalogProduct(ean, acceptLanguage)

Get catalog product details by EAN

Gets the details of a catalog product by means of its EAN.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductContentApi;


ProductContentApi apiInstance=new ProductContentApi();
        String ean="0000007740404"; // String | The EAN number associated with this product.
        String acceptLanguage="nl"; // String | The language in which the catalog product details will be retrieved.
        try{
        CatalogProduct result=apiInstance.getCatalogProduct(ean,acceptLanguage);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling ProductContentApi#getCatalogProduct");
        e.printStackTrace();
        }
```

### Parameters

 Name               | Type       | Description                                                          | Notes                      
--------------------|------------|----------------------------------------------------------------------|----------------------------
 **ean**            | **String** | The EAN number associated with this product.                         |
 **acceptLanguage** | **String** | The language in which the catalog product details will be retrieved. | [optional] [default to nl] 

### Return type

[**CatalogProduct**](CatalogProduct.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+json

<a name="getChunkRecommendations"></a>

# **getChunkRecommendations**

> ChunkRecommendationsResponse getChunkRecommendations(body)

Get chunk recommendations

Gets a selected number of recommendations for a product.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductContentApi;


ProductContentApi apiInstance=new ProductContentApi();
        ChunkRecommendationsRequest body=new ChunkRecommendationsRequest(); // ChunkRecommendationsRequest | 
        try{
        ChunkRecommendationsResponse result=apiInstance.getChunkRecommendations(body);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling ProductContentApi#getChunkRecommendations");
        e.printStackTrace();
        }
```

### Parameters

 Name     | Type                                                              | Description | Notes      
----------|-------------------------------------------------------------------|-------------|------------
 **body** | [**ChunkRecommendationsRequest**](ChunkRecommendationsRequest.md) |             | [optional] 

### Return type

[**ChunkRecommendationsResponse**](ChunkRecommendationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/vnd.retailer.v8+json
- **Accept**: application/vnd.retailer.v8+json

<a name="getUploadReport"></a>

# **getUploadReport**

> UploadReportResponse getUploadReport(uploadId)

Get an upload report by upload id

Gets the upload report of the product content submitted by upload id.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductContentApi;


ProductContentApi apiInstance=new ProductContentApi();
        String uploadId="uploadId_example"; // String | The identifier of the upload report.
        try{
        UploadReportResponse result=apiInstance.getUploadReport(uploadId);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling ProductContentApi#getUploadReport");
        e.printStackTrace();
        }
```

### Parameters

 Name         | Type       | Description                          | Notes 
--------------|------------|--------------------------------------|-------
 **uploadId** | **String** | The identifier of the upload report. |

### Return type

[**UploadReportResponse**](UploadReportResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+json

<a name="postProductContent"></a>

# **postProductContent**

> ProcessStatus postProductContent(body)

Create content for a product

Create content for an existing product.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductContentApi;


ProductContentApi apiInstance=new ProductContentApi();
        CreateProductContentSingleRequest body=new CreateProductContentSingleRequest(); // CreateProductContentSingleRequest | 
        try{
        ProcessStatus result=apiInstance.postProductContent(body);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling ProductContentApi#postProductContent");
        e.printStackTrace();
        }
```

### Parameters

 Name     | Type                                                                          | Description | Notes      
----------|-------------------------------------------------------------------------------|-------------|------------
 **body** | [**CreateProductContentSingleRequest**](CreateProductContentSingleRequest.md) |             | [optional] 

### Return type

[**ProcessStatus**](ProcessStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/vnd.retailer.v8+json
- **Accept**: application/vnd.retailer.v8+json

