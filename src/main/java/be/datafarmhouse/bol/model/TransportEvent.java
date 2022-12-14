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
 * TransportEvent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class TransportEvent {
    /**
     * The transport event code indicates the location of the parcel within the distribution process.
     */
    @JsonAdapter(EventCodeEnum.Adapter.class)
    public enum EventCodeEnum {
        PRE_ANNOUNCED("PRE_ANNOUNCED"),

        AT_TRANSPORTER("AT_TRANSPORTER"),

        IN_TRANSIT("IN_TRANSIT"),

        DELIVERED_AT_NEIGHBOURS("DELIVERED_AT_NEIGHBOURS"),

        DELIVERED_AT_CUSTOMER("DELIVERED_AT_CUSTOMER"),

        PICKED_UP_AT_PICK_UP_POINT("PICKED_UP_AT_PICK_UP_POINT"),

        AT_PICK_UP_POINT("AT_PICK_UP_POINT"),

        RETURNED_TO_SENDER("RETURNED_TO_SENDER");

        private String value;

        EventCodeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static EventCodeEnum fromValue(String text) {
            for (EventCodeEnum b : EventCodeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<EventCodeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final EventCodeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public EventCodeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return EventCodeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("eventCode")
    private EventCodeEnum eventCode = null;

    @SerializedName("eventDateTime")
    private OffsetDateTime eventDateTime = null;

    public TransportEvent eventCode(EventCodeEnum eventCode) {
        this.eventCode = eventCode;
        return this;
    }

    /**
     * The transport event code indicates the location of the parcel within the distribution process.
     *
     * @return eventCode
     **/
    @ApiModelProperty(example = "AT_TRANSPORTER", value = "The transport event code indicates the location of the parcel within the distribution process.")
    public EventCodeEnum getEventCode() {
        return eventCode;
    }

    public void setEventCode(EventCodeEnum eventCode) {
        this.eventCode = eventCode;
    }

    public TransportEvent eventDateTime(OffsetDateTime eventDateTime) {
        this.eventDateTime = eventDateTime;
        return this;
    }

    /**
     * The date time of the transport event.
     *
     * @return eventDateTime
     **/
    @ApiModelProperty(example = "2021-07-28T17:21:07+02:00", value = "The date time of the transport event.")
    public OffsetDateTime getEventDateTime() {
        return eventDateTime;
    }

    public void setEventDateTime(OffsetDateTime eventDateTime) {
        this.eventDateTime = eventDateTime;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransportEvent transportEvent = (TransportEvent) o;
        return Objects.equals(this.eventCode, transportEvent.eventCode) &&
                Objects.equals(this.eventDateTime, transportEvent.eventDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventCode, eventDateTime);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransportEvent {\n");

        sb.append("    eventCode: ").append(toIndentedString(eventCode)).append("\n");
        sb.append("    eventDateTime: ").append(toIndentedString(eventDateTime)).append("\n");
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

