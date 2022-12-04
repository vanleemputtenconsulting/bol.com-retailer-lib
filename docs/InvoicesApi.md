# InvoicesApi

All URIs are relative to *https://api.bol.com*

 Method                                                                | HTTP request                                          | Description                                
-----------------------------------------------------------------------|-------------------------------------------------------|--------------------------------------------
 [**getInvoice**](InvoicesApi.md#getInvoice)                           | **GET** /retailer/invoices/{invoice-id}               | Get an invoice by invoice id               
 [**getInvoiceSpecification**](InvoicesApi.md#getInvoiceSpecification) | **GET** /retailer/invoices/{invoice-id}/specification | Get an invoice specification by invoice id 
 [**getInvoices**](InvoicesApi.md#getInvoices)                         | **GET** /retailer/invoices                            | Get all invoices                           

<a name="getInvoice"></a>

# **getInvoice**

> List&lt;byte[]&gt; getInvoice(invoiceId)

Get an invoice by invoice id

Gets an invoice by invoice id. The available media types differ per invoice and are listed within the response from the
‘GET all invoices’ call. Note: the media types listed in the response must be given in our standard API format.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoicesApi;


InvoicesApi apiInstance=new InvoicesApi();
        String invoiceId="invoiceId_example"; // String | The id of the invoice
        try{
        List<byte[]>result=apiInstance.getInvoice(invoiceId);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling InvoicesApi#getInvoice");
        e.printStackTrace();
        }
```

### Parameters

 Name          | Type       | Description           | Notes 
---------------|------------|-----------------------|-------
 **invoiceId** | **String** | The id of the invoice |

### Return type

**List&lt;byte[]&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+json, application/vnd.retailer.v8+pdf

<a name="getInvoiceSpecification"></a>

# **getInvoiceSpecification**

> List&lt;byte[]&gt; getInvoiceSpecification(invoiceId, page)

Get an invoice specification by invoice id

Gets an invoice specification for an invoice with a paginated list of its transactions. The available media types differ
per invoice specification and are listed within the response from the ‘GET all invoices’ call. Note, the media types
listed in the response must be given in our standard API format.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoicesApi;


InvoicesApi apiInstance=new InvoicesApi();
        String invoiceId="invoiceId_example"; // String | The identifier of the invoice.
        Integer page=56; // Integer | The requested page number with a maximum of 25,000 lines.
        try{
        List<byte[]>result=apiInstance.getInvoiceSpecification(invoiceId,page);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling InvoicesApi#getInvoiceSpecification");
        e.printStackTrace();
        }
```

### Parameters

 Name          | Type        | Description                                               | Notes      
---------------|-------------|-----------------------------------------------------------|------------
 **invoiceId** | **String**  | The identifier of the invoice.                            |
 **page**      | **Integer** | The requested page number with a maximum of 25,000 lines. | [optional] 

### Return type

**List&lt;byte[]&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+json,
  application/vnd.retailer.v8+openxmlformats-officedocument.spreadsheetml.sheet

<a name="getInvoices"></a>

# **getInvoices**

> List&lt;byte[]&gt; getInvoices(periodStartDate, periodEndDate)

Get all invoices

Gets a list of invoices, by default from the past 4 weeks. The optional period-start-date and period-end-date-date
parameters can be used together to retrieve invoices from a specific date range in the past, the period can be no longer
than 31 days. Invoices and their specifications can be downloaded separately in different media formats with the ‘GET an
invoice by id’ and the ‘GET an invoice specification by id’ calls. The available media types differ per invoice and are
listed per invoice within the response. Note: the media types listed in the response must be given in our standard API
format.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoicesApi;


InvoicesApi apiInstance=new InvoicesApi();
        String periodStartDate="2019-03-01"; // String | Period start date in ISO 8601 standard.
        String periodEndDate="2019-03-31"; // String | Period end date in ISO 8601 standard.
        try{
        List<byte[]>result=apiInstance.getInvoices(periodStartDate,periodEndDate);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling InvoicesApi#getInvoices");
        e.printStackTrace();
        }
```

### Parameters

 Name                | Type       | Description                             | Notes      
---------------------|------------|-----------------------------------------|------------
 **periodStartDate** | **String** | Period start date in ISO 8601 standard. | [optional] 
 **periodEndDate**   | **String** | Period end date in ISO 8601 standard.   | [optional] 

### Return type

**List&lt;byte[]&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+json

