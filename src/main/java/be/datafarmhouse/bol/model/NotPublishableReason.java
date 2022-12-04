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
 * NotPublishableReason
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class NotPublishableReason {
    @SerializedName("code")
    private String code = null;

    @SerializedName("description")
    private String description = null;

    public NotPublishableReason code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Error code signalling that the offer is invalid.
     *
     * @return code
     **/
    @ApiModelProperty(example = "4003", required = true, value = "Error code signalling that the offer is invalid.")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public NotPublishableReason description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Error message describing the reason the offer is invalid.
     *
     * @return description
     **/
    @ApiModelProperty(example = "The seller is on holiday.", required = true, value = "Error message describing the reason the offer is invalid.")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NotPublishableReason notPublishableReason = (NotPublishableReason) o;
        return Objects.equals(this.code, notPublishableReason.code) &&
                Objects.equals(this.description, notPublishableReason.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, description);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotPublishableReason {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
