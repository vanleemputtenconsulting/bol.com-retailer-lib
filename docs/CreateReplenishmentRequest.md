# CreateReplenishmentRequest

## Properties

 Name                     | Type                                                                  | Description                                                                                                               | Notes      
--------------------------|-----------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|------------
 **reference**            | **String**                                                            | Custom user reference for this replenishment. Must contain at least 1 digit and only upper case characters allowed.       |
 **deliveryInfo**         | [**CreateDeliveryInfo**](CreateDeliveryInfo.md)                       |                                                                                                                           | [optional] 
 **labelingByBol**        | **Boolean**                                                           | Indicates whether the replenishment will be labeled by bol.com.                                                           |
 **numberOfLoadCarriers** | **Integer**                                                           | The number of parcels in this replenishment. Note: if you are using the bol.com pickup service, the maximum number is 20. |
 **pickupAppointment**    | [**CreatePickupAppointment**](CreatePickupAppointment.md)             |                                                                                                                           | [optional] 
 **lines**                | [**List&lt;CreateReplenishmentLine&gt;**](CreateReplenishmentLine.md) |                                                                                                                           | 



