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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * UpdateReplenishmentRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class UpdateReplenishmentRequest {
    /**
     * Update the state of the replenishment to cancel the replenishment.
     */
    @JsonAdapter(StateEnum.Adapter.class)
    public enum StateEnum {
        CANCELLED("CANCELLED");

        private String value;

        StateEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StateEnum fromValue(String text) {
            for (StateEnum b : StateEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<StateEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StateEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StateEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("state")
    private StateEnum state = null;

    @SerializedName("deliveryInfo")
    private UpdateDeliveryInfo deliveryInfo = null;

    @SerializedName("numberOfLoadCarriers")
    private Integer numberOfLoadCarriers = null;

    @SerializedName("loadCarriers")
    private List<UpdateLoadCarrier> loadCarriers = null;

    public UpdateReplenishmentRequest state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * Update the state of the replenishment to cancel the replenishment.
     *
     * @return state
     **/
    @ApiModelProperty(example = "CANCELLED", value = "Update the state of the replenishment to cancel the replenishment.")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public UpdateReplenishmentRequest deliveryInfo(UpdateDeliveryInfo deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
        return this;
    }

    /**
     * Get deliveryInfo
     *
     * @return deliveryInfo
     **/
    @ApiModelProperty(value = "")
    public UpdateDeliveryInfo getDeliveryInfo() {
        return deliveryInfo;
    }

    public void setDeliveryInfo(UpdateDeliveryInfo deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
    }

    public UpdateReplenishmentRequest numberOfLoadCarriers(Integer numberOfLoadCarriers) {
        this.numberOfLoadCarriers = numberOfLoadCarriers;
        return this;
    }

    /**
     * The number of parcels in this replenishment. Note: if you are using the bol.com pickup service, the maximum number is 20.
     * minimum: 1
     * maximum: 66
     *
     * @return numberOfLoadCarriers
     **/
    @ApiModelProperty(example = "10", value = "The number of parcels in this replenishment. Note: if you are using the bol.com pickup service, the maximum number is 20.")
    public Integer getNumberOfLoadCarriers() {
        return numberOfLoadCarriers;
    }

    public void setNumberOfLoadCarriers(Integer numberOfLoadCarriers) {
        this.numberOfLoadCarriers = numberOfLoadCarriers;
    }

    public UpdateReplenishmentRequest loadCarriers(List<UpdateLoadCarrier> loadCarriers) {
        this.loadCarriers = loadCarriers;
        return this;
    }

    public UpdateReplenishmentRequest addLoadCarriersItem(UpdateLoadCarrier loadCarriersItem) {
        if (this.loadCarriers == null) {
            this.loadCarriers = new ArrayList<UpdateLoadCarrier>();
        }
        this.loadCarriers.add(loadCarriersItem);
        return this;
    }

    /**
     * Get loadCarriers
     *
     * @return loadCarriers
     **/
    @ApiModelProperty(value = "")
    public List<UpdateLoadCarrier> getLoadCarriers() {
        return loadCarriers;
    }

    public void setLoadCarriers(List<UpdateLoadCarrier> loadCarriers) {
        this.loadCarriers = loadCarriers;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateReplenishmentRequest updateReplenishmentRequest = (UpdateReplenishmentRequest) o;
        return Objects.equals(this.state, updateReplenishmentRequest.state) &&
                Objects.equals(this.deliveryInfo, updateReplenishmentRequest.deliveryInfo) &&
                Objects.equals(this.numberOfLoadCarriers, updateReplenishmentRequest.numberOfLoadCarriers) &&
                Objects.equals(this.loadCarriers, updateReplenishmentRequest.loadCarriers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, deliveryInfo, numberOfLoadCarriers, loadCarriers);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateReplenishmentRequest {\n");

        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    deliveryInfo: ").append(toIndentedString(deliveryInfo)).append("\n");
        sb.append("    numberOfLoadCarriers: ").append(toIndentedString(numberOfLoadCarriers)).append("\n");
        sb.append("    loadCarriers: ").append(toIndentedString(loadCarriers)).append("\n");
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

