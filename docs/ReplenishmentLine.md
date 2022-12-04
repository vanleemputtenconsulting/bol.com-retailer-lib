# ReplenishmentLine

## Properties

 Name                         | Type                                | Description                                                                                    | Notes 
------------------------------|-------------------------------------|------------------------------------------------------------------------------------------------|-------
 **ean**                      | **String**                          | The EAN number associated with this product.                                                   |
 **lineState**                | [**LineStateEnum**](#LineStateEnum) | The state of the line indicating whether this line was announced within this replenishment.    |
 **quantityAnnounced**        | **Integer**                         | The amount of announced quantity for this replenishment line.                                  |
 **quantityReceived**         | **Integer**                         | The amount of received quantity for this replenishment line.                                   |
 **quantityInProgress**       | **Integer**                         | The amount of quantity that is still in progress at the warehouse for this replenishment line. |
 **quantityWithGradedState**  | **Integer**                         | The quantity within this shipment line that has a graded (unsalable) state.                    |
 **quantityWithRegularState** | **Integer**                         | The quantity within this shipment line that has a regular (salable) state.                     |

<a name="LineStateEnum"></a>

## Enum: LineStateEnum

 Name        | Value                   
-------------|-------------------------
 ANNOUNCED   | &quot;ANNOUNCED&quot;   
 UNANNOUNCED | &quot;UNANNOUNCED&quot; 
 UNKNOWN     | &quot;UNKNOWN&quot;     



