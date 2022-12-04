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


package io.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ChunkRecommendationsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class ChunkRecommendationsResponse {
    @SerializedName("recommendations")
    private List<ChunkRecommendationsPredictions> recommendations = new ArrayList<ChunkRecommendationsPredictions>();

    public ChunkRecommendationsResponse recommendations(List<ChunkRecommendationsPredictions> recommendations) {
        this.recommendations = recommendations;
        return this;
    }

    public ChunkRecommendationsResponse addRecommendationsItem(ChunkRecommendationsPredictions recommendationsItem) {
        this.recommendations.add(recommendationsItem);
        return this;
    }

    /**
     * Get recommendations
     *
     * @return recommendations
     **/
    @ApiModelProperty(required = true, value = "")
    public List<ChunkRecommendationsPredictions> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(List<ChunkRecommendationsPredictions> recommendations) {
        this.recommendations = recommendations;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChunkRecommendationsResponse chunkRecommendationsResponse = (ChunkRecommendationsResponse) o;
        return Objects.equals(this.recommendations, chunkRecommendationsResponse.recommendations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recommendations);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChunkRecommendationsResponse {\n");

        sb.append("    recommendations: ").append(toIndentedString(recommendations)).append("\n");
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

