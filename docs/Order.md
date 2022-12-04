# Order

## Properties

 Name                    | Type                                                | Description                                                     | Notes      
-------------------------|-----------------------------------------------------|-----------------------------------------------------------------|------------
 **orderId**             | **String**                                          | The identifier of the order.                                    | [optional] 
 **pickupPoint**         | **Boolean**                                         | Indicates whether this order is shipped to a Pick Up Point.     | [optional] 
 **orderPlacedDateTime** | [**OffsetDateTime**](OffsetDateTime.md)             | The date and time in ISO 8601 format when the order was placed. | [optional] 
 **shipmentDetails**     | [**ShipmentDetails**](ShipmentDetails.md)           |                                                                 |
 **billingDetails**      | [**BillingDetails**](BillingDetails.md)             |                                                                 | [optional] 
 **orderItems**          | [**List&lt;OrderOrderItem&gt;**](OrderOrderItem.md) |                                                                 | 



