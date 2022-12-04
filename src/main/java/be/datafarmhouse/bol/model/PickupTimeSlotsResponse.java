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
 * PickupTimeSlotsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class PickupTimeSlotsResponse {
    @SerializedName("timeSlots")
    private List<PickupTimeSlot> timeSlots = null;

    public PickupTimeSlotsResponse timeSlots(List<PickupTimeSlot> timeSlots) {
        this.timeSlots = timeSlots;
        return this;
    }

    public PickupTimeSlotsResponse addTimeSlotsItem(PickupTimeSlot timeSlotsItem) {
        if (this.timeSlots == null) {
            this.timeSlots = new ArrayList<PickupTimeSlot>();
        }
        this.timeSlots.add(timeSlotsItem);
        return this;
    }

    /**
     * Get timeSlots
     *
     * @return timeSlots
     **/
    @ApiModelProperty(value = "")
    public List<PickupTimeSlot> getTimeSlots() {
        return timeSlots;
    }

    public void setTimeSlots(List<PickupTimeSlot> timeSlots) {
        this.timeSlots = timeSlots;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PickupTimeSlotsResponse pickupTimeSlotsResponse = (PickupTimeSlotsResponse) o;
        return Objects.equals(this.timeSlots, pickupTimeSlotsResponse.timeSlots);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeSlots);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PickupTimeSlotsResponse {\n");

        sb.append("    timeSlots: ").append(toIndentedString(timeSlots)).append("\n");
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
