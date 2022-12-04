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

import java.util.List;

/**
 * API tests for ReplenishmentsApi
 */
@Ignore
public class ReplenishmentsApiTest {

    private final ReplenishmentsApi api = new ReplenishmentsApi();


    /**
     * Get delivery dates
     * <p>
     * Retrieve a list of available delivery dates for a replenishment.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void getDeliveryDatesTest() throws Exception {
        DeliveryDatesResponse response = api.getDeliveryDates();

        // TODO: test validations
    }

    /**
     * Get load carrier labels
     * <p>
     * Retrieve the load carrier labels.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void getLoadCarrierLabelsTest() throws Exception {
        String replenishmentId = null;
        String labelType = null;
        List<byte[]> response = api.getLoadCarrierLabels(replenishmentId, labelType);

        // TODO: test validations
    }

    /**
     * Get pick list
     * <p>
     * Retrieve the pick list.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void getPickListTest() throws Exception {
        String replenishmentId = null;
        List<byte[]> response = api.getPickList(replenishmentId);

        // TODO: test validations
    }

    /**
     * Get product destinations by product destinations id
     * <p>
     * Gets the product destinations for one or more products by product destinations id.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void getProductDestinationsTest() throws Exception {
        String productDestinationsId = null;
        ProductDestinationsResponse response = api.getProductDestinations(productDestinationsId);

        // TODO: test validations
    }

    /**
     * Get a replenishment by replenishment id
     * <p>
     * Gets a replenishment by replenishment id.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void getReplenishmentTest() throws Exception {
        String replenishmentId = null;
        ReplenishmentResponse response = api.getReplenishment(replenishmentId);

        // TODO: test validations
    }

    /**
     * Get replenishments
     * <p>
     * Gets a list of replenishments.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void getReplenishmentsTest() throws Exception {
        String reference = null;
        String ean = null;
        String startDate = null;
        String endDate = null;
        List<String> state = null;
        Integer page = null;
        ReplenishmentsResponse response = api.getReplenishments(reference, ean, startDate, endDate, state, page);

        // TODO: test validations
    }

    /**
     * Post pickup time slots
     * <p>
     * Retrieve pickup time slots.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void postPickupTimeSlotsTest() throws Exception {
        PickupTimeSlotsRequest body = null;
        PickupTimeSlotsResponse response = api.postPickupTimeSlots(body);

        // TODO: test validations
    }

    /**
     * Post product labels
     * <p>
     * Retrieve product labels.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void postProductLabelsTest() throws Exception {
        ProductLabelsRequest body = null;
        List<byte[]> response = api.postProductLabels(body);

        // TODO: test validations
    }

    /**
     * Create a replenishment
     * <p>
     * Creates a replenishment.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void postReplenishmentTest() throws Exception {
        CreateReplenishmentRequest body = null;
        ProcessStatus response = api.postReplenishment(body);

        // TODO: test validations
    }

    /**
     * Request product destinations
     * <p>
     * Requests a list of product destinations by EANs.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void postRequestProductDestinationsTest() throws Exception {
        RequestProductDestinationsRequest body = null;
        ProcessStatus response = api.postRequestProductDestinations(body);

        // TODO: test validations
    }

    /**
     * Update a replenishment by replenishment id
     * <p>
     * Updates a replenishment.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void putReplenishmentTest() throws Exception {
        String replenishmentId = null;
        UpdateReplenishmentRequest body = null;
        ProcessStatus response = api.putReplenishment(replenishmentId, body);

        // TODO: test validations
    }

}