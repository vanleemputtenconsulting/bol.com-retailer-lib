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
 * UploadReportValue
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class UploadReportValue {
    @SerializedName("value")
    private String value = null;

    @SerializedName("unitId")
    private String unitId = null;

    public UploadReportValue value(String value) {
        this.value = value;
        return this;
    }

    /**
     * The value of the attribute.
     *
     * @return value
     **/
    @ApiModelProperty(example = "14.5", required = true, value = "The value of the attribute.")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public UploadReportValue unitId(String unitId) {
        this.unitId = unitId;
        return this;
    }

    /**
     * The unit identifier of the attribute.
     *
     * @return unitId
     **/
    @ApiModelProperty(example = "mm", value = "The unit identifier of the attribute.")
    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UploadReportValue uploadReportValue = (UploadReportValue) o;
        return Objects.equals(this.value, uploadReportValue.value) &&
                Objects.equals(this.unitId, uploadReportValue.unitId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unitId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadReportValue {\n");

        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    unitId: ").append(toIndentedString(unitId)).append("\n");
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

