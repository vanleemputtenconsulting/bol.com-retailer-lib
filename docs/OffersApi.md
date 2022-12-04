# OffersApi

All URIs are relative to *https://api.bol.com*

 Method                                                                    | HTTP request                                     | Description                                       
---------------------------------------------------------------------------|--------------------------------------------------|---------------------------------------------------
 [**deleteOffer**](OffersApi.md#deleteOffer)                               | **DELETE** /retailer/offers/{offer-id}           | Delete offer by id                                
 [**getOffer**](OffersApi.md#getOffer)                                     | **GET** /retailer/offers/{offer-id}              | Retrieve an offer by its offer id                 
 [**getOfferExport**](OffersApi.md#getOfferExport)                         | **GET** /retailer/offers/export/{report-id}      | Retrieve an offer export file by offer export id  
 [**getUnpublishedOfferReport**](OffersApi.md#getUnpublishedOfferReport)   | **GET** /retailer/offers/unpublished/{report-id} | Retrieve an unpublished offer report by report id 
 [**postOffer**](OffersApi.md#postOffer)                                   | **POST** /retailer/offers                        | Create a new offer                                
 [**postOfferExport**](OffersApi.md#postOfferExport)                       | **POST** /retailer/offers/export                 | Request an offer export file                      
 [**postUnpublishedOfferReport**](OffersApi.md#postUnpublishedOfferReport) | **POST** /retailer/offers/unpublished            | Request an unpublished offer report               
 [**putOffer**](OffersApi.md#putOffer)                                     | **PUT** /retailer/offers/{offer-id}              | Update an offer                                   
 [**updateOfferPrice**](OffersApi.md#updateOfferPrice)                     | **PUT** /retailer/offers/{offer-id}/price        | Update price(s) for offer by id                   
 [**updateOfferStock**](OffersApi.md#updateOfferStock)                     | **PUT** /retailer/offers/{offer-id}/stock        | Update stock for offer by id                      

<a name="deleteOffer"></a>

# **deleteOffer**

> ProcessStatus deleteOffer(offerId)

Delete offer by id

Delete an offer by id.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OffersApi;


OffersApi apiInstance=new OffersApi();
        String offerId="offerId_example"; // String | Unique identifier for an offer.
        try{
        ProcessStatus result=apiInstance.deleteOffer(offerId);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling OffersApi#deleteOffer");
        e.printStackTrace();
        }
```

### Parameters

 Name        | Type       | Description                     | Notes 
-------------|------------|---------------------------------|-------
 **offerId** | **String** | Unique identifier for an offer. |

### Return type

[**ProcessStatus**](ProcessStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+json

<a name="getOffer"></a>

# **getOffer**

> RetailerOffer getOffer(offerId)

Retrieve an offer by its offer id

Retrieve an offer by using the offer id provided to you when creating or listing your offers.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OffersApi;


OffersApi apiInstance=new OffersApi();
        String offerId="offerId_example"; // String | Unique identifier for an offer.
        try{
        RetailerOffer result=apiInstance.getOffer(offerId);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling OffersApi#getOffer");
        e.printStackTrace();
        }
```

### Parameters

 Name        | Type       | Description                     | Notes 
-------------|------------|---------------------------------|-------
 **offerId** | **String** | Unique identifier for an offer. |

### Return type

[**RetailerOffer**](RetailerOffer.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+json

<a name="getOfferExport"></a>

# **getOfferExport**

> getOfferExport(reportId)

Retrieve an offer export file by offer export id

Retrieve an offer export file containing all offers.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OffersApi;


OffersApi apiInstance=new OffersApi();
        String reportId="reportId_example"; // String | Unique identifier for an offer export report.
        try{
        apiInstance.getOfferExport(reportId);
        }catch(ApiException e){
        System.err.println("Exception when calling OffersApi#getOfferExport");
        e.printStackTrace();
        }
```

### Parameters

 Name         | Type       | Description                                   | Notes 
--------------|------------|-----------------------------------------------|-------
 **reportId** | **String** | Unique identifier for an offer export report. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+csv

<a name="getUnpublishedOfferReport"></a>

# **getUnpublishedOfferReport**

> getUnpublishedOfferReport(reportId)

Retrieve an unpublished offer report by report id

Retrieve an unpublished offer report containing all unpublished offers and reasons.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OffersApi;


OffersApi apiInstance=new OffersApi();
        String reportId="reportId_example"; // String | Unique identifier for unpublished offer report.
        try{
        apiInstance.getUnpublishedOfferReport(reportId);
        }catch(ApiException e){
        System.err.println("Exception when calling OffersApi#getUnpublishedOfferReport");
        e.printStackTrace();
        }
```

### Parameters

 Name         | Type       | Description                                     | Notes 
--------------|------------|-------------------------------------------------|-------
 **reportId** | **String** | Unique identifier for unpublished offer report. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+csv

<a name="postOffer"></a>

# **postOffer**

> ProcessStatus postOffer(body)

Create a new offer

Creates a new offer, and adds it to the catalog. After creation, status information can be retrieved to review if the
offer is valid and published to the shop.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OffersApi;


OffersApi apiInstance=new OffersApi();
        CreateOfferRequest body=new CreateOfferRequest(); // CreateOfferRequest | 
        try{
        ProcessStatus result=apiInstance.postOffer(body);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling OffersApi#postOffer");
        e.printStackTrace();
        }
```

### Parameters

 Name     | Type                                            | Description | Notes      
----------|-------------------------------------------------|-------------|------------
 **body** | [**CreateOfferRequest**](CreateOfferRequest.md) |             | [optional] 

### Return type

[**ProcessStatus**](ProcessStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/vnd.retailer.v8+json
- **Accept**: application/vnd.retailer.v8+json

<a name="postOfferExport"></a>

# **postOfferExport**

> ProcessStatus postOfferExport(body)

Request an offer export file

Request an offer export file containing all offers.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OffersApi;


OffersApi apiInstance=new OffersApi();
        CreateOfferExportRequest body=new CreateOfferExportRequest(); // CreateOfferExportRequest | 
        try{
        ProcessStatus result=apiInstance.postOfferExport(body);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling OffersApi#postOfferExport");
        e.printStackTrace();
        }
```

### Parameters

 Name     | Type                                                        | Description | Notes      
----------|-------------------------------------------------------------|-------------|------------
 **body** | [**CreateOfferExportRequest**](CreateOfferExportRequest.md) |             | [optional] 

### Return type

[**ProcessStatus**](ProcessStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/vnd.retailer.v8+json
- **Accept**: application/vnd.retailer.v8+json

<a name="postUnpublishedOfferReport"></a>

# **postUnpublishedOfferReport**

> ProcessStatus postUnpublishedOfferReport(body)

Request an unpublished offer report

Request an unpublished offer report containing all unpublished offers and reasons.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OffersApi;


OffersApi apiInstance=new OffersApi();
        CreateUnpublishedOfferReportRequest body=new CreateUnpublishedOfferReportRequest(); // CreateUnpublishedOfferReportRequest | 
        try{
        ProcessStatus result=apiInstance.postUnpublishedOfferReport(body);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling OffersApi#postUnpublishedOfferReport");
        e.printStackTrace();
        }
```

### Parameters

 Name     | Type                                                                              | Description | Notes      
----------|-----------------------------------------------------------------------------------|-------------|------------
 **body** | [**CreateUnpublishedOfferReportRequest**](CreateUnpublishedOfferReportRequest.md) |             | [optional] 

### Return type

[**ProcessStatus**](ProcessStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/vnd.retailer.v8+json
- **Accept**: application/vnd.retailer.v8+json

<a name="putOffer"></a>

# **putOffer**

> ProcessStatus putOffer(offerId, body)

Update an offer

Use this endpoint to send an offer update. This endpoint returns a process status.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OffersApi;


OffersApi apiInstance=new OffersApi();
        String offerId="offerId_example"; // String | Unique identifier for an offer.
        UpdateOfferRequest body=new UpdateOfferRequest(); // UpdateOfferRequest | 
        try{
        ProcessStatus result=apiInstance.putOffer(offerId,body);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling OffersApi#putOffer");
        e.printStackTrace();
        }
```

### Parameters

 Name        | Type                                            | Description                     | Notes      
-------------|-------------------------------------------------|---------------------------------|------------
 **offerId** | **String**                                      | Unique identifier for an offer. |
 **body**    | [**UpdateOfferRequest**](UpdateOfferRequest.md) |                                 | [optional] 

### Return type

[**ProcessStatus**](ProcessStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/vnd.retailer.v8+json
- **Accept**: application/vnd.retailer.v8+json

<a name="updateOfferPrice"></a>

# **updateOfferPrice**

> ProcessStatus updateOfferPrice(offerId, body)

Update price(s) for offer by id

Update price(s) for offer by id.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OffersApi;


OffersApi apiInstance=new OffersApi();
        String offerId="offerId_example"; // String | Unique identifier for an offer.
        UpdateOfferPriceRequest body=new UpdateOfferPriceRequest(); // UpdateOfferPriceRequest | 
        try{
        ProcessStatus result=apiInstance.updateOfferPrice(offerId,body);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling OffersApi#updateOfferPrice");
        e.printStackTrace();
        }
```

### Parameters

 Name        | Type                                                      | Description                     | Notes      
-------------|-----------------------------------------------------------|---------------------------------|------------
 **offerId** | **String**                                                | Unique identifier for an offer. |
 **body**    | [**UpdateOfferPriceRequest**](UpdateOfferPriceRequest.md) |                                 | [optional] 

### Return type

[**ProcessStatus**](ProcessStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/vnd.retailer.v8+json
- **Accept**: application/vnd.retailer.v8+json

<a name="updateOfferStock"></a>

# **updateOfferStock**

> ProcessStatus updateOfferStock(offerId, body)

Update stock for offer by id

Update stock for offer by id.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OffersApi;


OffersApi apiInstance=new OffersApi();
        String offerId="offerId_example"; // String | Unique identifier for an offer.
        UpdateOfferStockRequest body=new UpdateOfferStockRequest(); // UpdateOfferStockRequest | 
        try{
        ProcessStatus result=apiInstance.updateOfferStock(offerId,body);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling OffersApi#updateOfferStock");
        e.printStackTrace();
        }
```

### Parameters

 Name        | Type                                                      | Description                     | Notes      
-------------|-----------------------------------------------------------|---------------------------------|------------
 **offerId** | **String**                                                | Unique identifier for an offer. |
 **body**    | [**UpdateOfferStockRequest**](UpdateOfferStockRequest.md) |                                 | [optional] 

### Return type

[**ProcessStatus**](ProcessStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/vnd.retailer.v8+json
- **Accept**: application/vnd.retailer.v8+json

