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
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * ReturnProcessingResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class ReturnProcessingResult {
    @SerializedName("quantity")
    private Integer quantity = null;

    @SerializedName("processingResult")
    private String processingResult = null;

    @SerializedName("handlingResult")
    private String handlingResult = null;

    @SerializedName("processingDateTime")
    private OffsetDateTime processingDateTime = null;

    public ReturnProcessingResult quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * The processed quantity.
     *
     * @return quantity
     **/
    @ApiModelProperty(example = "1", required = true, value = "The processed quantity.")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public ReturnProcessingResult processingResult(String processingResult) {
        this.processingResult = processingResult;
        return this;
    }

    /**
     * The processing result of the return.
     *
     * @return processingResult
     **/
    @ApiModelProperty(example = "ACCEPTED", value = "The processing result of the return.")
    public String getProcessingResult() {
        return processingResult;
    }

    public void setProcessingResult(String processingResult) {
        this.processingResult = processingResult;
    }

    public ReturnProcessingResult handlingResult(String handlingResult) {
        this.handlingResult = handlingResult;
        return this;
    }

    /**
     * The handling result requested by the retailer.
     *
     * @return handlingResult
     **/
    @ApiModelProperty(example = "RETURN_RECEIVED", required = true, value = "The handling result requested by the retailer.")
    public String getHandlingResult() {
        return handlingResult;
    }

    public void setHandlingResult(String handlingResult) {
        this.handlingResult = handlingResult;
    }

    public ReturnProcessingResult processingDateTime(OffsetDateTime processingDateTime) {
        this.processingDateTime = processingDateTime;
        return this;
    }

    /**
     * The date and time in ISO 8601 format when the return was processed.
     *
     * @return processingDateTime
     **/
    @ApiModelProperty(example = "2018-04-17T10:55:37+02:00", required = true, value = "The date and time in ISO 8601 format when the return was processed.")
    public OffsetDateTime getProcessingDateTime() {
        return processingDateTime;
    }

    public void setProcessingDateTime(OffsetDateTime processingDateTime) {
        this.processingDateTime = processingDateTime;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReturnProcessingResult returnProcessingResult = (ReturnProcessingResult) o;
        return Objects.equals(this.quantity, returnProcessingResult.quantity) &&
                Objects.equals(this.processingResult, returnProcessingResult.processingResult) &&
                Objects.equals(this.handlingResult, returnProcessingResult.handlingResult) &&
                Objects.equals(this.processingDateTime, returnProcessingResult.processingDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, processingResult, handlingResult, processingDateTime);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReturnProcessingResult {\n");

        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    processingResult: ").append(toIndentedString(processingResult)).append("\n");
        sb.append("    handlingResult: ").append(toIndentedString(handlingResult)).append("\n");
        sb.append("    processingDateTime: ").append(toIndentedString(processingDateTime)).append("\n");
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

