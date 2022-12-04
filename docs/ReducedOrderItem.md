# ReducedOrderItem

## Properties

 Name                      | Type                                    | Description                                                                                                                                                             | Notes 
---------------------------|-----------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------
 **orderItemId**           | **String**                              | The id for the order item. One order can have multiple order items, but the list can only take one item.                                                                |
 **ean**                   | **String**                              | The EAN number associated with this product.                                                                                                                            |
 **fulfilmentMethod**      | **String**                              | The fulfilment method. Fulfilled by the retailer (FBR) or fulfilled by bol.com (FBB).                                                                                   |
 **fulfilmentStatus**      | **String**                              | To filter on order status. You can filter on either all orders independent from their status, open orders (excluding shipped and cancelled orders), and shipped orders. |
 **quantity**              | **Integer**                             | Amount of ordered products for this order item id.                                                                                                                      |
 **quantityShipped**       | **Integer**                             | Amount of shipped products for this order item id.                                                                                                                      |
 **quantityCancelled**     | **Integer**                             | Amount of cancelled products for this order item id.                                                                                                                    |
 **cancellationRequest**   | **Boolean**                             | Indicates whether the order was cancelled on request of the customer before the retailer has shipped it.                                                                |
 **latestChangedDateTime** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time in ISO 8601 format when the orderItem was last changed.                                                                                               | 



