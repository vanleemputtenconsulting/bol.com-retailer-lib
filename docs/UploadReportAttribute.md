# UploadReportAttribute

## Properties

 Name                     | Type                                                      | Description                                                      | Notes      
--------------------------|-----------------------------------------------------------|------------------------------------------------------------------|------------
 **id**                   | **String**                                                | The identifier of the attribute for which the value has changed. |
 **values**               | [**List&lt;UploadReportValue&gt;**](UploadReportValue.md) |                                                                  |
 **status**               | [**StatusEnum**](#StatusEnum)                             | The processing state of the submitted attribute.                 |
 **subStatus**            | [**SubStatusEnum**](#SubStatusEnum)                       | The reason code explaining why the value was rejected.           | [optional] 
 **subStatusDescription** | **String**                                                | The reason explaining why the value was rejected.                | [optional] 

<a name="StatusEnum"></a>

## Enum: StatusEnum

 Name        | Value                   
-------------|-------------------------
 IN_PROGRESS | &quot;IN_PROGRESS&quot; 
 DECLINED    | &quot;DECLINED&quot;    
 PUBLISHED   | &quot;PUBLISHED&quot;   

<a name="SubStatusEnum"></a>

## Enum: SubStatusEnum

 Name                                      | Value                                                 
-------------------------------------------|-------------------------------------------------------
 BLOCKED_BY_RATE_LIMITER                   | &quot;BLOCKED_BY_RATE_LIMITER&quot;                   
 CREATED                                   | &quot;CREATED&quot;                                   
 DEPRECATED                                | &quot;DEPRECATED&quot;                                
 IDENTICAL_VALUE_AS_BEFORE                 | &quot;IDENTICAL_VALUE_AS_BEFORE&quot;                 
 MATCH_TO_PRODUCT_FAILED                   | &quot;MATCH_TO_PRODUCT_FAILED&quot;                   
 NOT_CHANGED                               | &quot;NOT_CHANGED&quot;                               
 NOT_RECENT                                | &quot;NOT_RECENT&quot;                                
 PROCESSING_STARTED                        | &quot;PROCESSING_STARTED&quot;                        
 RECEIVED                                  | &quot;RECEIVED&quot;                                  
 REJECTED                                  | &quot;REJECTED&quot;                                  
 REJECTED_BY_BRAND_AUTHORITY               | &quot;REJECTED_BY_BRAND_AUTHORITY&quot;               
 REJECTED_BY_LOGISTIC                      | &quot;REJECTED_BY_LOGISTIC&quot;                      
 REJECTED_NO_DATA                          | &quot;REJECTED_NO_DATA&quot;                          
 REJECTED_UNPROCESSABLE                    | &quot;REJECTED_UNPROCESSABLE&quot;                    
 SELECTED                                  | &quot;SELECTED&quot;                                  
 SELECTED_BY_BRAND_AUTHORITY               | &quot;SELECTED_BY_BRAND_AUTHORITY&quot;               
 SELECTED_BY_LOGISTIC                      | &quot;SELECTED_BY_LOGISTIC&quot;                      
 SELECTION_DELETED                         | &quot;SELECTION_DELETED&quot;                         
 SELECTION_MERGED                          | &quot;SELECTION_MERGED&quot;                          
 TIMED_OUT                                 | &quot;TIMED_OUT&quot;                                 
 UPDATED                                   | &quot;UPDATED&quot;                                   
 UPLOADED                                  | &quot;UPLOADED&quot;                                  
 UNKNOWN                                   | &quot;UNKNOWN&quot;                                   
 VALID_EAN                                 | &quot;VALID_EAN&quot;                                 
 VALIDATED                                 | &quot;VALIDATED&quot;                                 
 VALIDATION_FAILED                         | &quot;VALIDATION_FAILED&quot;                         
 VALIDATION_FAILED_DISABLED_GPC_CODE       | &quot;VALIDATION_FAILED_DISABLED_GPC_CODE&quot;       
 VALIDATION_FAILED_DOES_NOT_EXIST          | &quot;VALIDATION_FAILED_DOES_NOT_EXIST&quot;          
 VALIDATION_FAILED_INVALID_DATE            | &quot;VALIDATION_FAILED_INVALID_DATE&quot;            
 VALIDATION_FAILED_INVALID_EAN             | &quot;VALIDATION_FAILED_INVALID_EAN&quot;             
 VALIDATION_FAILED_INVALID_FRACTION        | &quot;VALIDATION_FAILED_INVALID_FRACTION&quot;        
 VALIDATION_FAILED_INVALID_GPC_CODE        | &quot;VALIDATION_FAILED_INVALID_GPC_CODE&quot;        
 VALIDATION_FAILED_INVALID_INTEGER         | &quot;VALIDATION_FAILED_INVALID_INTEGER&quot;         
 VALIDATION_FAILED_INVALID_ISODATE         | &quot;VALIDATION_FAILED_INVALID_ISODATE&quot;         
 VALIDATION_FAILED_INVALID_ISODATETIME     | &quot;VALIDATION_FAILED_INVALID_ISODATETIME&quot;     
 VALIDATION_FAILED_INVALID_LOV_VALUE       | &quot;VALIDATION_FAILED_INVALID_LOV_VALUE&quot;       
 VALIDATION_FAILED_INVALID_MULTIPLE_VALUES | &quot;VALIDATION_FAILED_INVALID_MULTIPLE_VALUES&quot; 
 VALIDATION_FAILED_INVALID_NO_VALUES       | &quot;VALIDATION_FAILED_INVALID_NO_VALUES&quot;       
 VALIDATION_FAILED_INVALID_NUMBER          | &quot;VALIDATION_FAILED_INVALID_NUMBER&quot;          
 VALIDATION_FAILED_INVALID_NUMERIC_TEXT    | &quot;VALIDATION_FAILED_INVALID_NUMERIC_TEXT&quot;    
 VALIDATION_FAILED_INVALID_TEXT            | &quot;VALIDATION_FAILED_INVALID_TEXT&quot;            
 VALIDATION_FAILED_INVALID_UNIT            | &quot;VALIDATION_FAILED_INVALID_UNIT&quot;            
 VALIDATION_FAILED_INVALID_URL             | &quot;VALIDATION_FAILED_INVALID_URL&quot;             
 VALIDATION_FAILED_INVALID_VALUES          | &quot;VALIDATION_FAILED_INVALID_VALUES&quot;          
 VALIDATION_FAILED_NOT_ALLOWED             | &quot;VALIDATION_FAILED_NOT_ALLOWED&quot;             
 VALIDATION_FAILED_UNKNOWN_BASETYPE        | &quot;VALIDATION_FAILED_UNKNOWN_BASETYPE&quot;        
 WAITING_FOR_GLOBAL_ID                     | &quot;WAITING_FOR_GLOBAL_ID&quot;                     



