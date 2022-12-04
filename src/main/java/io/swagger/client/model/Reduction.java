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
import org.threeten.bp.LocalDate;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Reduction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class Reduction {
    @SerializedName("maximumPrice")
    private BigDecimal maximumPrice = null;

    @SerializedName("costReduction")
    private BigDecimal costReduction = null;

    @SerializedName("startDate")
    private LocalDate startDate = null;

    @SerializedName("endDate")
    private LocalDate endDate = null;

    public Reduction maximumPrice(BigDecimal maximumPrice) {
        this.maximumPrice = maximumPrice;
        return this;
    }

    /**
     * Maximum offer price that can be used to benefit from a commission reduction, including VAT.
     *
     * @return maximumPrice
     **/
    @ApiModelProperty(example = "60.0", required = true, value = "Maximum offer price that can be used to benefit from a commission reduction, including VAT.")
    public BigDecimal getMaximumPrice() {
        return maximumPrice;
    }

    public void setMaximumPrice(BigDecimal maximumPrice) {
        this.maximumPrice = maximumPrice;
    }

    public Reduction costReduction(BigDecimal costReduction) {
        this.costReduction = costReduction;
        return this;
    }

    /**
     * A reduction to the commission if the maximum price criteria is met, including VAT.
     *
     * @return costReduction
     **/
    @ApiModelProperty(example = "2.99", required = true, value = "A reduction to the commission if the maximum price criteria is met, including VAT.")
    public BigDecimal getCostReduction() {
        return costReduction;
    }

    public void setCostReduction(BigDecimal costReduction) {
        this.costReduction = costReduction;
    }

    public Reduction startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * The start date from which the commission reduction is valid, in ISO 8601 format.
     *
     * @return startDate
     **/
    @ApiModelProperty(example = "2018-01-01", required = true, value = "The start date from which the commission reduction is valid, in ISO 8601 format.")
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Reduction endDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * The end date from which the commission reduction is not valid anymore, in ISO 8601 format.
     *
     * @return endDate
     **/
    @ApiModelProperty(example = "2018-01-30", value = "The end date from which the commission reduction is not valid anymore, in ISO 8601 format.")
    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Reduction reduction = (Reduction) o;
        return Objects.equals(this.maximumPrice, reduction.maximumPrice) &&
                Objects.equals(this.costReduction, reduction.costReduction) &&
                Objects.equals(this.startDate, reduction.startDate) &&
                Objects.equals(this.endDate, reduction.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maximumPrice, costReduction, startDate, endDate);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Reduction {\n");

        sb.append("    maximumPrice: ").append(toIndentedString(maximumPrice)).append("\n");
        sb.append("    costReduction: ").append(toIndentedString(costReduction)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
