# CreateDeliveryInfo

## Properties

 Name                     | Type                                            | Description                                                                              | Notes 
--------------------------|-------------------------------------------------|------------------------------------------------------------------------------------------|-------
 **expectedDeliveryDate** | **String**                                      | The expected delivery date of the shipment at the bol.com warehouse. In ISO 8601 format. |
 **transporterCode**      | [**TransporterCodeEnum**](#TransporterCodeEnum) | The transporter code that correlates to the transport used for this replenishment.       |

<a name="TransporterCodeEnum"></a>

## Enum: TransporterCodeEnum

 Name   | Value              
--------|--------------------
 POSTNL | &quot;POSTNL&quot; 
 DHL    | &quot;DHL&quot;    
 DPD    | &quot;DPD&quot;    
 GLS    | &quot;GLS&quot;    
 UPS    | &quot;UPS&quot;    
 OTHER  | &quot;OTHER&quot;  



