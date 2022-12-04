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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The configuration of order items to get delivery options for.
 */
@ApiModel(description = "The configuration of order items to get delivery options for.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class ShippingLabelRequest {
    @SerializedName("orderItems")
    private List<DeliveryOptionsRequestOrderItem> orderItems = new ArrayList<DeliveryOptionsRequestOrderItem>();

    @SerializedName("shippingLabelOfferId")
    private String shippingLabelOfferId = null;

    public ShippingLabelRequest orderItems(List<DeliveryOptionsRequestOrderItem> orderItems) {
        this.orderItems = orderItems;
        return this;
    }

    public ShippingLabelRequest addOrderItemsItem(DeliveryOptionsRequestOrderItem orderItemsItem) {
        this.orderItems.add(orderItemsItem);
        return this;
    }

    /**
     * Order items for which the delivery options are requested.
     *
     * @return orderItems
     **/
    @ApiModelProperty(required = true, value = "Order items for which the delivery options are requested.")
    public List<DeliveryOptionsRequestOrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<DeliveryOptionsRequestOrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public ShippingLabelRequest shippingLabelOfferId(String shippingLabelOfferId) {
        this.shippingLabelOfferId = shippingLabelOfferId;
        return this;
    }

    /**
     * Shipping label offer id for which you request a shipping label.
     *
     * @return shippingLabelOfferId
     **/
    @ApiModelProperty(example = "027b79fa-5743-40f0-94c7-0eac761af611", required = true, value = "Shipping label offer id for which you request a shipping label.")
    public String getShippingLabelOfferId() {
        return shippingLabelOfferId;
    }

    public void setShippingLabelOfferId(String shippingLabelOfferId) {
        this.shippingLabelOfferId = shippingLabelOfferId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShippingLabelRequest shippingLabelRequest = (ShippingLabelRequest) o;
        return Objects.equals(this.orderItems, shippingLabelRequest.orderItems) &&
                Objects.equals(this.shippingLabelOfferId, shippingLabelRequest.shippingLabelOfferId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderItems, shippingLabelOfferId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShippingLabelRequest {\n");

        sb.append("    orderItems: ").append(toIndentedString(orderItems)).append("\n");
        sb.append("    shippingLabelOfferId: ").append(toIndentedString(shippingLabelOfferId)).append("\n");
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
