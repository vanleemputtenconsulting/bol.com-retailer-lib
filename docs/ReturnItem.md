# ReturnItem

## Properties

 Name                  | Type                                                                | Description                                                                                                                                                                                           | Notes      
-----------------------|---------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------
 **rmaId**             | **String**                                                          | The RMA (Return Merchandise Authorization) identifier of the return.                                                                                                                                  |
 **orderId**           | **String**                                                          | The id of the customer order this return item is in.                                                                                                                                                  |
 **ean**               | **String**                                                          | The EAN number associated with this product.                                                                                                                                                          |
 **title**             | **String**                                                          | The product title.                                                                                                                                                                                    |
 **expectedQuantity**  | **Integer**                                                         | The quantity that is expected to be returned by the customer. Note: this can be greater than 1 in case the customer ordered a quantity greater than 1 of the same product in the same customer order. |
 **returnReason**      | [**ReturnReason**](ReturnReason.md)                                 |                                                                                                                                                                                                       | [optional] 
 **trackAndTrace**     | **String**                                                          | The track and trace code that is associated with this transport.                                                                                                                                      | [optional] 
 **transporterName**   | **String**                                                          | The name of the transporter.                                                                                                                                                                          | [optional] 
 **handled**           | **Boolean**                                                         | Indicates if this return item has been handled (by the retailer).                                                                                                                                     |
 **processingResults** | [**List&lt;ReturnProcessingResult&gt;**](ReturnProcessingResult.md) |                                                                                                                                                                                                       |
 **customerDetails**   | [**CustomerDetails**](CustomerDetails.md)                           |                                                                                                                                                                                                       | 



