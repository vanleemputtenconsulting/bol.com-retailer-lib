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
 * UpdateLoadCarrier
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class UpdateLoadCarrier {
    @SerializedName("sscc")
    private String sscc = null;

    public UpdateLoadCarrier sscc(String sscc) {
        this.sscc = sscc;
        return this;
    }

    /**
     * The Serial Shipping Container Code (SSCC) for this load carrier.
     *
     * @return sscc
     **/
    @ApiModelProperty(example = "020001200000007000", value = "The Serial Shipping Container Code (SSCC) for this load carrier.")
    public String getSscc() {
        return sscc;
    }

    public void setSscc(String sscc) {
        this.sscc = sscc;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateLoadCarrier updateLoadCarrier = (UpdateLoadCarrier) o;
        return Objects.equals(this.sscc, updateLoadCarrier.sscc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sscc);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLoadCarrier {\n");

        sb.append("    sscc: ").append(toIndentedString(sscc)).append("\n");
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

