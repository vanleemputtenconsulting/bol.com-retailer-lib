# DeliveryInformation

## Properties

 Name                     | Type                                                | Description                                                                             | Notes 
--------------------------|-----------------------------------------------------|-----------------------------------------------------------------------------------------|-------
 **expectedDeliveryDate** | [**LocalDate**](LocalDate.md)                       | The expected delivery date of the shipment at the bol.com warehouse in ISO 8601 format. |
 **transporterCode**      | [**TransporterCodeEnum**](#TransporterCodeEnum)     | The transporter that will pickup this replenishment.                                    |
 **destinationWarehouse** | [**DestinationWarehouse**](DestinationWarehouse.md) |                                                                                         |

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



