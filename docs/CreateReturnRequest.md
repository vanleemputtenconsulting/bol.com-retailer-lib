# CreateReturnRequest

## Properties

 Name                 | Type                                          | Description                                                                                              | Notes 
----------------------|-----------------------------------------------|----------------------------------------------------------------------------------------------------------|-------
 **orderItemId**      | **String**                                    | The id for the order item. One order can have multiple order items, but the list can only take one item. |
 **quantityReturned** | **Integer**                                   | The quantity of items returned.                                                                          |
 **handlingResult**   | [**HandlingResultEnum**](#HandlingResultEnum) | The handling result requested by the retailer.                                                           |

<a name="HandlingResultEnum"></a>

## Enum: HandlingResultEnum

 Name                            | Value                                       
---------------------------------|---------------------------------------------
 RETURN_RECEIVED                 | &quot;RETURN_RECEIVED&quot;                 
 EXCHANGE_PRODUCT                | &quot;EXCHANGE_PRODUCT&quot;                
 RETURN_DOES_NOT_MEET_CONDITIONS | &quot;RETURN_DOES_NOT_MEET_CONDITIONS&quot; 
 REPAIR_PRODUCT                  | &quot;REPAIR_PRODUCT&quot;                  
 CUSTOMER_KEEPS_PRODUCT_PAID     | &quot;CUSTOMER_KEEPS_PRODUCT_PAID&quot;     



