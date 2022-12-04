# BundlePrice

## Properties

 Name          | Type                            | Description                                                                                                                                                                                                                      | Notes 
---------------|---------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------
 **quantity**  | **Integer**                     | The minimum quantity a customer must order in order to receive discount. The element with value 1 must at least be present. In case of using more elements, the respective quantities must be in increasing order.               |
 **unitPrice** | [**BigDecimal**](BigDecimal.md) | The price per single unit including VAT in case the customer orders at least the quantity provided. When using more than 1 price, the respective prices must be in decreasing order using 2 decimal precision and dot separated. | 



