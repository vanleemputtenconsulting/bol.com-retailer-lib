# HandoverDetails

## Properties

 Name                         | Type                                              | Description                                                                                                                                                                                                                                                                                                         | Notes      
------------------------------|---------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------
 **meetsCustomerExpectation** | **Boolean**                                       | Indicates if you can use this label without receiving a strike if you handover before the latestHandoverDateTime. If this field is &#39;false&#39; you can still buy and use this label but it will have negative consequences on your performance score because the order will be delivered too early or too late. | [optional] 
 **earliestHandoverDateTime** | [**OffsetDateTime**](OffsetDateTime.md)           | The date and time at which the parcel can be earliest  at the transporter to make sure your parcel is delivered on time.                                                                                                                                                                                            | [optional] 
 **latestHandoverDateTime**   | [**OffsetDateTime**](OffsetDateTime.md)           | The date and time at which the parcel must ultimately be at the transporter to make sure your parcel is delivered on time. If you handover after this date you will receive a strike because you order will be delivered too late.                                                                                  | [optional] 
 **collectionMethod**         | [**CollectionMethodEnum**](#CollectionMethodEnum) | The type of collection for this parcel.                                                                                                                                                                                                                                                                             | [optional] 

<a name="CollectionMethodEnum"></a>

## Enum: CollectionMethodEnum

 Name     | Value                
----------|----------------------
 DROP_OFF | &quot;DROP_OFF&quot; 
 PICK_UP  | &quot;PICK_UP&quot;  



