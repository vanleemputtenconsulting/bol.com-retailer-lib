# ShipmentFulfilment

## Properties

 Name                   | Type                                                | Description                                                                                                                                                           | Notes      
------------------------|-----------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------
 **method**             | [**MethodEnum**](#MethodEnum)                       | The fulfilment method. Fulfilled by the retailer (FBR) or fulfilled by bol.com (FBB).                                                                                 | [optional] 
 **distributionParty**  | [**DistributionPartyEnum**](#DistributionPartyEnum) | The party that manages the distribution, either bol.com or the retailer itself.                                                                                       | [optional] 
 **latestDeliveryDate** | [**LocalDate**](LocalDate.md)                       | The ultimate delivery date at which this order must be delivered at the customer&#39;s shipping address. This field is empty in case the exactDeliveryDate is filled. | [optional] 

<a name="MethodEnum"></a>

## Enum: MethodEnum

 Name | Value           
------|-----------------
 FBR  | &quot;FBR&quot; 
 FBB  | &quot;FBB&quot; 

<a name="DistributionPartyEnum"></a>

## Enum: DistributionPartyEnum

 Name     | Value                
----------|----------------------
 RETAILER | &quot;RETAILER&quot; 
 BOL      | &quot;BOL&quot;      



