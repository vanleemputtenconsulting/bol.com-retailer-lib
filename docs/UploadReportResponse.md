# UploadReportResponse

## Properties

 Name           | Type                                                              | Description                                 | Notes      
----------------|-------------------------------------------------------------------|---------------------------------------------|------------
 **uploadId**   | **String**                                                        | The identifier of the upload report.        |
 **language**   | [**LanguageEnum**](#LanguageEnum)                                 | The language in which content is submitted. |
 **status**     | [**StatusEnum**](#StatusEnum)                                     | The current status of the upload report.    |
 **attributes** | [**List&lt;UploadReportAttribute&gt;**](UploadReportAttribute.md) |                                             |
 **assets**     | [**List&lt;UploadReportAsset&gt;**](UploadReportAsset.md)         |                                             | [optional] 

<a name="LanguageEnum"></a>

## Enum: LanguageEnum

 Name  | Value             
-------|-------------------
 NL    | &quot;nl&quot;    
 NL_BE | &quot;nl-BE&quot; 
 FR    | &quot;fr&quot;    
 FR_BE | &quot;fr-BE&quot; 

<a name="StatusEnum"></a>

## Enum: StatusEnum

 Name        | Value                   
-------------|-------------------------
 IN_PROGRESS | &quot;IN_PROGRESS&quot; 
 COMPLETED   | &quot;COMPLETED&quot;   



