# TransportEvent

## Properties

 Name              | Type                                    | Description                                                                                    | Notes      
-------------------|-----------------------------------------|------------------------------------------------------------------------------------------------|------------
 **eventCode**     | [**EventCodeEnum**](#EventCodeEnum)     | The transport event code indicates the location of the parcel within the distribution process. | [optional] 
 **eventDateTime** | [**OffsetDateTime**](OffsetDateTime.md) | The date time of the transport event.                                                          | [optional] 

<a name="EventCodeEnum"></a>

## Enum: EventCodeEnum

 Name                       | Value                                  
----------------------------|----------------------------------------
 PRE_ANNOUNCED              | &quot;PRE_ANNOUNCED&quot;              
 AT_TRANSPORTER             | &quot;AT_TRANSPORTER&quot;             
 IN_TRANSIT                 | &quot;IN_TRANSIT&quot;                 
 DELIVERED_AT_NEIGHBOURS    | &quot;DELIVERED_AT_NEIGHBOURS&quot;    
 DELIVERED_AT_CUSTOMER      | &quot;DELIVERED_AT_CUSTOMER&quot;      
 PICKED_UP_AT_PICK_UP_POINT | &quot;PICKED_UP_AT_PICK_UP_POINT&quot; 
 AT_PICK_UP_POINT           | &quot;AT_PICK_UP_POINT&quot;           
 RETURNED_TO_SENDER         | &quot;RETURNED_TO_SENDER&quot;         



