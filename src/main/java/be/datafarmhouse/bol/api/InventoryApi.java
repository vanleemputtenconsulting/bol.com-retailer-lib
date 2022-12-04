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
import be.datafarmhouse.bol.model.InventoryResponse;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryApi {
    private ApiClient apiClient;

    public InventoryApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InventoryApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getInventory
     *
     * @param page                    The requested page number with a page size of 50 items. (optional, default to 1)
     * @param quantity                Filter inventory by providing a range of quantity (min-range)-(max-range). Note that if no state query is submitted in the same request, then the quantity will be filtered on regularStock by default. (optional)
     * @param stock                   Filter inventory by stock level. (optional)
     * @param state                   Filter inventory by stock type. (optional)
     * @param query                   Filter inventory by EAN or product title. (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getInventoryCall(Integer page, List<String> quantity, String stock, String state, String query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/retailer/inventory";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (page != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (quantity != null)
            localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "quantity", quantity));
        if (stock != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("stock", stock));
        if (state != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("state", state));
        if (query != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("query", query));

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
    private com.squareup.okhttp.Call getInventoryValidateBeforeCall(Integer page, List<String> quantity, String stock, String state, String query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {


        com.squareup.okhttp.Call call = getInventoryCall(page, quantity, stock, state, query, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get LVB/FBB inventory
     * The inventory endpoint is a specific LVB/FBB endpoint. It provides a paginated list containing your fulfilment by bol.com inventory. This endpoint does not provide information about your own stock.
     *
     * @param page     The requested page number with a page size of 50 items. (optional, default to 1)
     * @param quantity Filter inventory by providing a range of quantity (min-range)-(max-range). Note that if no state query is submitted in the same request, then the quantity will be filtered on regularStock by default. (optional)
     * @param stock    Filter inventory by stock level. (optional)
     * @param state    Filter inventory by stock type. (optional)
     * @param query    Filter inventory by EAN or product title. (optional)
     * @return InventoryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InventoryResponse getInventory(Integer page, List<String> quantity, String stock, String state, String query) throws ApiException {
        ApiResponse<InventoryResponse> resp = getInventoryWithHttpInfo(page, quantity, stock, state, query);
        return resp.getData();
    }

    /**
     * Get LVB/FBB inventory
     * The inventory endpoint is a specific LVB/FBB endpoint. It provides a paginated list containing your fulfilment by bol.com inventory. This endpoint does not provide information about your own stock.
     *
     * @param page     The requested page number with a page size of 50 items. (optional, default to 1)
     * @param quantity Filter inventory by providing a range of quantity (min-range)-(max-range). Note that if no state query is submitted in the same request, then the quantity will be filtered on regularStock by default. (optional)
     * @param stock    Filter inventory by stock level. (optional)
     * @param state    Filter inventory by stock type. (optional)
     * @param query    Filter inventory by EAN or product title. (optional)
     * @return ApiResponse&lt;InventoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InventoryResponse> getInventoryWithHttpInfo(Integer page, List<String> quantity, String stock, String state, String query) throws ApiException {
        com.squareup.okhttp.Call call = getInventoryValidateBeforeCall(page, quantity, stock, state, query, null, null);
        Type localVarReturnType = new TypeToken<InventoryResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get LVB/FBB inventory (asynchronously)
     * The inventory endpoint is a specific LVB/FBB endpoint. It provides a paginated list containing your fulfilment by bol.com inventory. This endpoint does not provide information about your own stock.
     *
     * @param page     The requested page number with a page size of 50 items. (optional, default to 1)
     * @param quantity Filter inventory by providing a range of quantity (min-range)-(max-range). Note that if no state query is submitted in the same request, then the quantity will be filtered on regularStock by default. (optional)
     * @param stock    Filter inventory by stock level. (optional)
     * @param state    Filter inventory by stock type. (optional)
     * @param query    Filter inventory by EAN or product title. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getInventoryAsync(Integer page, List<String> quantity, String stock, String state, String query, final ApiCallback<InventoryResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getInventoryValidateBeforeCall(page, quantity, stock, state, query, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InventoryResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}