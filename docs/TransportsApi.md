# TransportsApi

All URIs are relative to *https://api.bol.com*

 Method                                                                                            | HTTP request                                | Description                               
---------------------------------------------------------------------------------------------------|---------------------------------------------|-------------------------------------------
 [**addTransportInformationByTransportId**](TransportsApi.md#addTransportInformationByTransportId) | **PUT** /retailer/transports/{transport-id} | Add transport information by transport id 

<a name="addTransportInformationByTransportId"></a>

# **addTransportInformationByTransportId**

> ProcessStatus addTransportInformationByTransportId(transportId, body)

Add transport information by transport id

Add information to an existing transport. The transport id is part of the shipment. You can retrieve the transport id
through the GET shipment list request.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TransportsApi;


TransportsApi apiInstance = new TransportsApi();
String transportId = "transportId_example"; // String | The transport id.
ChangeTransportRequest body = new ChangeTransportRequest(); // ChangeTransportRequest | The change transport requested by the user.
try {
    ProcessStatus result = apiInstance.addTransportInformationByTransportId(transportId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransportsApi#addTransportInformationByTransportId");
    e.printStackTrace();
}
```

### Parameters

 Name            | Type                                                    | Description                                 | Notes      
-----------------|---------------------------------------------------------|---------------------------------------------|------------
 **transportId** | **String**                                              | The transport id.                           |
 **body**        | [**ChangeTransportRequest**](ChangeTransportRequest.md) | The change transport requested by the user. | [optional] 

### Return type

[**ProcessStatus**](ProcessStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/vnd.retailer.v8+json
- **Accept**: application/vnd.retailer.v8+json

