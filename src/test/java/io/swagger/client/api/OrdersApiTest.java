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


package io.swagger.client.api;

import io.swagger.client.model.*;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for OrdersApi
 */
@Ignore
public class OrdersApiTest {

    private final OrdersApi api = new OrdersApi();


    /**
     * Cancel an order item by an order item id
     * <p>
     * This endpoint can be used to either confirm a cancellation request by the customer or to cancel an order item you yourself are unable to fulfil.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void cancelOrderItemTest() throws Exception {
        ContainerForTheOrderItemsThatHaveToBeCancelled_ body = null;
        ProcessStatus response = api.cancelOrderItem(body);

        // TODO: test validations
    }

    /**
     * Get an order by order id
     * <p>
     * Gets an order by order id. The order can be partially shipped or cancelled, and the message contains the quantity shipped or cancelled items. The unitPrice takes account of volume discounts.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void getOrderTest() throws Exception {
        String orderId = null;
        Order response = api.getOrder(orderId);

        // TODO: test validations
    }

    /**
     * Get a list of orders
     * <p>
     * Gets a paginated list of all orders for a retailer.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void getOrdersTest() throws Exception {
        Integer page = null;
        String fulfilmentMethod = null;
        String status = null;
        Integer changeIntervalMinute = null;
        String latestChangeDate = null;
        ReducedOrders response = api.getOrders(page, fulfilmentMethod, status, changeIntervalMinute, latestChangeDate);

        // TODO: test validations
    }

    /**
     * Ship order item
     * <p>
     * Ship a single order item within a customer order by providing shipping information. If you purchased a shipping label you should add the shippingLabelId to this message and leave the transport element empty. If you will ship the item using your own transporter method you must omit the shippingLabelId entirely and fill in the transport element with the fields from GET shipping labels.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void shipOrderItemTest() throws Exception {
        ShipmentRequest body = null;
        ProcessStatus response = api.shipOrderItem(body);

        // TODO: test validations
    }

}