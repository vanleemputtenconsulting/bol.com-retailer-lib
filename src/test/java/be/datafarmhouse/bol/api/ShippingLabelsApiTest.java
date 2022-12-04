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


package be.datafarmhouse.bol.api;

import be.datafarmhouse.bol.model.DeliveryOptionsRequest;
import be.datafarmhouse.bol.model.DeliveryOptionsResponse;
import be.datafarmhouse.bol.model.ProcessStatus;
import be.datafarmhouse.bol.model.ShippingLabelRequest;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

/**
 * API tests for ShippingLabelsApi
 */
@Ignore
public class ShippingLabelsApiTest {

    private final ShippingLabelsApi api = new ShippingLabelsApi();


    /**
     * Get delivery options
     * <p>
     * Retrieves all available delivery options based on the supplied configuration of order items that has to be shipped.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void getDeliveryOptionsTest() throws Exception {
        DeliveryOptionsRequest body = null;
        DeliveryOptionsResponse response = api.getDeliveryOptions(body);

        // TODO: test validations
    }

    /**
     * Get a shipping label
     * <p>
     * Retrieves a shipping label by shipping label id. Metadata for the shipping label is added as headers in the response. If you are only interested in the metadata, you can do a HEAD request to retrieve only the headers without the label data.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void getShippingLabelTest() throws Exception {
        String shippingLabelId = null;
        List<byte[]> response = api.getShippingLabel(shippingLabelId);

        // TODO: test validations
    }

    /**
     * Create a shipping label
     * <p>
     * Create a shipping label with a shipping label offer id retrieved from get delivery options.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void postShippingLabelTest() throws Exception {
        ShippingLabelRequest body = null;
        ProcessStatus response = api.postShippingLabel(body);

        // TODO: test validations
    }

}