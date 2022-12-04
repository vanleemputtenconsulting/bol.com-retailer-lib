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

import java.util.Objects;

/**
 * SearchTermsCountry
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class SearchTermsCountry {
    @SerializedName("countryCode")
    private String countryCode = null;

    @SerializedName("value")
    private Integer value = null;

    public SearchTermsCountry countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Countries in which this offer is currently on sale in the webshop in ISO-3166-1 format.
     *
     * @return countryCode
     **/
    @ApiModelProperty(example = "NL", required = true, value = "Countries in which this offer is currently on sale in the webshop in ISO-3166-1 format.")
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public SearchTermsCountry value(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * The number of customer visits on the search page.
     *
     * @return value
     **/
    @ApiModelProperty(example = "100", required = true, value = "The number of customer visits on the search page.")
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchTermsCountry searchTermsCountry = (SearchTermsCountry) o;
        return Objects.equals(this.countryCode, searchTermsCountry.countryCode) &&
                Objects.equals(this.value, searchTermsCountry.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryCode, value);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchTermsCountry {\n");

        sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
