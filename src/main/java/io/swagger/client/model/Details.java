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
 * Details
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class Details {
    @SerializedName("period")
    private PerformanceIndicatorPeriod period = null;

    @SerializedName("score")
    private Score score = null;

    @SerializedName("norm")
    private Norm norm = null;

    public Details period(PerformanceIndicatorPeriod period) {
        this.period = period;
        return this;
    }

    /**
     * The period for which the performance is measured.
     *
     * @return period
     **/
    @ApiModelProperty(required = true, value = "The period for which the performance is measured.")
    public PerformanceIndicatorPeriod getPeriod() {
        return period;
    }

    public void setPeriod(PerformanceIndicatorPeriod period) {
        this.period = period;
    }

    public Details score(Score score) {
        this.score = score;
        return this;
    }

    /**
     * The score for this measurement. In case there are no scores for an indicator, this element is omitted from the response.
     *
     * @return score
     **/
    @ApiModelProperty(value = "The score for this measurement. In case there are no scores for an indicator, this element is omitted from the response.")
    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public Details norm(Norm norm) {
        this.norm = norm;
        return this;
    }

    /**
     * Service norm for this indicator.
     *
     * @return norm
     **/
    @ApiModelProperty(required = true, value = "Service norm for this indicator.")
    public Norm getNorm() {
        return norm;
    }

    public void setNorm(Norm norm) {
        this.norm = norm;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Details details = (Details) o;
        return Objects.equals(this.period, details.period) &&
                Objects.equals(this.score, details.score) &&
                Objects.equals(this.norm, details.norm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(period, score, norm);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Details {\n");

        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    norm: ").append(toIndentedString(norm)).append("\n");
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

