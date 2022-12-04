# ReducedShipment

## Properties

 Name                  | Type                                                          | Description                                                           | Notes      
-----------------------|---------------------------------------------------------------|-----------------------------------------------------------------------|------------
 **shipmentId**        | **String**                                                    | A unique identifier for this shipment.                                | [optional] 
 **shipmentDateTime**  | [**OffsetDateTime**](OffsetDateTime.md)                       | The date and time in ISO 8601 format when the order item was shipped. | [optional] 
 **shipmentReference** | **String**                                                    | Reference supplied by the user when this item was shipped.            | [optional] 
 **order**             | [**ReducedShipmentOrder**](ReducedShipmentOrder.md)           |                                                                       |
 **shipmentItems**     | [**List&lt;ReducedShipmentItem&gt;**](ReducedShipmentItem.md) |                                                                       |
 **transport**         | [**ReducedTransport**](ReducedTransport.md)                   |                                                                       | 



