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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * An order.
 */
@ApiModel(description = "An order.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class Order {
    @SerializedName("orderId")
    private String orderId = null;

    @SerializedName("pickupPoint")
    private Boolean pickupPoint = null;

    @SerializedName("orderPlacedDateTime")
    private OffsetDateTime orderPlacedDateTime = null;

    @SerializedName("shipmentDetails")
    private ShipmentDetails shipmentDetails = null;

    @SerializedName("billingDetails")
    private BillingDetails billingDetails = null;

    @SerializedName("orderItems")
    private List<OrderOrderItem> orderItems = new ArrayList<OrderOrderItem>();

    public Order orderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * The identifier of the order.
     *
     * @return orderId
     **/
    @ApiModelProperty(example = "A2K8290LP8", value = "The identifier of the order.")
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Order pickupPoint(Boolean pickupPoint) {
        this.pickupPoint = pickupPoint;
        return this;
    }

    /**
     * Indicates whether this order is shipped to a Pick Up Point.
     *
     * @return pickupPoint
     **/
    @ApiModelProperty(example = "true", value = "Indicates whether this order is shipped to a Pick Up Point.")
    public Boolean isPickupPoint() {
        return pickupPoint;
    }

    public void setPickupPoint(Boolean pickupPoint) {
        this.pickupPoint = pickupPoint;
    }

    public Order orderPlacedDateTime(OffsetDateTime orderPlacedDateTime) {
        this.orderPlacedDateTime = orderPlacedDateTime;
        return this;
    }

    /**
     * The date and time in ISO 8601 format when the order was placed.
     *
     * @return orderPlacedDateTime
     **/
    @ApiModelProperty(example = "2017-02-09T12:39:48+01:00", value = "The date and time in ISO 8601 format when the order was placed.")
    public OffsetDateTime getOrderPlacedDateTime() {
        return orderPlacedDateTime;
    }

    public void setOrderPlacedDateTime(OffsetDateTime orderPlacedDateTime) {
        this.orderPlacedDateTime = orderPlacedDateTime;
    }

    public Order shipmentDetails(ShipmentDetails shipmentDetails) {
        this.shipmentDetails = shipmentDetails;
        return this;
    }

    /**
     * Get shipmentDetails
     *
     * @return shipmentDetails
     **/
    @ApiModelProperty(required = true, value = "")
    public ShipmentDetails getShipmentDetails() {
        return shipmentDetails;
    }

    public void setShipmentDetails(ShipmentDetails shipmentDetails) {
        this.shipmentDetails = shipmentDetails;
    }

    public Order billingDetails(BillingDetails billingDetails) {
        this.billingDetails = billingDetails;
        return this;
    }

    /**
     * Get billingDetails
     *
     * @return billingDetails
     **/
    @ApiModelProperty(value = "")
    public BillingDetails getBillingDetails() {
        return billingDetails;
    }

    public void setBillingDetails(BillingDetails billingDetails) {
        this.billingDetails = billingDetails;
    }

    public Order orderItems(List<OrderOrderItem> orderItems) {
        this.orderItems = orderItems;
        return this;
    }

    public Order addOrderItemsItem(OrderOrderItem orderItemsItem) {
        this.orderItems.add(orderItemsItem);
        return this;
    }

    /**
     * Get orderItems
     *
     * @return orderItems
     **/
    @ApiModelProperty(required = true, value = "")
    public List<OrderOrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderOrderItem> orderItems) {
        this.orderItems = orderItems;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        return Objects.equals(this.orderId, order.orderId) &&
                Objects.equals(this.pickupPoint, order.pickupPoint) &&
                Objects.equals(this.orderPlacedDateTime, order.orderPlacedDateTime) &&
                Objects.equals(this.shipmentDetails, order.shipmentDetails) &&
                Objects.equals(this.billingDetails, order.billingDetails) &&
                Objects.equals(this.orderItems, order.orderItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, pickupPoint, orderPlacedDateTime, shipmentDetails, billingDetails, orderItems);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Order {\n");

        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    pickupPoint: ").append(toIndentedString(pickupPoint)).append("\n");
        sb.append("    orderPlacedDateTime: ").append(toIndentedString(orderPlacedDateTime)).append("\n");
        sb.append("    shipmentDetails: ").append(toIndentedString(shipmentDetails)).append("\n");
        sb.append("    billingDetails: ").append(toIndentedString(billingDetails)).append("\n");
        sb.append("    orderItems: ").append(toIndentedString(orderItems)).append("\n");
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

