# InvalidReplenishmentLine

## Properties

 Name                         | Type                      | Description                                                                                                       | Notes 
------------------------------|---------------------------|-------------------------------------------------------------------------------------------------------------------|-------
 **type**                     | [**TypeEnum**](#TypeEnum) | Type of invalid replenishment line, in case the BSKU and/or EAN cannot be determined for this replenishment line. |
 **quantityAnnounced**        | **Integer**               | The amount of announced quantity for this replenishment line.                                                     |
 **quantityReceived**         | **Integer**               | The amount of received quantity for this replenishment line.                                                      |
 **quantityInProgress**       | **Integer**               | The amount of quantity that is still in progress at the warehouse for this replenishment line.                    |
 **quantityWithGradedState**  | **Integer**               | The quantity within this shipment line that has a graded (unsalable) state.                                       |
 **quantityWithRegularState** | **Integer**               | The quantity within this shipment line that has a regular (salable) state.                                        |

<a name="TypeEnum"></a>

## Enum: TypeEnum

 Name                   | Value                                      
------------------------|--------------------------------------------
 FBB_PRODUCT            | &quot;UNKNOWN_FBB_PRODUCT&quot;            
 EAN_INVENTORY_RELATION | &quot;UNKNOWN_EAN_INVENTORY_RELATION&quot; 



