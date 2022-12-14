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
 * PackageRestrictions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class PackageRestrictions {
    @SerializedName("maxWeight")
    private String maxWeight = null;

    @SerializedName("maxDimensions")
    private String maxDimensions = null;

    public PackageRestrictions maxWeight(String maxWeight) {
        this.maxWeight = maxWeight;
        return this;
    }

    /**
     * The weight of a package.
     *
     * @return maxWeight
     **/
    @ApiModelProperty(example = "10 kg", required = true, value = "The weight of a package.")
    public String getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(String maxWeight) {
        this.maxWeight = maxWeight;
    }

    public PackageRestrictions maxDimensions(String maxDimensions) {
        this.maxDimensions = maxDimensions;
        return this;
    }

    /**
     * The dimensions of a package.
     *
     * @return maxDimensions
     **/
    @ApiModelProperty(example = "10 x 10 x 10 cm", required = true, value = "The dimensions of a package.")
    public String getMaxDimensions() {
        return maxDimensions;
    }

    public void setMaxDimensions(String maxDimensions) {
        this.maxDimensions = maxDimensions;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PackageRestrictions packageRestrictions = (PackageRestrictions) o;
        return Objects.equals(this.maxWeight, packageRestrictions.maxWeight) &&
                Objects.equals(this.maxDimensions, packageRestrictions.maxDimensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxWeight, maxDimensions);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PackageRestrictions {\n");

        sb.append("    maxWeight: ").append(toIndentedString(maxWeight)).append("\n");
        sb.append("    maxDimensions: ").append(toIndentedString(maxDimensions)).append("\n");
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

