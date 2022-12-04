# UploadReportAsset

## Properties

 Name                     | Type                                | Description                                            | Notes      
--------------------------|-------------------------------------|--------------------------------------------------------|------------
 **url**                  | **String**                          | The URL of the asset.                                  |
 **labels**               | **List&lt;String&gt;**              | The label(s) of the asset.                             |
 **status**               | [**StatusEnum**](#StatusEnum)       | The processing state of the submitted asset.           |
 **subStatus**            | [**SubStatusEnum**](#SubStatusEnum) | The reason code explaining why the value was rejected. | [optional] 
 **subStatusDescription** | **String**                          | The reason explaining why the value was rejected.      | [optional] 

<a name="StatusEnum"></a>

## Enum: StatusEnum

 Name        | Value                   
-------------|-------------------------
 IN_PROGRESS | &quot;IN_PROGRESS&quot; 
 DECLINED    | &quot;DECLINED&quot;    
 PUBLISHED   | &quot;PUBLISHED&quot;   

<a name="SubStatusEnum"></a>

## Enum: SubStatusEnum

 Name                            | Value                                       
---------------------------------|---------------------------------------------
 DELETED                         | &quot;DELETED&quot;                         
 DOWNLOAD_FAILED_404             | &quot;DOWNLOAD_FAILED_404&quot;             
 DOWNLOAD_FAILED_UNAUTHORIZED    | &quot;DOWNLOAD_FAILED_UNAUTHORIZED&quot;    
 IMAGE_FLAGGED_AS_DUPLICATE      | &quot;IMAGE_FLAGGED_AS_DUPLICATE&quot;      
 IMAGE_RATE_LIMITED              | &quot;IMAGE_RATE_LIMITED&quot;              
 IMPORT_FAILED                   | &quot;IMPORT_FAILED&quot;                   
 LABEL_UPDATED                   | &quot;LABEL_UPDATED&quot;                   
 MATCH_TO_PRODUCT_FAILED         | &quot;MATCH_TO_PRODUCT_FAILED&quot;         
 NOT_VALID_FOR_IMPORT            | &quot;NOT_VALID_FOR_IMPORT&quot;            
 PUBLISHED                       | &quot;PUBLISHED&quot;                       
 RECEIVED                        | &quot;RECEIVED&quot;                        
 SCORED_OTHER_IMAGE_WON          | &quot;SCORED_OTHER_IMAGE_WON&quot;          
 STORED                          | &quot;STORED&quot;                          
 SUPPLIED_FLAGGED_AS_BLACKLISTED | &quot;SUPPLIED_FLAGGED_AS_BLACKLISTED&quot; 
 UNKNOWN                         | &quot;UNKNOWN&quot;                         
 UNPUBLISHED                     | &quot;UNPUBLISHED&quot;                     
 UNSUPPORTED_MIMETYPE            | &quot;UNSUPPORTED_MIMETYPE&quot;            
 UPLOAD_CANCELLED                | &quot;UPLOAD_CANCELLED&quot;                
 UPLOAD_DEADLINE_REACHED         | &quot;UPLOAD_DEADLINE_REACHED&quot;         
 UPLOAD_FAILED                   | &quot;UPLOAD_FAILED&quot;                   
 UPLOAD_REJECTED                 | &quot;UPLOAD_REJECTED&quot;                 



