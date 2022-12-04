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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ProductDestinationsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class ProductDestinationsResponse {
    @SerializedName("productDestinations")
    private List<ProductDestination> productDestinations = new ArrayList<ProductDestination>();

    public ProductDestinationsResponse productDestinations(List<ProductDestination> productDestinations) {
        this.productDestinations = productDestinations;
        return this;
    }

    public ProductDestinationsResponse addProductDestinationsItem(ProductDestination productDestinationsItem) {
        this.productDestinations.add(productDestinationsItem);
        return this;
    }

    /**
     * Get productDestinations
     *
     * @return productDestinations
     **/
    @ApiModelProperty(required = true, value = "")
    public List<ProductDestination> getProductDestinations() {
        return productDestinations;
    }

    public void setProductDestinations(List<ProductDestination> productDestinations) {
        this.productDestinations = productDestinations;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductDestinationsResponse productDestinationsResponse = (ProductDestinationsResponse) o;
        return Objects.equals(this.productDestinations, productDestinationsResponse.productDestinations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productDestinations);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductDestinationsResponse {\n");

        sb.append("    productDestinations: ").append(toIndentedString(productDestinations)).append("\n");
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
