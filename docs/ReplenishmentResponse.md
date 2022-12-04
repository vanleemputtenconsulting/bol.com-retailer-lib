# ReplenishmentResponse

## Properties

 Name                     | Type                                                                    | Description                                                                | Notes      
--------------------------|-------------------------------------------------------------------------|----------------------------------------------------------------------------|------------
 **replenishmentId**      | **String**                                                              | The unique identifier of the replenishment.                                |
 **creationDateTime**     | [**OffsetDateTime**](OffsetDateTime.md)                                 | The date and time when this replenishment was created. In ISO 8601 format. |
 **reference**            | **String**                                                              | Custom user defined reference to identify the replenishment.               |
 **labelingByBol**        | **Boolean**                                                             | Indicates whether the replenishment will be labeled by bol.com or not.     |
 **state**                | [**StateEnum**](#StateEnum)                                             | Indicates the state of this replenishment order.                           |
 **deliveryInformation**  | [**DeliveryInformation**](DeliveryInformation.md)                       |                                                                            |
 **pickupAppointment**    | [**PickupAppointment**](PickupAppointment.md)                           |                                                                            | [optional] 
 **numberOfLoadCarriers** | **Integer**                                                             | The number of load carriers in this shipment.                              | [optional] 
 **loadCarriers**         | [**List&lt;LoadCarrier&gt;**](LoadCarrier.md)                           |                                                                            |
 **lines**                | [**List&lt;ReplenishmentLine&gt;**](ReplenishmentLine.md)               |                                                                            |
 **invalidLines**         | [**List&lt;InvalidReplenishmentLine&gt;**](InvalidReplenishmentLine.md) |                                                                            |
 **stateTransitions**     | [**List&lt;StateTransition&gt;**](StateTransition.md)                   |                                                                            |

<a name="StateEnum"></a>

## Enum: StateEnum

 Name              | Value                         
-------------------|-------------------------------
 ANNOUNCED         | &quot;ANNOUNCED&quot;         
 IN_TRANSIT        | &quot;IN_TRANSIT&quot;        
 ARRIVED_AT_WH     | &quot;ARRIVED_AT_WH&quot;     
 IN_PROGRESS_AT_WH | &quot;IN_PROGRESS_AT_WH&quot; 
 CANCELLED         | &quot;CANCELLED&quot;         
 DONE              | &quot;DONE&quot;              



