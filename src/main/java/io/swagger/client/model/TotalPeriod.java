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
 * TotalPeriod
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class TotalPeriod {
    @SerializedName("period")
    private SearchTermsPeriod period = null;

    @SerializedName("total")
    private Integer total = null;

    @SerializedName("countries")
    private List<SearchTermsCountry> countries = new ArrayList<SearchTermsCountry>();

    public TotalPeriod period(SearchTermsPeriod period) {
        this.period = period;
        return this;
    }

    /**
     * Get period
     *
     * @return period
     **/
    @ApiModelProperty(required = true, value = "")
    public SearchTermsPeriod getPeriod() {
        return period;
    }

    public void setPeriod(SearchTermsPeriod period) {
        this.period = period;
    }

    public TotalPeriod total(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * The number of customer visits on the search page.
     *
     * @return total
     **/
    @ApiModelProperty(example = "100", required = true, value = "The number of customer visits on the search page.")
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public TotalPeriod countries(List<SearchTermsCountry> countries) {
        this.countries = countries;
        return this;
    }

    public TotalPeriod addCountriesItem(SearchTermsCountry countriesItem) {
        this.countries.add(countriesItem);
        return this;
    }

    /**
     * Get countries
     *
     * @return countries
     **/
    @ApiModelProperty(required = true, value = "")
    public List<SearchTermsCountry> getCountries() {
        return countries;
    }

    public void setCountries(List<SearchTermsCountry> countries) {
        this.countries = countries;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TotalPeriod totalPeriod = (TotalPeriod) o;
        return Objects.equals(this.period, totalPeriod.period) &&
                Objects.equals(this.total, totalPeriod.total) &&
                Objects.equals(this.countries, totalPeriod.countries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(period, total, countries);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TotalPeriod {\n");

        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
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
