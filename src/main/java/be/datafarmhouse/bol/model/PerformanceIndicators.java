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
 * PerformanceIndicators
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class PerformanceIndicators {
    @SerializedName("performanceIndicators")
    private List<PerformanceIndicator> performanceIndicators = new ArrayList<PerformanceIndicator>();

    public PerformanceIndicators performanceIndicators(List<PerformanceIndicator> performanceIndicators) {
        this.performanceIndicators = performanceIndicators;
        return this;
    }

    public PerformanceIndicators addPerformanceIndicatorsItem(PerformanceIndicator performanceIndicatorsItem) {
        this.performanceIndicators.add(performanceIndicatorsItem);
        return this;
    }

    /**
     * Get performanceIndicators
     *
     * @return performanceIndicators
     **/
    @ApiModelProperty(required = true, value = "")
    public List<PerformanceIndicator> getPerformanceIndicators() {
        return performanceIndicators;
    }

    public void setPerformanceIndicators(List<PerformanceIndicator> performanceIndicators) {
        this.performanceIndicators = performanceIndicators;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PerformanceIndicators performanceIndicators = (PerformanceIndicators) o;
        return Objects.equals(this.performanceIndicators, performanceIndicators.performanceIndicators);
    }

    @Override
    public int hashCode() {
        return Objects.hash(performanceIndicators);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PerformanceIndicators {\n");

        sb.append("    performanceIndicators: ").append(toIndentedString(performanceIndicators)).append("\n");
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

