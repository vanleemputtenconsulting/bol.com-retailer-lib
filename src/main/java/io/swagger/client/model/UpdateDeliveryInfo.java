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
 * UpdateDeliveryInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class UpdateDeliveryInfo {
    @SerializedName("expectedDeliveryDate")
    private String expectedDeliveryDate = null;

    public UpdateDeliveryInfo expectedDeliveryDate(String expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
        return this;
    }

    /**
     * The expected delivery date of the shipment at the bol.com warehouse. In ISO 8601 format.
     *
     * @return expectedDeliveryDate
     **/
    @ApiModelProperty(example = "2021-01-01", value = "The expected delivery date of the shipment at the bol.com warehouse. In ISO 8601 format.")
    public String getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    public void setExpectedDeliveryDate(String expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDeliveryInfo updateDeliveryInfo = (UpdateDeliveryInfo) o;
        return Objects.equals(this.expectedDeliveryDate, updateDeliveryInfo.expectedDeliveryDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expectedDeliveryDate);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDeliveryInfo {\n");

        sb.append("    expectedDeliveryDate: ").append(toIndentedString(expectedDeliveryDate)).append("\n");
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

