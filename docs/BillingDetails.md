# BillingDetails

## Properties

 Name                        | Type                                  | Description                                                                                                                                      | Notes      
-----------------------------|---------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------|------------
 **salutation**              | [**SalutationEnum**](#SalutationEnum) | The salutation of the customer.                                                                                                                  | [optional] 
 **firstName**               | **String**                            | The first name of the customer.                                                                                                                  | [optional] 
 **surname**                 | **String**                            | The surname of the customer.                                                                                                                     | [optional] 
 **streetName**              | **String**                            | The street name.                                                                                                                                 | [optional] 
 **houseNumber**             | **String**                            | The house number.                                                                                                                                | [optional] 
 **houseNumberExtension**    | **String**                            | The extension on the house number.                                                                                                               | [optional] 
 **extraAddressInformation** | **String**                            | Additional information related to the address that helps in delivering the package.                                                              | [optional] 
 **zipCode**                 | **String**                            | The ZIP code in &#39;1234AB&#39; format for NL orders and &#39;0000&#39; format for BE orders.                                                   | [optional] 
 **city**                    | **String**                            | The name of the city.                                                                                                                            | [optional] 
 **countryCode**             | **String**                            | The country code.                                                                                                                                | [optional] 
 **email**                   | **String**                            | A scrambled email address that can be used to contact the customer.                                                                              | [optional] 
 **company**                 | **String**                            | The company name.                                                                                                                                | [optional] 
 **vatNumber**               | **String**                            | The Value Added Tax (VAT) / BTW number for business sellers situated in the Netherlands.                                                         | [optional] 
 **kvkNumber**               | **String**                            | The Kamer van Koophandel (kvk) number for organizations situated in the Netherlands or ondernemingsnummer for organizations situated in Belgium. | [optional] 
 **orderReference**          | **String**                            | The order reference specified by the customer when ordering a product.                                                                           | [optional] 

<a name="SalutationEnum"></a>

## Enum: SalutationEnum

 Name    | Value               
---------|---------------------
 MALE    | &quot;MALE&quot;    
 FEMALE  | &quot;FEMALE&quot;  
 UNKNOWN | &quot;UNKNOWN&quot; 



