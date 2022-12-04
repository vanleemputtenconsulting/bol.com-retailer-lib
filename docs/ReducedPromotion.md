# ReducedPromotion

## Properties

 Name                          | Type                                                            | Description                                                                   | Notes      
-------------------------------|-----------------------------------------------------------------|-------------------------------------------------------------------------------|------------
 **promotionId**               | **String**                                                      | The identifier of the promotion.                                              |
 **title**                     | **String**                                                      | The title of the promotion.                                                   |
 **startDateTime**             | [**OffsetDateTime**](OffsetDateTime.md)                         | The starting date and time of the promotion.                                  |
 **endDateTime**               | [**OffsetDateTime**](OffsetDateTime.md)                         | The ending date and time of the promotion.                                    |
 **countries**                 | [**List&lt;PromotionCountryCode&gt;**](PromotionCountryCode.md) |                                                                               |
 **promotionType**             | [**PromotionTypeEnum**](#PromotionTypeEnum)                     | The type of the promotion.                                                    |
 **retailerSpecificPromotion** | **Boolean**                                                     | Indicates whether the promotion is retailer specific or open to the platform. | [optional] 
 **campaign**                  | [**Campaign**](Campaign.md)                                     |                                                                               | [optional] 

<a name="PromotionTypeEnum"></a>

## Enum: PromotionTypeEnum

 Name      | Value                 
-----------|-----------------------
 AWARENESS | &quot;AWARENESS&quot; 
 PRICE_OFF | &quot;PRICE_OFF&quot; 



