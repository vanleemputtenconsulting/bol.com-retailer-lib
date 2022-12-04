# OrderOrderItem

## Properties

 Name                      | Type                                                      | Description                                                                                              | Notes      
---------------------------|-----------------------------------------------------------|----------------------------------------------------------------------------------------------------------|------------
 **orderItemId**           | **String**                                                | The id for the order item. One order can have multiple order items, but the list can only take one item. | [optional] 
 **cancellationRequest**   | **Boolean**                                               | Indicates whether the order was cancelled on request of the customer before the retailer has shipped it. | [optional] 
 **fulfilment**            | [**OrderFulfilment**](OrderFulfilment.md)                 |                                                                                                          | [optional] 
 **offer**                 | [**OrderOffer**](OrderOffer.md)                           |                                                                                                          | [optional] 
 **product**               | [**OrderProduct**](OrderProduct.md)                       |                                                                                                          | [optional] 
 **quantity**              | **Integer**                                               | Amount of ordered products for this order item id.                                                       | [optional] 
 **quantityShipped**       | **Integer**                                               | Amount of shipped products for this order item id.                                                       | [optional] 
 **quantityCancelled**     | **Integer**                                               | Amount of cancelled products for this order item id.                                                     | [optional] 
 **unitPrice**             | [**BigDecimal**](BigDecimal.md)                           | The selling price to the customer of a single unit including VAT.                                        | [optional] 
 **commission**            | [**BigDecimal**](BigDecimal.md)                           | The commission for all quantities of this order item.                                                    | [optional] 
 **additionalServices**    | [**List&lt;AdditionalService&gt;**](AdditionalService.md) |                                                                                                          | [optional] 
 **latestChangedDateTime** | [**OffsetDateTime**](OffsetDateTime.md)                   | The date and time in ISO 8601 format when the orderItem was last changed.                                | 



