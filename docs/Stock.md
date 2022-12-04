# Stock

## Properties

 Name                  | Type        | Description                                                                                                                                                                                                                                                                                                                                                                                    | Notes      
-----------------------|-------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------
 **amount**            | **Integer** | The amount of stock available for the specified product present in the retailers warehouse. Note: this should not be the FBB stock! Defaults to 0.                                                                                                                                                                                                                                             | [optional] 
 **correctedStock**    | **Integer** | The amount of order items in stock minus handled order items and minus open order items. As compared to the stock you sent us. When this reaches 0, your offer will not be for sale on the shop.                                                                                                                                                                                               | [optional] 
 **managedByRetailer** | **Boolean** | Configures whether the retailer manages the stock levels or that bol.com should calculate the corrected stock based on actual open orders. In case the configuration is set to &#39;false&#39;, all open orders are used to calculate the corrected stock. In case the configuration is set to &#39;true&#39;, only orders that are placed after the last offer update are taken into account. | 



