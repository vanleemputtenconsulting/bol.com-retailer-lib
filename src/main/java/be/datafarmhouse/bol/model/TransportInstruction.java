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
 * TransportInstruction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class TransportInstruction {
    @SerializedName("transporterCode")
    private String transporterCode = null;

    @SerializedName("trackAndTrace")
    private String trackAndTrace = null;

    public TransportInstruction transporterCode(String transporterCode) {
        this.transporterCode = transporterCode;
        return this;
    }

    /**
     * Specify the transporter that will carry out the shipment.
     *
     * @return transporterCode
     **/
    @ApiModelProperty(example = "TNT", value = "Specify the transporter that will carry out the shipment.")
    public String getTransporterCode() {
        return transporterCode;
    }

    public void setTransporterCode(String transporterCode) {
        this.transporterCode = transporterCode;
    }

    public TransportInstruction trackAndTrace(String trackAndTrace) {
        this.trackAndTrace = trackAndTrace;
        return this;
    }

    /**
     * The track and trace code that is associated with this transport.
     *
     * @return trackAndTrace
     **/
    @ApiModelProperty(example = "3SBOL0987654321", value = "The track and trace code that is associated with this transport.")
    public String getTrackAndTrace() {
        return trackAndTrace;
    }

    public void setTrackAndTrace(String trackAndTrace) {
        this.trackAndTrace = trackAndTrace;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransportInstruction transportInstruction = (TransportInstruction) o;
        return Objects.equals(this.transporterCode, transportInstruction.transporterCode) &&
                Objects.equals(this.trackAndTrace, transportInstruction.trackAndTrace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transporterCode, trackAndTrace);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransportInstruction {\n");

        sb.append("    transporterCode: ").append(toIndentedString(transporterCode)).append("\n");
        sb.append("    trackAndTrace: ").append(toIndentedString(trackAndTrace)).append("\n");
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

