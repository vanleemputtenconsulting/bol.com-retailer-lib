# ShipmentDetails

## Properties

 Name                        | Type                                  | Description                                                                                                           | Notes      
-----------------------------|---------------------------------------|-----------------------------------------------------------------------------------------------------------------------|------------
 **pickupPointName**         | **String**                            | The name of Pick Up Point location this order needs to be shipped to.                                                 | [optional] 
 **salutation**              | [**SalutationEnum**](#SalutationEnum) | The salutation of the customer.                                                                                       | [optional] 
 **firstName**               | **String**                            | The first name of the customer.                                                                                       | [optional] 
 **surname**                 | **String**                            | The surname of the customer.                                                                                          | [optional] 
 **streetName**              | **String**                            | The street name.                                                                                                      | [optional] 
 **houseNumber**             | **String**                            | The house number.                                                                                                     | [optional] 
 **houseNumberExtension**    | **String**                            | The extension on the house number.                                                                                    | [optional] 
 **extraAddressInformation** | **String**                            | Additional information related to the address that helps in delivering the package.                                   | [optional] 
 **zipCode**                 | **String**                            | The ZIP code in &#39;1234AB&#39; format for NL orders and &#39;0000&#39; format for BE orders.                        | [optional] 
 **city**                    | **String**                            | The name of the city.                                                                                                 | [optional] 
 **countryCode**             | **String**                            | The country code.                                                                                                     | [optional] 
 **email**                   | **String**                            | A scrambled email address that can be used to contact the customer.                                                   | [optional] 
 **company**                 | **String**                            | The company name.                                                                                                     | [optional] 
 **deliveryPhoneNumber**     | **String**                            | The delivery phone number of the customer. Filled in case the order requires an appointment for delivering the goods. | [optional] 
 **language**                | [**LanguageEnum**](#LanguageEnum)     | The language of the customer in case of contact.                                                                      | [optional] 

<a name="SalutationEnum"></a>

## Enum: SalutationEnum

 Name    | Value               
---------|---------------------
 MALE    | &quot;MALE&quot;    
 FEMALE  | &quot;FEMALE&quot;  
 UNKNOWN | &quot;UNKNOWN&quot; 

<a name="LanguageEnum"></a>

## Enum: LanguageEnum

 Name  | Value             
-------|-------------------
 NL    | &quot;nl&quot;    
 NL_BE | &quot;nl-BE&quot; 
 FR    | &quot;fr&quot;    
 FR_BE | &quot;fr-BE&quot; 



