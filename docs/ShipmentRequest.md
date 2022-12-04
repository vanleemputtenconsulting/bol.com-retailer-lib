# ShipmentRequest

## Properties

 Name                  | Type                                                | Description                                                                                                                                                           | Notes      
-----------------------|-----------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------
 **orderItems**        | [**List&lt;OrderItem&gt;**](OrderItem.md)           | Single element list with the order item to ship.                                                                                                                      |
 **shipmentReference** | **String**                                          | A user-defined reference that you can provide to add to the shipment. Can be used for own administration purposes. Only &#39;null&#39; or non-empty strings accepted. | [optional] 
 **shippingLabelId**   | **String**                                          | The identifier of the purchased shipping label.                                                                                                                       | [optional] 
 **transport**         | [**TransportInstruction**](TransportInstruction.md) |                                                                                                                                                                       | [optional] 



