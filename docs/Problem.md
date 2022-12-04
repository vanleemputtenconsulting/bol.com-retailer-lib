# Problem

## Properties

 Name           | Type                                      | Description                                                                                            | Notes      
----------------|-------------------------------------------|--------------------------------------------------------------------------------------------------------|------------
 **type**       | **String**                                | Type URI for this problem. Fixed value: https://api.bol.com/problems.                                  | [optional] 
 **title**      | **String**                                | Title describing the nature of the problem.                                                            | [optional] 
 **status**     | **Integer**                               | HTTP status returned from the endpoint causing the problem.                                            | [optional] 
 **detail**     | **String**                                | Detailed error message describing in additional detail what caused the service to return this problem. | [optional] 
 **host**       | **String**                                | Host identifier describing the server instance that reported the problem.                              | [optional] 
 **instance**   | **String**                                | Full URI path of the resource that reported the problem.                                               | [optional] 
 **violations** | [**List&lt;Violation&gt;**](Violation.md) |                                                                                                        | 



