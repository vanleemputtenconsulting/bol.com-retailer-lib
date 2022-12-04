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

import io.swagger.client.model.BulkCommissionRequest;
import io.swagger.client.model.BulkCommissionResponse;
import io.swagger.client.model.Commission;
import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * API tests for CommissionsApi
 */
@Ignore
public class CommissionsApiTest {

    private final CommissionsApi api = new CommissionsApi();


    /**
     * Get all commissions and reductions by EAN per single EAN
     * <p>
     * Commissions can be filtered by condition, which defaults to NEW. We will calculate the commission amount from the EAN and price.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void getCommissionTest() throws Exception {
        String ean = null;
        BigDecimal unitPrice = null;
        String condition = null;
        Commission response = api.getCommission(ean, unitPrice, condition);

        // TODO: test validations
    }

    /**
     * Get all commissions and reductions by EAN in bulk
     * <p>
     * Gets all commissions and possible reductions by EAN, price, and optionally condition.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void getCommissionsTest() throws Exception {
        BulkCommissionRequest body = null;
        BulkCommissionResponse response = api.getCommissions(body);

        // TODO: test validations
    }

}
