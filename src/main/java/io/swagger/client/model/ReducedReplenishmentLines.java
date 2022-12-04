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


package io.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * ReducedReplenishmentLines
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class ReducedReplenishmentLines {
    @SerializedName("ean")
    private String ean = null;

    public ReducedReplenishmentLines ean(String ean) {
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


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReducedReplenishmentLines reducedReplenishmentLines = (ReducedReplenishmentLines) o;
        return Objects.equals(this.ean, reducedReplenishmentLines.ean);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ean);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReducedReplenishmentLines {\n");

        sb.append("    ean: ").append(toIndentedString(ean)).append("\n");
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

