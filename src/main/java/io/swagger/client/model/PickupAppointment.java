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
import org.threeten.bp.OffsetDateTime;

import java.io.IOException;
import java.util.Objects;

/**
 * PickupAppointment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class PickupAppointment {
    @SerializedName("commentToTransporter")
    private String commentToTransporter = null;

    @SerializedName("address")
    private Address address = null;

    @SerializedName("pickupTimeSlot")
    private ReplenishmentPickupTimeSlot pickupTimeSlot = null;

    @SerializedName("pickupDateTime")
    private OffsetDateTime pickupDateTime = null;

    /**
     * In case of a pickup cancellation this field indicates the reason for cancelling this pickup.
     */
    @JsonAdapter(CancellationReasonEnum.Adapter.class)
    public enum CancellationReasonEnum {
        UNKNOWN_ADDRESS("UNKNOWN_ADDRESS"),

        NOT_READY("NOT_READY"),

        NO_LABEL("NO_LABEL"),

        WRONG_PACKAGE("WRONG_PACKAGE"),

        NOT_AT_HOME("NOT_AT_HOME"),

        OTHER_REASON("OTHER_REASON"),

        REQUEST_FROM_RETAILER("REQUEST_FROM_RETAILER");

        private String value;

        CancellationReasonEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static CancellationReasonEnum fromValue(String text) {
            for (CancellationReasonEnum b : CancellationReasonEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<CancellationReasonEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final CancellationReasonEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public CancellationReasonEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return CancellationReasonEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("cancellationReason")
    private CancellationReasonEnum cancellationReason = null;

    public PickupAppointment commentToTransporter(String commentToTransporter) {
        this.commentToTransporter = commentToTransporter;
        return this;
    }

    /**
     * A comment to the transporter regarding the pickup appointment.
     *
     * @return commentToTransporter
     **/
    @ApiModelProperty(example = "Eerste verdieping.", value = "A comment to the transporter regarding the pickup appointment.")
    public String getCommentToTransporter() {
        return commentToTransporter;
    }

    public void setCommentToTransporter(String commentToTransporter) {
        this.commentToTransporter = commentToTransporter;
    }

    public PickupAppointment address(Address address) {
        this.address = address;
        return this;
    }

    /**
     * Get address
     *
     * @return address
     **/
    @ApiModelProperty(required = true, value = "")
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PickupAppointment pickupTimeSlot(ReplenishmentPickupTimeSlot pickupTimeSlot) {
        this.pickupTimeSlot = pickupTimeSlot;
        return this;
    }

    /**
     * Get pickupTimeSlot
     *
     * @return pickupTimeSlot
     **/
    @ApiModelProperty(required = true, value = "")
    public ReplenishmentPickupTimeSlot getPickupTimeSlot() {
        return pickupTimeSlot;
    }

    public void setPickupTimeSlot(ReplenishmentPickupTimeSlot pickupTimeSlot) {
        this.pickupTimeSlot = pickupTimeSlot;
    }

    public PickupAppointment pickupDateTime(OffsetDateTime pickupDateTime) {
        this.pickupDateTime = pickupDateTime;
        return this;
    }

    /**
     * The date and time in ISO 8601 format when this replenishment was picked up by the transporter.
     *
     * @return pickupDateTime
     **/
    @ApiModelProperty(example = "2021-01-01T09:00:00+01:00", value = "The date and time in ISO 8601 format when this replenishment was picked up by the transporter.")
    public OffsetDateTime getPickupDateTime() {
        return pickupDateTime;
    }

    public void setPickupDateTime(OffsetDateTime pickupDateTime) {
        this.pickupDateTime = pickupDateTime;
    }

    public PickupAppointment cancellationReason(CancellationReasonEnum cancellationReason) {
        this.cancellationReason = cancellationReason;
        return this;
    }

    /**
     * In case of a pickup cancellation this field indicates the reason for cancelling this pickup.
     *
     * @return cancellationReason
     **/
    @ApiModelProperty(example = "NOT_AT_HOME", value = "In case of a pickup cancellation this field indicates the reason for cancelling this pickup.")
    public CancellationReasonEnum getCancellationReason() {
        return cancellationReason;
    }

    public void setCancellationReason(CancellationReasonEnum cancellationReason) {
        this.cancellationReason = cancellationReason;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PickupAppointment pickupAppointment = (PickupAppointment) o;
        return Objects.equals(this.commentToTransporter, pickupAppointment.commentToTransporter) &&
                Objects.equals(this.address, pickupAppointment.address) &&
                Objects.equals(this.pickupTimeSlot, pickupAppointment.pickupTimeSlot) &&
                Objects.equals(this.pickupDateTime, pickupAppointment.pickupDateTime) &&
                Objects.equals(this.cancellationReason, pickupAppointment.cancellationReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commentToTransporter, address, pickupTimeSlot, pickupDateTime, cancellationReason);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PickupAppointment {\n");

        sb.append("    commentToTransporter: ").append(toIndentedString(commentToTransporter)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    pickupTimeSlot: ").append(toIndentedString(pickupTimeSlot)).append("\n");
        sb.append("    pickupDateTime: ").append(toIndentedString(pickupDateTime)).append("\n");
        sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
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

