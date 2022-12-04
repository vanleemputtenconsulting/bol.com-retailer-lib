# UpdateReplenishmentRequest

## Properties

 Name                     | Type                                                      | Description                                                                                                               | Notes      
--------------------------|-----------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|------------
 **state**                | [**StateEnum**](#StateEnum)                               | Update the state of the replenishment to cancel the replenishment.                                                        | [optional] 
 **deliveryInfo**         | [**UpdateDeliveryInfo**](UpdateDeliveryInfo.md)           |                                                                                                                           | [optional] 
 **numberOfLoadCarriers** | **Integer**                                               | The number of parcels in this replenishment. Note: if you are using the bol.com pickup service, the maximum number is 20. | [optional] 
 **loadCarriers**         | [**List&lt;UpdateLoadCarrier&gt;**](UpdateLoadCarrier.md) |                                                                                                                           | [optional] 

<a name="StateEnum"></a>

## Enum: StateEnum

 Name      | Value                 
-----------|-----------------------
 CANCELLED | &quot;CANCELLED&quot; 



