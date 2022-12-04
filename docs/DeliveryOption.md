# DeliveryOption

## Properties

 Name                     | Type                                              | Description                                                                                                                                                                                                      | Notes      
--------------------------|---------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------
 **shippingLabelOfferId** | **String**                                        | Unique identifier for the shipping label offer.                                                                                                                                                                  |
 **recommended**          | **Boolean**                                       | Indicates whether this delivery option is recommended to be the best option to ship your order item(s) with.                                                                                                     |
 **validUntilDate**       | [**LocalDate**](LocalDate.md)                     | The date until the delivery option (incl total price) is valid.                                                                                                                                                  | [optional] 
 **transporterCode**      | **String**                                        | A code representing the transporter which is being used for transportation.                                                                                                                                      |
 **labelType**            | [**LabelTypeEnum**](#LabelTypeEnum)               | The type of the label, representing the way an item is being transported. MAILBOX is a mailbox package with delivery scan. MAILBOX_LIGHT is a mailbox package without delivery scan. PARCEL is a normal package. |
 **labelDisplayName**     | **String**                                        | The display name of the shipping label.                                                                                                                                                                          |
 **labelPrice**           | [**LabelPrice**](LabelPrice.md)                   |                                                                                                                                                                                                                  |
 **packageRestrictions**  | [**PackageRestrictions**](PackageRestrictions.md) |                                                                                                                                                                                                                  |
 **handoverDetails**      | [**HandoverDetails**](HandoverDetails.md)         |                                                                                                                                                                                                                  | [optional] 

<a name="LabelTypeEnum"></a>

## Enum: LabelTypeEnum

 Name          | Value                     
---------------|---------------------------
 PARCEL        | &quot;PARCEL&quot;        
 MAILBOX       | &quot;MAILBOX&quot;       
 MAILBOX_LIGHT | &quot;MAILBOX_LIGHT&quot; 



