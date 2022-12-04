# Shipment

## Properties

 Name                  | Type                                            | Description                                                           | Notes      
-----------------------|-------------------------------------------------|-----------------------------------------------------------------------|------------
 **shipmentId**        | **String**                                      | A unique identifier for this shipment.                                | [optional] 
 **shipmentDateTime**  | [**OffsetDateTime**](OffsetDateTime.md)         | The date and time in ISO 8601 format when the order item was shipped. | [optional] 
 **shipmentReference** | **String**                                      | Reference supplied by the user when this item was shipped.            | [optional] 
 **pickupPoint**       | **Boolean**                                     | Indicates whether this order is shipped to a Pick Up Point.           | [optional] 
 **order**             | [**ShipmentOrder**](ShipmentOrder.md)           |                                                                       |
 **shipmentDetails**   | [**ShipmentDetails**](ShipmentDetails.md)       |                                                                       | [optional] 
 **billingDetails**    | [**BillingDetails**](BillingDetails.md)         |                                                                       | [optional] 
 **shipmentItems**     | [**List&lt;ShipmentItem&gt;**](ShipmentItem.md) |                                                                       |
 **transport**         | [**ShipmentTransport**](ShipmentTransport.md)   |                                                                       | [optional] 



