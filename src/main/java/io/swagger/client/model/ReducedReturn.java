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
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ReducedReturn
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class ReducedReturn {
    @SerializedName("returnId")
    private String returnId = null;

    @SerializedName("registrationDateTime")
    private OffsetDateTime registrationDateTime = null;

    @SerializedName("fulfilmentMethod")
    private String fulfilmentMethod = null;

    @SerializedName("returnItems")
    private List<ReducedReturnItem> returnItems = new ArrayList<ReducedReturnItem>();

    public ReducedReturn returnId(String returnId) {
        this.returnId = returnId;
        return this;
    }

    /**
     * Unique identifier for a return.
     *
     * @return returnId
     **/
    @ApiModelProperty(example = "1", required = true, value = "Unique identifier for a return.")
    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    public ReducedReturn registrationDateTime(OffsetDateTime registrationDateTime) {
        this.registrationDateTime = registrationDateTime;
        return this;
    }

    /**
     * The date and time in ISO 8601 format when this return was registered.
     *
     * @return registrationDateTime
     **/
    @ApiModelProperty(example = "2016-11-14T11:06:48.423+01:00", required = true, value = "The date and time in ISO 8601 format when this return was registered.")
    public OffsetDateTime getRegistrationDateTime() {
        return registrationDateTime;
    }

    public void setRegistrationDateTime(OffsetDateTime registrationDateTime) {
        this.registrationDateTime = registrationDateTime;
    }

    public ReducedReturn fulfilmentMethod(String fulfilmentMethod) {
        this.fulfilmentMethod = fulfilmentMethod;
        return this;
    }

    /**
     * The fulfilment method. Fulfilled by the retailer (FBR) or fulfilled by bol.com (FBB).
     *
     * @return fulfilmentMethod
     **/
    @ApiModelProperty(example = "FBR", required = true, value = "The fulfilment method. Fulfilled by the retailer (FBR) or fulfilled by bol.com (FBB).")
    public String getFulfilmentMethod() {
        return fulfilmentMethod;
    }

    public void setFulfilmentMethod(String fulfilmentMethod) {
        this.fulfilmentMethod = fulfilmentMethod;
    }

    public ReducedReturn returnItems(List<ReducedReturnItem> returnItems) {
        this.returnItems = returnItems;
        return this;
    }

    public ReducedReturn addReturnItemsItem(ReducedReturnItem returnItemsItem) {
        this.returnItems.add(returnItemsItem);
        return this;
    }

    /**
     * Get returnItems
     *
     * @return returnItems
     **/
    @ApiModelProperty(required = true, value = "")
    public List<ReducedReturnItem> getReturnItems() {
        return returnItems;
    }

    public void setReturnItems(List<ReducedReturnItem> returnItems) {
        this.returnItems = returnItems;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReducedReturn reducedReturn = (ReducedReturn) o;
        return Objects.equals(this.returnId, reducedReturn.returnId) &&
                Objects.equals(this.registrationDateTime, reducedReturn.registrationDateTime) &&
                Objects.equals(this.fulfilmentMethod, reducedReturn.fulfilmentMethod) &&
                Objects.equals(this.returnItems, reducedReturn.returnItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(returnId, registrationDateTime, fulfilmentMethod, returnItems);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReducedReturn {\n");

        sb.append("    returnId: ").append(toIndentedString(returnId)).append("\n");
        sb.append("    registrationDateTime: ").append(toIndentedString(registrationDateTime)).append("\n");
        sb.append("    fulfilmentMethod: ").append(toIndentedString(fulfilmentMethod)).append("\n");
        sb.append("    returnItems: ").append(toIndentedString(returnItems)).append("\n");
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

