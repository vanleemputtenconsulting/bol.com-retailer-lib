# ProcessStatus

## Properties

 Name                | Type                                    | Description                                                                                                                                     | Notes      
---------------------|-----------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------|------------
 **processStatusId** | **String**                              | The process status id.                                                                                                                          | [optional] 
 **entityId**        | **String**                              | The id of the object being processed. For example, in case of a shipment process id, you will receive the id of the order item being processed. | [optional] 
 **eventType**       | **String**                              | Name of the requested action that is being processed.                                                                                           |
 **description**     | **String**                              | Describes the action that is being processed.                                                                                                   |
 **status**          | [**StatusEnum**](#StatusEnum)           | Status of the action being processed.                                                                                                           |
 **errorMessage**    | **String**                              | Shows error message if applicable.                                                                                                              | [optional] 
 **createTimestamp** | [**OffsetDateTime**](OffsetDateTime.md) | Time of creation of the response.                                                                                                               |
 **links**           | [**List&lt;Link&gt;**](Link.md)         | Lists available actions applicable to this endpoint.                                                                                            |

<a name="StatusEnum"></a>

## Enum: StatusEnum

 Name    | Value               
---------|---------------------
 PENDING | &quot;PENDING&quot; 
 SUCCESS | &quot;SUCCESS&quot; 
 FAILURE | &quot;FAILURE&quot; 
 TIMEOUT | &quot;TIMEOUT&quot; 



