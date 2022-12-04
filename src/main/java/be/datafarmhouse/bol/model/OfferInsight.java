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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OfferInsight
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class OfferInsight {
    @SerializedName("name")
    private String name = null;

    @SerializedName("type")
    private String type = null;

    @SerializedName("total")
    private Double total = null;

    @SerializedName("countries")
    private List<OfferInsightsCountry> countries = new ArrayList<OfferInsightsCountry>();

    @SerializedName("periods")
    private List<Periods> periods = new ArrayList<Periods>();

    public OfferInsight name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the requested offer insight.
     *
     * @return name
     **/
    @ApiModelProperty(example = "BUY_BOX_PERCENTAGE", required = true, value = "The name of the requested offer insight.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OfferInsight type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Interpretation of the data that applies to this measurement.
     *
     * @return type
     **/
    @ApiModelProperty(example = "percentage", required = true, value = "Interpretation of the data that applies to this measurement.")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OfferInsight total(Double total) {
        this.total = total;
        return this;
    }

    /**
     * Total number of customer visits on the product page when the offer had the buy box over the requested period (excluding the current day).
     *
     * @return total
     **/
    @ApiModelProperty(example = "50.0", value = "Total number of customer visits on the product page when the offer had the buy box over the requested period (excluding the current day).")
    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public OfferInsight countries(List<OfferInsightsCountry> countries) {
        this.countries = countries;
        return this;
    }

    public OfferInsight addCountriesItem(OfferInsightsCountry countriesItem) {
        this.countries.add(countriesItem);
        return this;
    }

    /**
     * Get countries
     *
     * @return countries
     **/
    @ApiModelProperty(required = true, value = "")
    public List<OfferInsightsCountry> getCountries() {
        return countries;
    }

    public void setCountries(List<OfferInsightsCountry> countries) {
        this.countries = countries;
    }

    public OfferInsight periods(List<Periods> periods) {
        this.periods = periods;
        return this;
    }

    public OfferInsight addPeriodsItem(Periods periodsItem) {
        this.periods.add(periodsItem);
        return this;
    }

    /**
     * Get periods
     *
     * @return periods
     **/
    @ApiModelProperty(required = true, value = "")
    public List<Periods> getPeriods() {
        return periods;
    }

    public void setPeriods(List<Periods> periods) {
        this.periods = periods;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OfferInsight offerInsight = (OfferInsight) o;
        return Objects.equals(this.name, offerInsight.name) &&
                Objects.equals(this.type, offerInsight.type) &&
                Objects.equals(this.total, offerInsight.total) &&
                Objects.equals(this.countries, offerInsight.countries) &&
                Objects.equals(this.periods, offerInsight.periods);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, total, countries, periods);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferInsight {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
        sb.append("    periods: ").append(toIndentedString(periods)).append("\n");
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
