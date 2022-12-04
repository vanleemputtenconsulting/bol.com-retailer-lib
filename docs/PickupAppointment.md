# PickupAppointment

## Properties

 Name                     | Type                                                              | Description                                                                                    | Notes      
--------------------------|-------------------------------------------------------------------|------------------------------------------------------------------------------------------------|------------
 **commentToTransporter** | **String**                                                        | A comment to the transporter regarding the pickup appointment.                                 | [optional] 
 **address**              | [**Address**](Address.md)                                         |                                                                                                |
 **pickupTimeSlot**       | [**ReplenishmentPickupTimeSlot**](ReplenishmentPickupTimeSlot.md) |                                                                                                |
 **pickupDateTime**       | [**OffsetDateTime**](OffsetDateTime.md)                           | The date and time in ISO 8601 format when this replenishment was picked up by the transporter. | [optional] 
 **cancellationReason**   | [**CancellationReasonEnum**](#CancellationReasonEnum)             | In case of a pickup cancellation this field indicates the reason for cancelling this pickup.   | [optional] 

<a name="CancellationReasonEnum"></a>

## Enum: CancellationReasonEnum

 Name                  | Value                             
-----------------------|-----------------------------------
 UNKNOWN_ADDRESS       | &quot;UNKNOWN_ADDRESS&quot;       
 NOT_READY             | &quot;NOT_READY&quot;             
 NO_LABEL              | &quot;NO_LABEL&quot;              
 WRONG_PACKAGE         | &quot;WRONG_PACKAGE&quot;         
 NOT_AT_HOME           | &quot;NOT_AT_HOME&quot;           
 OTHER_REASON          | &quot;OTHER_REASON&quot;          
 REQUEST_FROM_RETAILER | &quot;REQUEST_FROM_RETAILER&quot; 



