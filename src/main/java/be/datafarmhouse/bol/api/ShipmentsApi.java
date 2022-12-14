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

import be.datafarmhouse.bol.*;
import be.datafarmhouse.bol.model.Shipment;
import be.datafarmhouse.bol.model.ShipmentsResponse;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShipmentsApi {
    private ApiClient apiClient;

    public ShipmentsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ShipmentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getShipment
     *
     * @param shipmentId              The id of the shipment. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getShipmentCall(String shipmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/retailer/shipments/{shipment-id}"
                .replaceAll("\\{" + "shipment-id" + "\\}", apiClient.escapeString(shipmentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/vnd.retailer.v8+json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            });
        }

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getShipmentValidateBeforeCall(String shipmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'shipmentId' is set
        if (shipmentId == null) {
            throw new ApiException("Missing the required parameter 'shipmentId' when calling getShipment(Async)");
        }


        com.squareup.okhttp.Call call = getShipmentCall(shipmentId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a shipment by shipment id
     * Retrieve a single shipment by its corresponding id.
     *
     * @param shipmentId The id of the shipment. (required)
     * @return Shipment
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Shipment getShipment(String shipmentId) throws ApiException {
        ApiResponse<Shipment> resp = getShipmentWithHttpInfo(shipmentId);
        return resp.getData();
    }

    /**
     * Get a shipment by shipment id
     * Retrieve a single shipment by its corresponding id.
     *
     * @param shipmentId The id of the shipment. (required)
     * @return ApiResponse&lt;Shipment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Shipment> getShipmentWithHttpInfo(String shipmentId) throws ApiException {
        com.squareup.okhttp.Call call = getShipmentValidateBeforeCall(shipmentId, null, null);
        Type localVarReturnType = new TypeToken<Shipment>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a shipment by shipment id (asynchronously)
     * Retrieve a single shipment by its corresponding id.
     *
     * @param shipmentId The id of the shipment. (required)
     * @param callback   The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getShipmentAsync(String shipmentId, final ApiCallback<Shipment> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getShipmentValidateBeforeCall(shipmentId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Shipment>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getShipments
     *
     * @param page                    The page to get with a page size of 50. (optional, default to 1)
     * @param fulfilmentMethod        The fulfilment method. Fulfilled by the retailer (FBR) or fulfilled by bol.com (FBB). (optional, default to FBR)
     * @param orderId                 The id of the order. Only valid without fulfilment-method. The default fulfilment-method is ignored. (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getShipmentsCall(Integer page, String fulfilmentMethod, String orderId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/retailer/shipments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (page != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (fulfilmentMethod != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fulfilment-method", fulfilmentMethod));
        if (orderId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("order-id", orderId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/vnd.retailer.v8+json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            });
        }

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getShipmentsValidateBeforeCall(Integer page, String fulfilmentMethod, String orderId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {


        com.squareup.okhttp.Call call = getShipmentsCall(page, fulfilmentMethod, orderId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get shipment list
     * A paginated list to retrieve all your shipments up to 3 months old. The shipments will be sorted by date in descending order.
     *
     * @param page             The page to get with a page size of 50. (optional, default to 1)
     * @param fulfilmentMethod The fulfilment method. Fulfilled by the retailer (FBR) or fulfilled by bol.com (FBB). (optional, default to FBR)
     * @param orderId          The id of the order. Only valid without fulfilment-method. The default fulfilment-method is ignored. (optional)
     * @return ShipmentsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ShipmentsResponse getShipments(Integer page, String fulfilmentMethod, String orderId) throws ApiException {
        ApiResponse<ShipmentsResponse> resp = getShipmentsWithHttpInfo(page, fulfilmentMethod, orderId);
        return resp.getData();
    }

    /**
     * Get shipment list
     * A paginated list to retrieve all your shipments up to 3 months old. The shipments will be sorted by date in descending order.
     *
     * @param page             The page to get with a page size of 50. (optional, default to 1)
     * @param fulfilmentMethod The fulfilment method. Fulfilled by the retailer (FBR) or fulfilled by bol.com (FBB). (optional, default to FBR)
     * @param orderId          The id of the order. Only valid without fulfilment-method. The default fulfilment-method is ignored. (optional)
     * @return ApiResponse&lt;ShipmentsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ShipmentsResponse> getShipmentsWithHttpInfo(Integer page, String fulfilmentMethod, String orderId) throws ApiException {
        com.squareup.okhttp.Call call = getShipmentsValidateBeforeCall(page, fulfilmentMethod, orderId, null, null);
        Type localVarReturnType = new TypeToken<ShipmentsResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get shipment list (asynchronously)
     * A paginated list to retrieve all your shipments up to 3 months old. The shipments will be sorted by date in descending order.
     *
     * @param page             The page to get with a page size of 50. (optional, default to 1)
     * @param fulfilmentMethod The fulfilment method. Fulfilled by the retailer (FBR) or fulfilled by bol.com (FBB). (optional, default to FBR)
     * @param orderId          The id of the order. Only valid without fulfilment-method. The default fulfilment-method is ignored. (optional)
     * @param callback         The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getShipmentsAsync(Integer page, String fulfilmentMethod, String orderId, final ApiCallback<ShipmentsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getShipmentsValidateBeforeCall(page, fulfilmentMethod, orderId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ShipmentsResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
