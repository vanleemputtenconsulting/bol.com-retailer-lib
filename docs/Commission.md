# Commission

## Properties

 Name                          | Type                                      | Description                                                                                                                               | Notes      
-------------------------------|-------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------|------------
 **ean**                       | **String**                                | The EAN number associated with this product.                                                                                              |
 **condition**                 | **String**                                | The condition of the offer.                                                                                                               |
 **unitPrice**                 | [**BigDecimal**](BigDecimal.md)           | The intended selling price per single unit up to 2 decimals precision, including VAT.                                                     |
 **fixedAmount**               | [**BigDecimal**](BigDecimal.md)           | A fixed commission fee, including VAT.                                                                                                    |
 **percentage**                | [**BigDecimal**](BigDecimal.md)           | A percentage of commission, based on the intended selling price per unit, including VAT.                                                  |
 **totalCost**                 | [**BigDecimal**](BigDecimal.md)           | The total commission for selling this product at bol.com. The price includes VAT for Dutch sellers, and excludes VAT for Belgium sellers. |
 **totalCostWithoutReduction** | [**BigDecimal**](BigDecimal.md)           | The total commission for selling this product at bol.com without reductions including VAT.                                                | [optional] 
 **reductions**                | [**List&lt;Reduction&gt;**](Reduction.md) |                                                                                                                                           | 



