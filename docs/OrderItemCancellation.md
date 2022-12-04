# OrderItemCancellation

## Properties

 Name            | Type                                  | Description                                                                                              | Notes 
-----------------|---------------------------------------|----------------------------------------------------------------------------------------------------------|-------
 **orderItemId** | **String**                            | The id for the order item. One order can have multiple order items, but the list can only take one item. |
 **reasonCode**  | [**ReasonCodeEnum**](#ReasonCodeEnum) | The code representing the reason for cancellation of this item.                                          |

<a name="ReasonCodeEnum"></a>

## Enum: ReasonCodeEnum

 Name                  | Value                             
-----------------------|-----------------------------------
 OUT_OF_STOCK          | &quot;OUT_OF_STOCK&quot;          
 REQUESTED_BY_CUSTOMER | &quot;REQUESTED_BY_CUSTOMER&quot; 
 BAD_CONDITION         | &quot;BAD_CONDITION&quot;         
 HIGHER_SHIPCOST       | &quot;HIGHER_SHIPCOST&quot;       
 INCORRECT_PRICE       | &quot;INCORRECT_PRICE&quot;       
 NOT_AVAIL_IN_TIME     | &quot;NOT_AVAIL_IN_TIME&quot;     
 NO_BOL_GUARANTEE      | &quot;NO_BOL_GUARANTEE&quot;      
 ORDERED_TWICE         | &quot;ORDERED_TWICE&quot;         
 RETAIN_ITEM           | &quot;RETAIN_ITEM&quot;           
 TECH_ISSUE            | &quot;TECH_ISSUE&quot;            
 UNFINDABLE_ITEM       | &quot;UNFINDABLE_ITEM&quot;       
 OTHER                 | &quot;OTHER&quot;                 



