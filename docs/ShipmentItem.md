# ShipmentItem

## Properties

 Name            | Type                                            | Description                                                                      | Notes      
-----------------|-------------------------------------------------|----------------------------------------------------------------------------------|------------
 **orderItemId** | **String**                                      | A unique identifier for the item of the order that was shipped in this shipment. | [optional] 
 **fulfilment**  | [**ShipmentFulfilment**](ShipmentFulfilment.md) |                                                                                  | [optional] 
 **offer**       | [**OrderOffer**](OrderOffer.md)                 |                                                                                  | [optional] 
 **product**     | [**OrderProduct**](OrderProduct.md)             |                                                                                  | [optional] 
 **quantity**    | **Integer**                                     | Amount of the product being ordered.                                             | [optional] 
 **unitPrice**   | [**BigDecimal**](BigDecimal.md)                 | The selling price to the customer of a single unit including VAT.                | [optional] 
 **commission**  | [**BigDecimal**](BigDecimal.md)                 | The commission.                                                                  | [optional] 



