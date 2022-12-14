/*
 * v8 - Retailer API
 * The bol.com API for retailers.
 *
 * OpenAPI spec version: 8.x
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package be.datafarmhouse.bol.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Stock
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class Stock {
    @SerializedName("amount")
    private Integer amount = null;

    @SerializedName("correctedStock")
    private Integer correctedStock = null;

    @SerializedName("managedByRetailer")
    private Boolean managedByRetailer = null;

    public Stock amount(Integer amount) {
        this.amount = amount;
        return this;
    }

    /**
     * The amount of stock available for the specified product present in the retailers warehouse. Note: this should not be the FBB stock! Defaults to 0.
     *
     * @return amount
     **/
    @ApiModelProperty(example = "6", value = "The amount of stock available for the specified product present in the retailers warehouse. Note: this should not be the FBB stock! Defaults to 0.")
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Stock correctedStock(Integer correctedStock) {
        this.correctedStock = correctedStock;
        return this;
    }

    /**
     * The amount of order items in stock minus handled order items and minus open order items. As compared to the stock you sent us. When this reaches 0, your offer will not be for sale on the shop.
     *
     * @return correctedStock
     **/
    @ApiModelProperty(example = "5", value = "The amount of order items in stock minus handled order items and minus open order items. As compared to the stock you sent us. When this reaches 0, your offer will not be for sale on the shop.")
    public Integer getCorrectedStock() {
        return correctedStock;
    }

    public void setCorrectedStock(Integer correctedStock) {
        this.correctedStock = correctedStock;
    }

    public Stock managedByRetailer(Boolean managedByRetailer) {
        this.managedByRetailer = managedByRetailer;
        return this;
    }

    /**
     * Configures whether the retailer manages the stock levels or that bol.com should calculate the corrected stock based on actual open orders. In case the configuration is set to &#39;false&#39;, all open orders are used to calculate the corrected stock. In case the configuration is set to &#39;true&#39;, only orders that are placed after the last offer update are taken into account.
     *
     * @return managedByRetailer
     **/
    @ApiModelProperty(example = "false", required = true, value = "Configures whether the retailer manages the stock levels or that bol.com should calculate the corrected stock based on actual open orders. In case the configuration is set to 'false', all open orders are used to calculate the corrected stock. In case the configuration is set to 'true', only orders that are placed after the last offer update are taken into account.")
    public Boolean isManagedByRetailer() {
        return managedByRetailer;
    }

    public void setManagedByRetailer(Boolean managedByRetailer) {
        this.managedByRetailer = managedByRetailer;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Stock stock = (Stock) o;
        return Objects.equals(this.amount, stock.amount) &&
                Objects.equals(this.correctedStock, stock.correctedStock) &&
                Objects.equals(this.managedByRetailer, stock.managedByRetailer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, correctedStock, managedByRetailer);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Stock {\n");

        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    correctedStock: ").append(toIndentedString(correctedStock)).append("\n");
        sb.append("    managedByRetailer: ").append(toIndentedString(managedByRetailer)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

