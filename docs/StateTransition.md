# StateTransition

## Properties

 Name              | Type                                    | Description                                                                                              | Notes 
-------------------|-----------------------------------------|----------------------------------------------------------------------------------------------------------|-------
 **state**         | [**StateEnum**](#StateEnum)             | Indicates the state of this replenishment order.                                                         |
 **stateDateTime** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time in ISO 8601 format that indicates when this states was updated for this replenishment. |

<a name="StateEnum"></a>

## Enum: StateEnum

 Name              | Value                         
-------------------|-------------------------------
 DRAFT             | &quot;DRAFT&quot;             
 ANNOUNCED         | &quot;ANNOUNCED&quot;         
 IN_TRANSIT        | &quot;IN_TRANSIT&quot;        
 ARRIVED_AT_WH     | &quot;ARRIVED_AT_WH&quot;     
 IN_PROGRESS_AT_WH | &quot;IN_PROGRESS_AT_WH&quot; 
 CANCELLED         | &quot;CANCELLED&quot;         
 DONE              | &quot;DONE&quot;              



