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
 * Inventory
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class Inventory {
    @SerializedName("ean")
    private String ean = null;

    @SerializedName("bsku")
    private String bsku = null;

    @SerializedName("gradedStock")
    private Integer gradedStock = null;

    @SerializedName("regularStock")
    private Integer regularStock = null;

    @SerializedName("title")
    private String title = null;

    public Inventory ean(String ean) {
        this.ean = ean;
        return this;
    }

    /**
     * The EAN number associated with this product.
     *
     * @return ean
     **/
    @ApiModelProperty(example = "0000007740404", required = true, value = "The EAN number associated with this product.")
    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public Inventory bsku(String bsku) {
        this.bsku = bsku;
        return this;
    }

    /**
     * The BSKU number associated with this product.
     *
     * @return bsku
     **/
    @ApiModelProperty(example = "2950002126612", required = true, value = "The BSKU number associated with this product.")
    public String getBsku() {
        return bsku;
    }

    public void setBsku(String bsku) {
        this.bsku = bsku;
    }

    public Inventory gradedStock(Integer gradedStock) {
        this.gradedStock = gradedStock;
        return this;
    }

    /**
     * The stock that is not available for sale anymore.
     *
     * @return gradedStock
     **/
    @ApiModelProperty(example = "10", required = true, value = "The stock that is not available for sale anymore.")
    public Integer getGradedStock() {
        return gradedStock;
    }

    public void setGradedStock(Integer gradedStock) {
        this.gradedStock = gradedStock;
    }

    public Inventory regularStock(Integer regularStock) {
        this.regularStock = regularStock;
        return this;
    }

    /**
     * The stock that is available for sale.
     *
     * @return regularStock
     **/
    @ApiModelProperty(example = "10", required = true, value = "The stock that is available for sale.")
    public Integer getRegularStock() {
        return regularStock;
    }

    public void setRegularStock(Integer regularStock) {
        this.regularStock = regularStock;
    }

    public Inventory title(String title) {
        this.title = title;
        return this;
    }

    /**
     * The product title.
     *
     * @return title
     **/
    @ApiModelProperty(example = "Product Title", required = true, value = "The product title.")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Inventory inventory = (Inventory) o;
        return Objects.equals(this.ean, inventory.ean) &&
                Objects.equals(this.bsku, inventory.bsku) &&
                Objects.equals(this.gradedStock, inventory.gradedStock) &&
                Objects.equals(this.regularStock, inventory.regularStock) &&
                Objects.equals(this.title, inventory.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ean, bsku, gradedStock, regularStock, title);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Inventory {\n");

        sb.append("    ean: ").append(toIndentedString(ean)).append("\n");
        sb.append("    bsku: ").append(toIndentedString(bsku)).append("\n");
        sb.append("    gradedStock: ").append(toIndentedString(gradedStock)).append("\n");
        sb.append("    regularStock: ").append(toIndentedString(regularStock)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

