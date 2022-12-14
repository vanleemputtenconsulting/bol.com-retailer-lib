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
 * ReducedReturnItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class ReducedReturnItem {
    @SerializedName("rmaId")
    private String rmaId = null;

    @SerializedName("orderId")
    private String orderId = null;

    @SerializedName("ean")
    private String ean = null;

    @SerializedName("expectedQuantity")
    private Integer expectedQuantity = null;

    @SerializedName("returnReason")
    private ReturnReason returnReason = null;

    @SerializedName("handled")
    private Boolean handled = null;

    @SerializedName("processingResults")
    private List<ReturnProcessingResult> processingResults = new ArrayList<ReturnProcessingResult>();

    public ReducedReturnItem rmaId(String rmaId) {
        this.rmaId = rmaId;
        return this;
    }

    /**
     * The RMA (Return Merchandise Authorization) identifier of the return.
     *
     * @return rmaId
     **/
    @ApiModelProperty(example = "31234567", required = true, value = "The RMA (Return Merchandise Authorization) identifier of the return.")
    public String getRmaId() {
        return rmaId;
    }

    public void setRmaId(String rmaId) {
        this.rmaId = rmaId;
    }

    public ReducedReturnItem orderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * The id of the customer order this return item is in.
     *
     * @return orderId
     **/
    @ApiModelProperty(example = "4012345678", required = true, value = "The id of the customer order this return item is in.")
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ReducedReturnItem ean(String ean) {
        this.ean = ean;
        return this;
    }

    /**
     * The EAN number associated with this product.
     *
     * @return ean
     **/
    @ApiModelProperty(example = "9789076174082", required = true, value = "The EAN number associated with this product.")
    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public ReducedReturnItem expectedQuantity(Integer expectedQuantity) {
        this.expectedQuantity = expectedQuantity;
        return this;
    }

    /**
     * The quantity that is expected to be returned by the customer. Note: this can be greater than 1 in case the customer ordered a quantity greater than 1 of the same product in the same customer order.
     *
     * @return expectedQuantity
     **/
    @ApiModelProperty(example = "1", required = true, value = "The quantity that is expected to be returned by the customer. Note: this can be greater than 1 in case the customer ordered a quantity greater than 1 of the same product in the same customer order.")
    public Integer getExpectedQuantity() {
        return expectedQuantity;
    }

    public void setExpectedQuantity(Integer expectedQuantity) {
        this.expectedQuantity = expectedQuantity;
    }

    public ReducedReturnItem returnReason(ReturnReason returnReason) {
        this.returnReason = returnReason;
        return this;
    }

    /**
     * Get returnReason
     *
     * @return returnReason
     **/
    @ApiModelProperty(value = "")
    public ReturnReason getReturnReason() {
        return returnReason;
    }

    public void setReturnReason(ReturnReason returnReason) {
        this.returnReason = returnReason;
    }

    public ReducedReturnItem handled(Boolean handled) {
        this.handled = handled;
        return this;
    }

    /**
     * Indicates if this return item has been handled (by the retailer).
     *
     * @return handled
     **/
    @ApiModelProperty(example = "true", value = "Indicates if this return item has been handled (by the retailer).")
    public Boolean isHandled() {
        return handled;
    }

    public void setHandled(Boolean handled) {
        this.handled = handled;
    }

    public ReducedReturnItem processingResults(List<ReturnProcessingResult> processingResults) {
        this.processingResults = processingResults;
        return this;
    }

    public ReducedReturnItem addProcessingResultsItem(ReturnProcessingResult processingResultsItem) {
        this.processingResults.add(processingResultsItem);
        return this;
    }

    /**
     * Get processingResults
     *
     * @return processingResults
     **/
    @ApiModelProperty(required = true, value = "")
    public List<ReturnProcessingResult> getProcessingResults() {
        return processingResults;
    }

    public void setProcessingResults(List<ReturnProcessingResult> processingResults) {
        this.processingResults = processingResults;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReducedReturnItem reducedReturnItem = (ReducedReturnItem) o;
        return Objects.equals(this.rmaId, reducedReturnItem.rmaId) &&
                Objects.equals(this.orderId, reducedReturnItem.orderId) &&
                Objects.equals(this.ean, reducedReturnItem.ean) &&
                Objects.equals(this.expectedQuantity, reducedReturnItem.expectedQuantity) &&
                Objects.equals(this.returnReason, reducedReturnItem.returnReason) &&
                Objects.equals(this.handled, reducedReturnItem.handled) &&
                Objects.equals(this.processingResults, reducedReturnItem.processingResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rmaId, orderId, ean, expectedQuantity, returnReason, handled, processingResults);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReducedReturnItem {\n");

        sb.append("    rmaId: ").append(toIndentedString(rmaId)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    ean: ").append(toIndentedString(ean)).append("\n");
        sb.append("    expectedQuantity: ").append(toIndentedString(expectedQuantity)).append("\n");
        sb.append("    returnReason: ").append(toIndentedString(returnReason)).append("\n");
        sb.append("    handled: ").append(toIndentedString(handled)).append("\n");
        sb.append("    processingResults: ").append(toIndentedString(processingResults)).append("\n");
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

