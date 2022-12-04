# ReducedReturnItem

## Properties

 Name                  | Type                                                                | Description                                                                                                                                                                                           | Notes      
-----------------------|---------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------
 **rmaId**             | **String**                                                          | The RMA (Return Merchandise Authorization) identifier of the return.                                                                                                                                  |
 **orderId**           | **String**                                                          | The id of the customer order this return item is in.                                                                                                                                                  |
 **ean**               | **String**                                                          | The EAN number associated with this product.                                                                                                                                                          |
 **expectedQuantity**  | **Integer**                                                         | The quantity that is expected to be returned by the customer. Note: this can be greater than 1 in case the customer ordered a quantity greater than 1 of the same product in the same customer order. |
 **returnReason**      | [**ReturnReason**](ReturnReason.md)                                 |                                                                                                                                                                                                       | [optional] 
 **handled**           | **Boolean**                                                         | Indicates if this return item has been handled (by the retailer).                                                                                                                                     | [optional] 
 **processingResults** | [**List&lt;ReturnProcessingResult&gt;**](ReturnProcessingResult.md) |                                                                                                                                                                                                       | 



