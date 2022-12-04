# CreateOfferRequest

## Properties

 Name                    | Type                              | Description                                                                                                                                                                                       | Notes      
-------------------------|-----------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------
 **ean**                 | **String**                        | The EAN number associated with this product. Note: in case an ISBN is provided, the ISBN will be replaced with the actual EAN belonging to this ISBN.                                             |
 **condition**           | [**Condition**](Condition.md)     |                                                                                                                                                                                                   |
 **reference**           | **String**                        | A user-defined reference that helps you identify this particular offer when receiving data from us. This element can optionally be left empty and has a maximum amount of 20 characters.          | [optional] 
 **onHoldByRetailer**    | **Boolean**                       | Indicates whether or not you want to put this offer for sale on the bol.com website. Defaults to false.                                                                                           | [optional] 
 **unknownProductTitle** | **String**                        | In case the item is not known to bol.com you can use this field to identify this particular product. Note: in case the product is known to bol.com, the unknown product title will not be stored. | [optional] 
 **pricing**             | [**Pricing**](Pricing.md)         |                                                                                                                                                                                                   |
 **stock**               | [**StockCreate**](StockCreate.md) |                                                                                                                                                                                                   |
 **fulfilment**          | [**Fulfilment**](Fulfilment.md)   |                                                                                                                                                                                                   | 



