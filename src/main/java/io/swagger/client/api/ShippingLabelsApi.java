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

import com.google.gson.reflect.TypeToken;
import io.swagger.client.*;
import io.swagger.client.model.DeliveryOptionsRequest;
import io.swagger.client.model.DeliveryOptionsResponse;
import io.swagger.client.model.ProcessStatus;
import io.swagger.client.model.ShippingLabelRequest;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShippingLabelsApi {
    private ApiClient apiClient;

    public ShippingLabelsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ShippingLabelsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getDeliveryOptions
     *
     * @param body                    (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDeliveryOptionsCall(DeliveryOptionsRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/retailer/shipping-labels/delivery-options";

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
                "application/vnd.retailer.v8+json"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDeliveryOptionsValidateBeforeCall(DeliveryOptionsRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {


        com.squareup.okhttp.Call call = getDeliveryOptionsCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get delivery options
     * Retrieves all available delivery options based on the supplied configuration of order items that has to be shipped.
     *
     * @param body (optional)
     * @return DeliveryOptionsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeliveryOptionsResponse getDeliveryOptions(DeliveryOptionsRequest body) throws ApiException {
        ApiResponse<DeliveryOptionsResponse> resp = getDeliveryOptionsWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Get delivery options
     * Retrieves all available delivery options based on the supplied configuration of order items that has to be shipped.
     *
     * @param body (optional)
     * @return ApiResponse&lt;DeliveryOptionsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeliveryOptionsResponse> getDeliveryOptionsWithHttpInfo(DeliveryOptionsRequest body) throws ApiException {
        com.squareup.okhttp.Call call = getDeliveryOptionsValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<DeliveryOptionsResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get delivery options (asynchronously)
     * Retrieves all available delivery options based on the supplied configuration of order items that has to be shipped.
     *
     * @param body     (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDeliveryOptionsAsync(DeliveryOptionsRequest body, final ApiCallback<DeliveryOptionsResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDeliveryOptionsValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeliveryOptionsResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getShippingLabel
     *
     * @param shippingLabelId         The shipping label id. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getShippingLabelCall(String shippingLabelId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/retailer/shipping-labels/{shipping-label-id}"
                .replaceAll("\\{" + "shipping-label-id" + "\\}", apiClient.escapeString(shippingLabelId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/vnd.retailer.v8+pdf"
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
    private com.squareup.okhttp.Call getShippingLabelValidateBeforeCall(String shippingLabelId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'shippingLabelId' is set
        if (shippingLabelId == null) {
            throw new ApiException("Missing the required parameter 'shippingLabelId' when calling getShippingLabel(Async)");
        }


        com.squareup.okhttp.Call call = getShippingLabelCall(shippingLabelId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a shipping label
     * Retrieves a shipping label by shipping label id. Metadata for the shipping label is added as headers in the response. If you are only interested in the metadata, you can do a HEAD request to retrieve only the headers without the label data.
     *
     * @param shippingLabelId The shipping label id. (required)
     * @return List&lt;byte[]&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<byte[]> getShippingLabel(String shippingLabelId) throws ApiException {
        ApiResponse<List<byte[]>> resp = getShippingLabelWithHttpInfo(shippingLabelId);
        return resp.getData();
    }

    /**
     * Get a shipping label
     * Retrieves a shipping label by shipping label id. Metadata for the shipping label is added as headers in the response. If you are only interested in the metadata, you can do a HEAD request to retrieve only the headers without the label data.
     *
     * @param shippingLabelId The shipping label id. (required)
     * @return ApiResponse&lt;List&lt;byte[]&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<byte[]>> getShippingLabelWithHttpInfo(String shippingLabelId) throws ApiException {
        com.squareup.okhttp.Call call = getShippingLabelValidateBeforeCall(shippingLabelId, null, null);
        Type localVarReturnType = new TypeToken<List<byte[]>>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a shipping label (asynchronously)
     * Retrieves a shipping label by shipping label id. Metadata for the shipping label is added as headers in the response. If you are only interested in the metadata, you can do a HEAD request to retrieve only the headers without the label data.
     *
     * @param shippingLabelId The shipping label id. (required)
     * @param callback        The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getShippingLabelAsync(String shippingLabelId, final ApiCallback<List<byte[]>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getShippingLabelValidateBeforeCall(shippingLabelId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<byte[]>>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for postShippingLabel
     *
     * @param body                    (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postShippingLabelCall(ShippingLabelRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/retailer/shipping-labels";

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
                "application/vnd.retailer.v8+json"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postShippingLabelValidateBeforeCall(ShippingLabelRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {


        com.squareup.okhttp.Call call = postShippingLabelCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create a shipping label
     * Create a shipping label with a shipping label offer id retrieved from get delivery options.
     *
     * @param body (optional)
     * @return ProcessStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProcessStatus postShippingLabel(ShippingLabelRequest body) throws ApiException {
        ApiResponse<ProcessStatus> resp = postShippingLabelWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create a shipping label
     * Create a shipping label with a shipping label offer id retrieved from get delivery options.
     *
     * @param body (optional)
     * @return ApiResponse&lt;ProcessStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProcessStatus> postShippingLabelWithHttpInfo(ShippingLabelRequest body) throws ApiException {
        com.squareup.okhttp.Call call = postShippingLabelValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<ProcessStatus>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a shipping label (asynchronously)
     * Create a shipping label with a shipping label offer id retrieved from get delivery options.
     *
     * @param body     (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postShippingLabelAsync(ShippingLabelRequest body, final ApiCallback<ProcessStatus> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postShippingLabelValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProcessStatus>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}