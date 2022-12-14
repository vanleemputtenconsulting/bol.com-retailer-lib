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
 * ContainerForTheOrderItemsThatHaveToBeCancelled_
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class ContainerForTheOrderItemsThatHaveToBeCancelled_ {
    @SerializedName("orderItems")
    private List<OrderItemCancellation> orderItems = new ArrayList<OrderItemCancellation>();

    public ContainerForTheOrderItemsThatHaveToBeCancelled_ orderItems(List<OrderItemCancellation> orderItems) {
        this.orderItems = orderItems;
        return this;
    }

    public ContainerForTheOrderItemsThatHaveToBeCancelled_ addOrderItemsItem(OrderItemCancellation orderItemsItem) {
        this.orderItems.add(orderItemsItem);
        return this;
    }

    /**
     * List of order items to cancel. Order item id&#39;s must belong to the same order.
     *
     * @return orderItems
     **/
    @ApiModelProperty(required = true, value = "List of order items to cancel. Order item id's must belong to the same order.")
    public List<OrderItemCancellation> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItemCancellation> orderItems) {
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
        ContainerForTheOrderItemsThatHaveToBeCancelled_ containerForTheOrderItemsThatHaveToBeCancelled_ = (ContainerForTheOrderItemsThatHaveToBeCancelled_) o;
        return Objects.equals(this.orderItems, containerForTheOrderItemsThatHaveToBeCancelled_.orderItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderItems);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerForTheOrderItemsThatHaveToBeCancelled_ {\n");

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

