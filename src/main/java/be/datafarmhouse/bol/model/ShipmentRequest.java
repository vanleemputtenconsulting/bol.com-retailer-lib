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
 * ShipmentRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class ShipmentRequest {
    @SerializedName("orderItems")
    private List<OrderItem> orderItems = new ArrayList<OrderItem>();

    @SerializedName("shipmentReference")
    private String shipmentReference = null;

    @SerializedName("shippingLabelId")
    private String shippingLabelId = null;

    @SerializedName("transport")
    private TransportInstruction transport = null;

    public ShipmentRequest orderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
        return this;
    }

    public ShipmentRequest addOrderItemsItem(OrderItem orderItemsItem) {
        this.orderItems.add(orderItemsItem);
        return this;
    }

    /**
     * Single element list with the order item to ship.
     *
     * @return orderItems
     **/
    @ApiModelProperty(required = true, value = "Single element list with the order item to ship.")
    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public ShipmentRequest shipmentReference(String shipmentReference) {
        this.shipmentReference = shipmentReference;
        return this;
    }

    /**
     * A user-defined reference that you can provide to add to the shipment. Can be used for own administration purposes. Only &#39;null&#39; or non-empty strings accepted.
     *
     * @return shipmentReference
     **/
    @ApiModelProperty(example = "B321SR", value = "A user-defined reference that you can provide to add to the shipment. Can be used for own administration purposes. Only 'null' or non-empty strings accepted.")
    public String getShipmentReference() {
        return shipmentReference;
    }

    public void setShipmentReference(String shipmentReference) {
        this.shipmentReference = shipmentReference;
    }

    public ShipmentRequest shippingLabelId(String shippingLabelId) {
        this.shippingLabelId = shippingLabelId;
        return this;
    }

    /**
     * The identifier of the purchased shipping label.
     *
     * @return shippingLabelId
     **/
    @ApiModelProperty(example = "d4c50077-0c19-435f-9bee-1b30b9f4ba1a", value = "The identifier of the purchased shipping label.")
    public String getShippingLabelId() {
        return shippingLabelId;
    }

    public void setShippingLabelId(String shippingLabelId) {
        this.shippingLabelId = shippingLabelId;
    }

    public ShipmentRequest transport(TransportInstruction transport) {
        this.transport = transport;
        return this;
    }

    /**
     * Get transport
     *
     * @return transport
     **/
    @ApiModelProperty(value = "")
    public TransportInstruction getTransport() {
        return transport;
    }

    public void setTransport(TransportInstruction transport) {
        this.transport = transport;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShipmentRequest shipmentRequest = (ShipmentRequest) o;
        return Objects.equals(this.orderItems, shipmentRequest.orderItems) &&
                Objects.equals(this.shipmentReference, shipmentRequest.shipmentReference) &&
                Objects.equals(this.shippingLabelId, shipmentRequest.shippingLabelId) &&
                Objects.equals(this.transport, shipmentRequest.transport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderItems, shipmentReference, shippingLabelId, transport);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShipmentRequest {\n");

        sb.append("    orderItems: ").append(toIndentedString(orderItems)).append("\n");
        sb.append("    shipmentReference: ").append(toIndentedString(shipmentReference)).append("\n");
        sb.append("    shippingLabelId: ").append(toIndentedString(shippingLabelId)).append("\n");
        sb.append("    transport: ").append(toIndentedString(transport)).append("\n");
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

