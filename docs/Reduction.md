# Reduction

## Properties

 Name              | Type                            | Description                                                                                 | Notes      
-------------------|---------------------------------|---------------------------------------------------------------------------------------------|------------
 **maximumPrice**  | [**BigDecimal**](BigDecimal.md) | Maximum offer price that can be used to benefit from a commission reduction, including VAT. |
 **costReduction** | [**BigDecimal**](BigDecimal.md) | A reduction to the commission if the maximum price criteria is met, including VAT.          |
 **startDate**     | [**LocalDate**](LocalDate.md)   | The start date from which the commission reduction is valid, in ISO 8601 format.            |
 **endDate**       | [**LocalDate**](LocalDate.md)   | The end date from which the commission reduction is not valid anymore, in ISO 8601 format.  | [optional] 



