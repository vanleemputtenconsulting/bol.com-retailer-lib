# Condition

## Properties

 Name         | Type                              | Description                                                                                                            | Notes      
--------------|-----------------------------------|------------------------------------------------------------------------------------------------------------------------|------------
 **name**     | [**NameEnum**](#NameEnum)         | The condition of the offered product.                                                                                  |
 **category** | [**CategoryEnum**](#CategoryEnum) | The category of the condition. If not given NEW or SECONDHAND is derived from NAME.                                    | [optional] 
 **comment**  | **String**                        | The description of the condition of the product. Only allowed if name is not NEW and may not contain e-mail addresses. | [optional] 

<a name="NameEnum"></a>

## Enum: NameEnum

 Name       | Value                  
------------|------------------------
 NEW        | &quot;NEW&quot;        
 AS_NEW     | &quot;AS_NEW&quot;     
 GOOD       | &quot;GOOD&quot;       
 REASONABLE | &quot;REASONABLE&quot; 
 MODERATE   | &quot;MODERATE&quot;   

<a name="CategoryEnum"></a>

## Enum: CategoryEnum

 Name       | Value                  
------------|------------------------
 NEW        | &quot;NEW&quot;        
 SECONDHAND | &quot;SECONDHAND&quot; 



