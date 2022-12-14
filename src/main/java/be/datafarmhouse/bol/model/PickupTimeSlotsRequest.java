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
 * PickupTimeSlotsRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class PickupTimeSlotsRequest {
    @SerializedName("address")
    private PickupTimeSlotsAddress address = null;

    @SerializedName("numberOfLoadCarriers")
    private Integer numberOfLoadCarriers = null;

    public PickupTimeSlotsRequest address(PickupTimeSlotsAddress address) {
        this.address = address;
        return this;
    }

    /**
     * Get address
     *
     * @return address
     **/
    @ApiModelProperty(required = true, value = "")
    public PickupTimeSlotsAddress getAddress() {
        return address;
    }

    public void setAddress(PickupTimeSlotsAddress address) {
        this.address = address;
    }

    public PickupTimeSlotsRequest numberOfLoadCarriers(Integer numberOfLoadCarriers) {
        this.numberOfLoadCarriers = numberOfLoadCarriers;
        return this;
    }

    /**
     * The number of load carriers in this shipment.
     * minimum: 1
     * maximum: 50
     *
     * @return numberOfLoadCarriers
     **/
    @ApiModelProperty(example = "1", required = true, value = "The number of load carriers in this shipment.")
    public Integer getNumberOfLoadCarriers() {
        return numberOfLoadCarriers;
    }

    public void setNumberOfLoadCarriers(Integer numberOfLoadCarriers) {
        this.numberOfLoadCarriers = numberOfLoadCarriers;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PickupTimeSlotsRequest pickupTimeSlotsRequest = (PickupTimeSlotsRequest) o;
        return Objects.equals(this.address, pickupTimeSlotsRequest.address) &&
                Objects.equals(this.numberOfLoadCarriers, pickupTimeSlotsRequest.numberOfLoadCarriers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, numberOfLoadCarriers);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PickupTimeSlotsRequest {\n");

        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    numberOfLoadCarriers: ").append(toIndentedString(numberOfLoadCarriers)).append("\n");
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

