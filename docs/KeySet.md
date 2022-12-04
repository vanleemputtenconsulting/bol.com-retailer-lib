# KeySet

## Properties

 Name          | Type                      | Description                                                                          | Notes      
---------------|---------------------------|--------------------------------------------------------------------------------------|------------
 **id**        | **String**                | Key identifier. Maps to the keyId value in the signature header of the push request. | [optional] 
 **type**      | [**TypeEnum**](#TypeEnum) | Key encryption type.                                                                 | [optional] 
 **publicKey** | **String**                | The Base64 encoded public key to use when verifying the signature.                   | [optional] 

<a name="TypeEnum"></a>

## Enum: TypeEnum

 Name | Value           
------|-----------------
 RSA  | &quot;RSA&quot; 



