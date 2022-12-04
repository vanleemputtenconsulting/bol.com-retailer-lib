# InsightsApi

All URIs are relative to *https://api.bol.com*

 Method                                                                  | HTTP request                                     | Description                
-------------------------------------------------------------------------|--------------------------------------------------|----------------------------
 [**getOfferInsights**](InsightsApi.md#getOfferInsights)                 | **GET** /retailer/insights/offer                 | Get offer insights         
 [**getPerformanceIndicators**](InsightsApi.md#getPerformanceIndicators) | **GET** /retailer/insights/performance/indicator | Get performance indicators 
 [**getSalesForecast**](InsightsApi.md#getSalesForecast)                 | **GET** /retailer/insights/sales-forecast        | Get sales forecast         
 [**getSearchTerms**](InsightsApi.md#getSearchTerms)                     | **GET** /retailer/insights/search-terms          | Get search terms           

<a name="getOfferInsights"></a>

# **getOfferInsights**

> OfferInsights getOfferInsights(offerId, period, numberOfPeriods, name)

Get offer insights

Get the product visits and the buy box percentage for an offer during a given period.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InsightsApi;


InsightsApi apiInstance=new InsightsApi();
        String offerId="offerId_example"; // String | Unique identifier for an offer.
        String period="period_example"; // String | The time unit in which the offer insights are grouped.
        Integer numberOfPeriods=56; // Integer | The number of periods for which the offer insights are requested back in time. The maximum available periods are 24 for MONTH, 104 for WEEK, and 730 for DAY.
        List<String> name=Arrays.asList("name_example"); // List<String> | The name of the requested offer insight.
        try{
        OfferInsights result=apiInstance.getOfferInsights(offerId,period,numberOfPeriods,name);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling InsightsApi#getOfferInsights");
        e.printStackTrace();
        }
```

### Parameters

 Name                | Type                                | Description                                                                                                                                                   | Notes                                      
---------------------|-------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------
 **offerId**         | **String**                          | Unique identifier for an offer.                                                                                                                               |
 **period**          | **String**                          | The time unit in which the offer insights are grouped.                                                                                                        | [enum: DAY, WEEK, MONTH]                   
 **numberOfPeriods** | **Integer**                         | The number of periods for which the offer insights are requested back in time. The maximum available periods are 24 for MONTH, 104 for WEEK, and 730 for DAY. |
 **name**            | [**List&lt;String&gt;**](String.md) | The name of the requested offer insight.                                                                                                                      | [enum: PRODUCT_VISITS, BUY_BOX_PERCENTAGE] 

### Return type

[**OfferInsights**](OfferInsights.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+json

<a name="getPerformanceIndicators"></a>

# **getPerformanceIndicators**

> PerformanceIndicators getPerformanceIndicators(name, year, week)

Get performance indicators

Gets the measurements for your performance indicators per week.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InsightsApi;


InsightsApi apiInstance=new InsightsApi();
        List<String> name=Arrays.asList("name_example"); // List<String> | The type of the performance indicator
        String year="year_example"; // String | Year number in the ISO-8601 standard.
        String week="week_example"; // String | Week number in the ISO-8601 standard. If you would like to get the relative scores from the current week, please provide the current week number here. Be advised that measurements can change heavily over the course of the week.
        try{
        PerformanceIndicators result=apiInstance.getPerformanceIndicators(name,year,week);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling InsightsApi#getPerformanceIndicators");
        e.printStackTrace();
        }
```

### Parameters

 Name     | Type                                | Description                                                                                                                                                                                                                         | Notes                                                                                                                    
----------|-------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------
 **name** | [**List&lt;String&gt;**](String.md) | The type of the performance indicator                                                                                                                                                                                               | [enum: CANCELLATIONS, FULFILMENT, PHONE_AVAILABILITY, RESPONSE_TIME, CASE_ITEM_RATIO, TRACK_AND_TRACE, RETURNS, REVIEWS] 
 **year** | **String**                          | Year number in the ISO-8601 standard.                                                                                                                                                                                               |
 **week** | **String**                          | Week number in the ISO-8601 standard. If you would like to get the relative scores from the current week, please provide the current week number here. Be advised that measurements can change heavily over the course of the week. |

### Return type

[**PerformanceIndicators**](PerformanceIndicators.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+json

<a name="getSalesForecast"></a>

# **getSalesForecast**

> SalesForecastResponse getSalesForecast(offerId, weeksAhead)

Get sales forecast

Get sales forecast to estimate the sales expectations on the total bol.com platform for the requested number of weeks
ahead.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InsightsApi;


InsightsApi apiInstance=new InsightsApi();
        String offerId="offerId_example"; // String | Unique identifier for an offer.
        Integer weeksAhead=56; // Integer | The number of weeks into the future, starting from today.
        try{
        SalesForecastResponse result=apiInstance.getSalesForecast(offerId,weeksAhead);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling InsightsApi#getSalesForecast");
        e.printStackTrace();
        }
```

### Parameters

 Name           | Type        | Description                                               | Notes 
----------------|-------------|-----------------------------------------------------------|-------
 **offerId**    | **String**  | Unique identifier for an offer.                           |
 **weeksAhead** | **Integer** | The number of weeks into the future, starting from today. |

### Return type

[**SalesForecastResponse**](SalesForecastResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+json

<a name="getSearchTerms"></a>

# **getSearchTerms**

> SearchTerms getSearchTerms(searchTerm, period, numberOfPeriods, relatedSearchTerms)

Get search terms

Retrieves the search volume for a specified search term and period. The search volume allows you to see what bol.com
customers are searching for. Based on the search volume per search term you can optimize your product content, or spot
opportunities to extend your assortment, or analyzing trends for inventory management.

### Example

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InsightsApi;


InsightsApi apiInstance=new InsightsApi();
        String searchTerm="searchTerm_example"; // String | The search term for which you want to request the search volume.
        String period="period_example"; // String | The time unit in which the offer insights are grouped.
        Integer numberOfPeriods=56; // Integer | The number of periods for which the offer insights are requested back in time.
        Boolean relatedSearchTerms=false; // Boolean | Indicates whether or not you want to retrieve the related search terms.
        try{
        SearchTerms result=apiInstance.getSearchTerms(searchTerm,period,numberOfPeriods,relatedSearchTerms);
        System.out.println(result);
        }catch(ApiException e){
        System.err.println("Exception when calling InsightsApi#getSearchTerms");
        e.printStackTrace();
        }
```

### Parameters

 Name                   | Type        | Description                                                                    | Notes                         
------------------------|-------------|--------------------------------------------------------------------------------|-------------------------------
 **searchTerm**         | **String**  | The search term for which you want to request the search volume.               |
 **period**             | **String**  | The time unit in which the offer insights are grouped.                         | [enum: DAY, WEEK, MONTH]      
 **numberOfPeriods**    | **Integer** | The number of periods for which the offer insights are requested back in time. |
 **relatedSearchTerms** | **Boolean** | Indicates whether or not you want to retrieve the related search terms.        | [optional] [default to false] 

### Return type

[**SearchTerms**](SearchTerms.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.retailer.v8+json

