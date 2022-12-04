# OrderFulfilment

## Properties

 Name                   | Type                                                | Description                                                                                                                                                                                                                                       | Notes      
------------------------|-----------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------
 **method**             | **String**                                          | The fulfilment method. Fulfilled by the retailer (FBR) or fulfilled by bol.com (FBB).                                                                                                                                                             | [optional] 
 **distributionParty**  | [**DistributionPartyEnum**](#DistributionPartyEnum) | The party that manages the distribution, either bol.com or the retailer itself.                                                                                                                                                                   | [optional] 
 **latestDeliveryDate** | [**LocalDate**](LocalDate.md)                       | The ultimate delivery date at which this order must be delivered at the customer&#39;s shipping address. This field is empty in case the exactDeliveryDate is filled.                                                                             | [optional] 
 **exactDeliveryDate**  | [**LocalDate**](LocalDate.md)                       | The exact delivery date at which this order must be delivered at the customer&#39;s shipping address. This field is only filled when the customer chose an exact date for delivery. This field is empty in case the latestDeliveryDate is filled. | [optional] 
 **expiryDate**         | [**LocalDate**](LocalDate.md)                       | The date this order item will automatically expire and thereby cancelling this order item from the order.                                                                                                                                         | [optional] 
 **timeFrameType**      | [**TimeFrameTypeEnum**](#TimeFrameTypeEnum)         | Delivery option selected by the customer.                                                                                                                                                                                                         | [optional] 

<a name="DistributionPartyEnum"></a>

## Enum: DistributionPartyEnum

 Name     | Value                
----------|----------------------
 RETAILER | &quot;RETAILER&quot; 
 BOL      | &quot;BOL&quot;      

<a name="TimeFrameTypeEnum"></a>

## Enum: TimeFrameTypeEnum

 Name        | Value                   
-------------|-------------------------
 REGULAR     | &quot;REGULAR&quot;     
 EVENING     | &quot;EVENING&quot;     
 APPOINTMENT | &quot;APPOINTMENT&quot; 
 SAMEDAY     | &quot;SAMEDAY&quot;     
 SUNDAY      | &quot;SUNDAY&quot;      



