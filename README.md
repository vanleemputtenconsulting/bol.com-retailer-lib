# datafarmhouse.be

## bol.com Retailer API v8

v8 - Retailer API

- API version: 8.x
  - Build date: 2022-12-04T20:35:33.904+01:00

The bol.com API for retailers.

## Requirements

Building the API client library requires:

1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.CommissionsApi;

import java.io.File;
import java.util.*;

public class CommissionsApiExample {

    public static void main(String[] args) {
        
        CommissionsApi apiInstance = new CommissionsApi();
        String ean = "0000007740404"; // String | The EAN number associated with this product.
        BigDecimal unitPrice = new BigDecimal(); // BigDecimal | The price of the product with a period as a decimal separator. The price should always have two decimals precision.
        String condition = "NEW"; // String | The condition of the offer.
        try {
            Commission result = apiInstance.getCommission(ean, unitPrice, condition);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommissionsApi#getCommission");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.bol.com*

 Class               | Method                                                                                                 | HTTP request                                                                    | Description                                                      
---------------------|--------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------|------------------------------------------------------------------
 *CommissionsApi*    | [**getCommission**](docs/CommissionsApi.md#getCommission)                                              | **GET** /retailer/commission/{ean}                                              | Get all commissions and reductions by EAN per single EAN         
 *CommissionsApi*    | [**getCommissions**](docs/CommissionsApi.md#getCommissions)                                            | **POST** /retailer/commission                                                   | Get all commissions and reductions by EAN in bulk                
 *InsightsApi*       | [**getOfferInsights**](docs/InsightsApi.md#getOfferInsights)                                           | **GET** /retailer/insights/offer                                                | Get offer insights                                               
 *InsightsApi*       | [**getPerformanceIndicators**](docs/InsightsApi.md#getPerformanceIndicators)                           | **GET** /retailer/insights/performance/indicator                                | Get performance indicators                                       
 *InsightsApi*       | [**getSalesForecast**](docs/InsightsApi.md#getSalesForecast)                                           | **GET** /retailer/insights/sales-forecast                                       | Get sales forecast                                               
 *InsightsApi*       | [**getSearchTerms**](docs/InsightsApi.md#getSearchTerms)                                               | **GET** /retailer/insights/search-terms                                         | Get search terms                                                 
 *InventoryApi*      | [**getInventory**](docs/InventoryApi.md#getInventory)                                                  | **GET** /retailer/inventory                                                     | Get LVB/FBB inventory                                            
 *InvoicesApi*       | [**getInvoice**](docs/InvoicesApi.md#getInvoice)                                                       | **GET** /retailer/invoices/{invoice-id}                                         | Get an invoice by invoice id                                     
 *InvoicesApi*       | [**getInvoiceSpecification**](docs/InvoicesApi.md#getInvoiceSpecification)                             | **GET** /retailer/invoices/{invoice-id}/specification                           | Get an invoice specification by invoice id                       
 *InvoicesApi*       | [**getInvoices**](docs/InvoicesApi.md#getInvoices)                                                     | **GET** /retailer/invoices                                                      | Get all invoices                                                 
 *OffersApi*         | [**deleteOffer**](docs/OffersApi.md#deleteOffer)                                                       | **DELETE** /retailer/offers/{offer-id}                                          | Delete offer by id                                               
 *OffersApi*         | [**getOffer**](docs/OffersApi.md#getOffer)                                                             | **GET** /retailer/offers/{offer-id}                                             | Retrieve an offer by its offer id                                
 *OffersApi*         | [**getOfferExport**](docs/OffersApi.md#getOfferExport)                                                 | **GET** /retailer/offers/export/{report-id}                                     | Retrieve an offer export file by offer export id                 
 *OffersApi*         | [**getUnpublishedOfferReport**](docs/OffersApi.md#getUnpublishedOfferReport)                           | **GET** /retailer/offers/unpublished/{report-id}                                | Retrieve an unpublished offer report by report id                
 *OffersApi*         | [**postOffer**](docs/OffersApi.md#postOffer)                                                           | **POST** /retailer/offers                                                       | Create a new offer                                               
 *OffersApi*         | [**postOfferExport**](docs/OffersApi.md#postOfferExport)                                               | **POST** /retailer/offers/export                                                | Request an offer export file                                     
 *OffersApi*         | [**postUnpublishedOfferReport**](docs/OffersApi.md#postUnpublishedOfferReport)                         | **POST** /retailer/offers/unpublished                                           | Request an unpublished offer report                              
 *OffersApi*         | [**putOffer**](docs/OffersApi.md#putOffer)                                                             | **PUT** /retailer/offers/{offer-id}                                             | Update an offer                                                  
 *OffersApi*         | [**updateOfferPrice**](docs/OffersApi.md#updateOfferPrice)                                             | **PUT** /retailer/offers/{offer-id}/price                                       | Update price(s) for offer by id                                  
 *OffersApi*         | [**updateOfferStock**](docs/OffersApi.md#updateOfferStock)                                             | **PUT** /retailer/offers/{offer-id}/stock                                       | Update stock for offer by id                                     
 *OrdersApi*         | [**cancelOrderItem**](docs/OrdersApi.md#cancelOrderItem)                                               | **PUT** /retailer/orders/cancellation                                           | Cancel an order item by an order item id                         
 *OrdersApi*         | [**getOrder**](docs/OrdersApi.md#getOrder)                                                             | **GET** /retailer/orders/{order-id}                                             | Get an order by order id                                         
 *OrdersApi*         | [**getOrders**](docs/OrdersApi.md#getOrders)                                                           | **GET** /retailer/orders                                                        | Get a list of orders                                             
 *OrdersApi*         | [**shipOrderItem**](docs/OrdersApi.md#shipOrderItem)                                                   | **PUT** /retailer/orders/shipment                                               | Ship order item                                                  
 *ProductContentApi* | [**getCatalogProduct**](docs/ProductContentApi.md#getCatalogProduct)                                   | **GET** /retailer/content/catalog-products/{ean}                                | Get catalog product details by EAN                               
 *ProductContentApi* | [**getChunkRecommendations**](docs/ProductContentApi.md#getChunkRecommendations)                       | **POST** /retailer/content/chunk-recommendations                                | Get chunk recommendations                                        
 *ProductContentApi* | [**getUploadReport**](docs/ProductContentApi.md#getUploadReport)                                       | **GET** /retailer/content/upload-report/{upload-id}                             | Get an upload report by upload id                                
 *ProductContentApi* | [**postProductContent**](docs/ProductContentApi.md#postProductContent)                                 | **POST** /retailer/content/products                                             | Create content for a product                                     
 *PromotionsApi*     | [**getProducts**](docs/PromotionsApi.md#getProducts)                                                   | **GET** /retailer/promotions/{promotion-id}/products                            | Get a list of products                                           
 *PromotionsApi*     | [**getPromotion**](docs/PromotionsApi.md#getPromotion)                                                 | **GET** /retailer/promotions/{promotion-id}                                     | Get a promotion by promotion id                                  
 *PromotionsApi*     | [**getPromotions**](docs/PromotionsApi.md#getPromotions)                                               | **GET** /retailer/promotions                                                    | Get a list of promotions                                         
 *ReplenishmentsApi* | [**getDeliveryDates**](docs/ReplenishmentsApi.md#getDeliveryDates)                                     | **GET** /retailer/replenishments/delivery-dates                                 | Get delivery dates                                               
 *ReplenishmentsApi* | [**getLoadCarrierLabels**](docs/ReplenishmentsApi.md#getLoadCarrierLabels)                             | **GET** /retailer/replenishments/{replenishment-id}/load-carrier-labels         | Get load carrier labels                                          
 *ReplenishmentsApi* | [**getPickList**](docs/ReplenishmentsApi.md#getPickList)                                               | **GET** /retailer/replenishments/{replenishment-id}/pick-list                   | Get pick list                                                    
 *ReplenishmentsApi* | [**getProductDestinations**](docs/ReplenishmentsApi.md#getProductDestinations)                         | **GET** /retailer/replenishments/product-destinations/{product-destinations-id} | Get product destinations by product destinations id              
 *ReplenishmentsApi* | [**getReplenishment**](docs/ReplenishmentsApi.md#getReplenishment)                                     | **GET** /retailer/replenishments/{replenishment-id}                             | Get a replenishment by replenishment id                          
 *ReplenishmentsApi* | [**getReplenishments**](docs/ReplenishmentsApi.md#getReplenishments)                                   | **GET** /retailer/replenishments                                                | Get replenishments                                               
 *ReplenishmentsApi* | [**postPickupTimeSlots**](docs/ReplenishmentsApi.md#postPickupTimeSlots)                               | **POST** /retailer/replenishments/pickup-time-slots                             | Post pickup time slots                                           
 *ReplenishmentsApi* | [**postProductLabels**](docs/ReplenishmentsApi.md#postProductLabels)                                   | **POST** /retailer/replenishments/product-labels                                | Post product labels                                              
 *ReplenishmentsApi* | [**postReplenishment**](docs/ReplenishmentsApi.md#postReplenishment)                                   | **POST** /retailer/replenishments                                               | Create a replenishment                                           
 *ReplenishmentsApi* | [**postRequestProductDestinations**](docs/ReplenishmentsApi.md#postRequestProductDestinations)         | **POST** /retailer/replenishments/product-destinations                          | Request product destinations                                     
 *ReplenishmentsApi* | [**putReplenishment**](docs/ReplenishmentsApi.md#putReplenishment)                                     | **PUT** /retailer/replenishments/{replenishment-id}                             | Update a replenishment by replenishment id                       
 *ReturnsApi*        | [**createReturn**](docs/ReturnsApi.md#createReturn)                                                    | **POST** /retailer/returns                                                      | Create a return                                                  
 *ReturnsApi*        | [**getReturn**](docs/ReturnsApi.md#getReturn)                                                          | **GET** /retailer/returns/{return-id}                                           | Get a return by return id                                        
 *ReturnsApi*        | [**getReturns**](docs/ReturnsApi.md#getReturns)                                                        | **GET** /retailer/returns                                                       | Get returns                                                      
 *ReturnsApi*        | [**handleReturn**](docs/ReturnsApi.md#handleReturn)                                                    | **PUT** /retailer/returns/{rma-id}                                              | Handle a return by rma id                                        
 *ShipmentsApi*      | [**getShipment**](docs/ShipmentsApi.md#getShipment)                                                    | **GET** /retailer/shipments/{shipment-id}                                       | Get a shipment by shipment id                                    
 *ShipmentsApi*      | [**getShipments**](docs/ShipmentsApi.md#getShipments)                                                  | **GET** /retailer/shipments                                                     | Get shipment list                                                
 *ShippingLabelsApi* | [**getDeliveryOptions**](docs/ShippingLabelsApi.md#getDeliveryOptions)                                 | **POST** /retailer/shipping-labels/delivery-options                             | Get delivery options                                             
 *ShippingLabelsApi* | [**getShippingLabel**](docs/ShippingLabelsApi.md#getShippingLabel)                                     | **GET** /retailer/shipping-labels/{shipping-label-id}                           | Get a shipping label                                             
 *ShippingLabelsApi* | [**postShippingLabel**](docs/ShippingLabelsApi.md#postShippingLabel)                                   | **POST** /retailer/shipping-labels                                              | Create a shipping label                                          
 *SubscriptionsApi*  | [**deletePushNotificationSubscription**](docs/SubscriptionsApi.md#deletePushNotificationSubscription)  | **DELETE** /retailer/subscriptions/{subscription-id}                            | Delete push notification subscription                            
 *SubscriptionsApi*  | [**getPushNotificationSubscription**](docs/SubscriptionsApi.md#getPushNotificationSubscription)        | **GET** /retailer/subscriptions/{subscription-id}                               | Get push notification subscription by id                         
 *SubscriptionsApi*  | [**getPushNotificationSubscriptions**](docs/SubscriptionsApi.md#getPushNotificationSubscriptions)      | **GET** /retailer/subscriptions                                                 | Get push notification subscriptions                              
 *SubscriptionsApi*  | [**getSubscriptionKeys**](docs/SubscriptionsApi.md#getSubscriptionKeys)                                | **GET** /retailer/subscriptions/signature-keys                                  | Retrieve public keys for push notification signature validation. 
 *SubscriptionsApi*  | [**postPushNotificationSubscription**](docs/SubscriptionsApi.md#postPushNotificationSubscription)      | **POST** /retailer/subscriptions                                                | Create push notification subscription                            
 *SubscriptionsApi*  | [**postTestPushNotification**](docs/SubscriptionsApi.md#postTestPushNotification)                      | **POST** /retailer/subscriptions/test/{subscription-id}                         | Send test push notification for subscriptions                    
 *SubscriptionsApi*  | [**putPushNotificationSubscription**](docs/SubscriptionsApi.md#putPushNotificationSubscription)        | **PUT** /retailer/subscriptions/{subscription-id}                               | Update push notification subscription                            
 *TransportsApi*     | [**addTransportInformationByTransportId**](docs/TransportsApi.md#addTransportInformationByTransportId) | **PUT** /retailer/transports/{transport-id}                                     | Add transport information by transport id                        

## Documentation for Models

- [AdditionalService](docs/AdditionalService.md)
- [Address](docs/Address.md)
- [Asset](docs/Asset.md)
- [Attribute](docs/Attribute.md)
- [AttributeValue](docs/AttributeValue.md)
- [Attributes](docs/Attributes.md)
- [AudioTracks](docs/AudioTracks.md)
- [BillingDetails](docs/BillingDetails.md)
- [BulkCommissionQuery](docs/BulkCommissionQuery.md)
- [BulkCommissionRequest](docs/BulkCommissionRequest.md)
- [BulkCommissionResponse](docs/BulkCommissionResponse.md)
- [BundlePrice](docs/BundlePrice.md)
- [Campaign](docs/Campaign.md)
- [CatalogProduct](docs/CatalogProduct.md)
- [ChangeTransportRequest](docs/ChangeTransportRequest.md)
- [ChunkRecommendationsAttribute](docs/ChunkRecommendationsAttribute.md)
- [ChunkRecommendationsAttributes](docs/ChunkRecommendationsAttributes.md)
- [ChunkRecommendationsPrediction](docs/ChunkRecommendationsPrediction.md)
- [ChunkRecommendationsPredictions](docs/ChunkRecommendationsPredictions.md)
- [ChunkRecommendationsRequest](docs/ChunkRecommendationsRequest.md)
- [ChunkRecommendationsResponse](docs/ChunkRecommendationsResponse.md)
- [ChunkRecommendationsValue](docs/ChunkRecommendationsValue.md)
- [Commission](docs/Commission.md)
- [Condition](docs/Condition.md)
- [ContainerForTheOrderItemsThatHaveToBeCancelled_](docs/ContainerForTheOrderItemsThatHaveToBeCancelled_.md)
- [Countries](docs/Countries.md)
- [CreateAddress](docs/CreateAddress.md)
- [CreateDeliveryInfo](docs/CreateDeliveryInfo.md)
- [CreateOfferExportRequest](docs/CreateOfferExportRequest.md)
- [CreateOfferRequest](docs/CreateOfferRequest.md)
- [CreatePickupAppointment](docs/CreatePickupAppointment.md)
- [CreatePickupTimeSlot](docs/CreatePickupTimeSlot.md)
- [CreateProductContentSingleRequest](docs/CreateProductContentSingleRequest.md)
- [CreateReplenishmentLine](docs/CreateReplenishmentLine.md)
- [CreateReplenishmentRequest](docs/CreateReplenishmentRequest.md)
- [CreateReturnRequest](docs/CreateReturnRequest.md)
- [CreateSubscriptionRequest](docs/CreateSubscriptionRequest.md)
- [CreateUnpublishedOfferReportRequest](docs/CreateUnpublishedOfferReportRequest.md)
- [CustomerDetails](docs/CustomerDetails.md)
- [DeliveryDatesResponse](docs/DeliveryDatesResponse.md)
- [DeliveryInformation](docs/DeliveryInformation.md)
- [DeliveryOption](docs/DeliveryOption.md)
- [DeliveryOptionsRequest](docs/DeliveryOptionsRequest.md)
- [DeliveryOptionsRequestOrderItem](docs/DeliveryOptionsRequestOrderItem.md)
- [DeliveryOptionsResponse](docs/DeliveryOptionsResponse.md)
- [DestinationWarehouse](docs/DestinationWarehouse.md)
- [Details](docs/Details.md)
- [Ean](docs/Ean.md)
- [Enrichment](docs/Enrichment.md)
- [Fulfilment](docs/Fulfilment.md)
- [Gpc](docs/Gpc.md)
- [HandoverDetails](docs/HandoverDetails.md)
- [InvalidReplenishmentLine](docs/InvalidReplenishmentLine.md)
- [Inventory](docs/Inventory.md)
- [InventoryResponse](docs/InventoryResponse.md)
- [KeySet](docs/KeySet.md)
- [KeySetResponse](docs/KeySetResponse.md)
- [LabelPrice](docs/LabelPrice.md)
- [Link](docs/Link.md)
- [LoadCarrier](docs/LoadCarrier.md)
- [ModelReturn](docs/ModelReturn.md)
- [Norm](docs/Norm.md)
- [NotPublishableReason](docs/NotPublishableReason.md)
- [OfferInsight](docs/OfferInsight.md)
- [OfferInsights](docs/OfferInsights.md)
- [OfferInsightsCountry](docs/OfferInsightsCountry.md)
- [OfferInsightsPeriod](docs/OfferInsightsPeriod.md)
- [OffersCountryCode](docs/OffersCountryCode.md)
- [Order](docs/Order.md)
- [OrderFulfilment](docs/OrderFulfilment.md)
- [OrderItem](docs/OrderItem.md)
- [OrderItemCancellation](docs/OrderItemCancellation.md)
- [OrderOffer](docs/OrderOffer.md)
- [OrderOrderItem](docs/OrderOrderItem.md)
- [OrderProduct](docs/OrderProduct.md)
- [PackageRestrictions](docs/PackageRestrictions.md)
- [Party](docs/Party.md)
- [PerformanceIndicator](docs/PerformanceIndicator.md)
- [PerformanceIndicatorPeriod](docs/PerformanceIndicatorPeriod.md)
- [PerformanceIndicators](docs/PerformanceIndicators.md)
- [Periods](docs/Periods.md)
- [PickupAppointment](docs/PickupAppointment.md)
- [PickupTimeSlot](docs/PickupTimeSlot.md)
- [PickupTimeSlotsAddress](docs/PickupTimeSlotsAddress.md)
- [PickupTimeSlotsRequest](docs/PickupTimeSlotsRequest.md)
- [PickupTimeSlotsResponse](docs/PickupTimeSlotsResponse.md)
- [Pricing](docs/Pricing.md)
- [Problem](docs/Problem.md)
- [ProcessStatus](docs/ProcessStatus.md)
- [Product](docs/Product.md)
- [ProductDestination](docs/ProductDestination.md)
- [ProductDestinationAddress](docs/ProductDestinationAddress.md)
- [ProductDestinationWarehouse](docs/ProductDestinationWarehouse.md)
- [ProductDestinationsResponse](docs/ProductDestinationsResponse.md)
- [ProductLabelsProduct](docs/ProductLabelsProduct.md)
- [ProductLabelsRequest](docs/ProductLabelsRequest.md)
- [Products](docs/Products.md)
- [Promotion](docs/Promotion.md)
- [PromotionCountryCode](docs/PromotionCountryCode.md)
- [Promotions](docs/Promotions.md)
- [ReducedInvalidReplenishmentLine](docs/ReducedInvalidReplenishmentLine.md)
- [ReducedOrder](docs/ReducedOrder.md)
- [ReducedOrderItem](docs/ReducedOrderItem.md)
- [ReducedOrders](docs/ReducedOrders.md)
- [ReducedPromotion](docs/ReducedPromotion.md)
- [ReducedReplenishment](docs/ReducedReplenishment.md)
- [ReducedReplenishmentLines](docs/ReducedReplenishmentLines.md)
- [ReducedReturn](docs/ReducedReturn.md)
- [ReducedReturnItem](docs/ReducedReturnItem.md)
- [ReducedShipment](docs/ReducedShipment.md)
- [ReducedShipmentItem](docs/ReducedShipmentItem.md)
- [ReducedShipmentOrder](docs/ReducedShipmentOrder.md)
- [ReducedTransport](docs/ReducedTransport.md)
- [Reduction](docs/Reduction.md)
- [RelatedSearchTerm](docs/RelatedSearchTerm.md)
- [RelevanceScore](docs/RelevanceScore.md)
- [ReplenishmentLine](docs/ReplenishmentLine.md)
- [ReplenishmentPickupTimeSlot](docs/ReplenishmentPickupTimeSlot.md)
- [ReplenishmentResponse](docs/ReplenishmentResponse.md)
- [ReplenishmentsResponse](docs/ReplenishmentsResponse.md)
- [RequestProductDestinationsRequest](docs/RequestProductDestinationsRequest.md)
- [RetailerOffer](docs/RetailerOffer.md)
- [ReturnItem](docs/ReturnItem.md)
- [ReturnProcessingResult](docs/ReturnProcessingResult.md)
- [ReturnReason](docs/ReturnReason.md)
- [ReturnRequest](docs/ReturnRequest.md)
- [ReturnsResponse](docs/ReturnsResponse.md)
- [SalesForecastPeriod](docs/SalesForecastPeriod.md)
- [SalesForecastResponse](docs/SalesForecastResponse.md)
- [Score](docs/Score.md)
- [SearchTerm](docs/SearchTerm.md)
- [SearchTerms](docs/SearchTerms.md)
- [SearchTermsCountry](docs/SearchTermsCountry.md)
- [SearchTermsPeriod](docs/SearchTermsPeriod.md)
- [Serie](docs/Serie.md)
- [Shipment](docs/Shipment.md)
- [ShipmentDetails](docs/ShipmentDetails.md)
- [ShipmentFulfilment](docs/ShipmentFulfilment.md)
- [ShipmentItem](docs/ShipmentItem.md)
- [ShipmentOrder](docs/ShipmentOrder.md)
- [ShipmentRequest](docs/ShipmentRequest.md)
- [ShipmentTransport](docs/ShipmentTransport.md)
- [ShipmentsResponse](docs/ShipmentsResponse.md)
- [ShippingLabelRequest](docs/ShippingLabelRequest.md)
- [StateTransition](docs/StateTransition.md)
- [Stock](docs/Stock.md)
- [StockCreate](docs/StockCreate.md)
- [Store](docs/Store.md)
- [SubscriptionResponse](docs/SubscriptionResponse.md)
- [SubscriptionsResponse](docs/SubscriptionsResponse.md)
- [Total](docs/Total.md)
- [TotalPeriod](docs/TotalPeriod.md)
- [TransportEvent](docs/TransportEvent.md)
- [TransportInstruction](docs/TransportInstruction.md)
- [UpdateDeliveryInfo](docs/UpdateDeliveryInfo.md)
- [UpdateLoadCarrier](docs/UpdateLoadCarrier.md)
- [UpdateOfferPriceRequest](docs/UpdateOfferPriceRequest.md)
- [UpdateOfferRequest](docs/UpdateOfferRequest.md)
- [UpdateOfferStockRequest](docs/UpdateOfferStockRequest.md)
- [UpdateReplenishmentRequest](docs/UpdateReplenishmentRequest.md)
- [UpdateSubscriptionRequest](docs/UpdateSubscriptionRequest.md)
- [UploadReportAsset](docs/UploadReportAsset.md)
- [UploadReportAttribute](docs/UploadReportAttribute.md)
- [UploadReportResponse](docs/UploadReportResponse.md)
- [UploadReportValue](docs/UploadReportValue.md)
- [Values](docs/Values.md)
- [Violation](docs/Violation.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential
issues.

## Author



