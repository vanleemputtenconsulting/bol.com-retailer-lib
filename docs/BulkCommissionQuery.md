# BulkCommissionQuery

## Properties

 Name          | Type                                | Description                                                                                                         | Notes      
---------------|-------------------------------------|---------------------------------------------------------------------------------------------------------------------|------------
 **ean**       | **String**                          | The EAN number associated with this product.                                                                        |
 **condition** | [**ConditionEnum**](#ConditionEnum) | The condition of the offer.                                                                                         | [optional] 
 **unitPrice** | [**BigDecimal**](BigDecimal.md)     | The price of the product with a period as a decimal separator. The price should always have two decimals precision. |

<a name="ConditionEnum"></a>

## Enum: ConditionEnum

 Name       | Value                  
------------|------------------------
 NEW        | &quot;NEW&quot;        
 AS_NEW     | &quot;AS_NEW&quot;     
 GOOD       | &quot;GOOD&quot;       
 REASONABLE | &quot;REASONABLE&quot; 
 MODERATE   | &quot;MODERATE&quot;   



