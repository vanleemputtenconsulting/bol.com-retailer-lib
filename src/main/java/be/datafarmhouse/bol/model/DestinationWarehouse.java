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
 * DestinationWarehouse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class DestinationWarehouse {
    @SerializedName("streetName")
    private String streetName = null;

    @SerializedName("houseNumber")
    private String houseNumber = null;

    @SerializedName("houseNumberExtension")
    private String houseNumberExtension = null;

    @SerializedName("zipCode")
    private String zipCode = null;

    @SerializedName("city")
    private String city = null;

    @SerializedName("countryCode")
    private String countryCode = null;

    @SerializedName("attentionOf")
    private String attentionOf = null;

    public DestinationWarehouse streetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    /**
     * The street name of the pickup address.
     *
     * @return streetName
     **/
    @ApiModelProperty(example = "Industrieweg", required = true, value = "The street name of the pickup address.")
    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public DestinationWarehouse houseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    /**
     * The house number of the pickup address.
     *
     * @return houseNumber
     **/
    @ApiModelProperty(example = "1", required = true, value = "The house number of the pickup address.")
    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public DestinationWarehouse houseNumberExtension(String houseNumberExtension) {
        this.houseNumberExtension = houseNumberExtension;
        return this;
    }

    /**
     * The extension of the house number.
     *
     * @return houseNumberExtension
     **/
    @ApiModelProperty(example = "B", required = true, value = "The extension of the house number.")
    public String getHouseNumberExtension() {
        return houseNumberExtension;
    }

    public void setHouseNumberExtension(String houseNumberExtension) {
        this.houseNumberExtension = houseNumberExtension;
    }

    public DestinationWarehouse zipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    /**
     * The zip code in &#39;1234AB&#39; format for NL and &#39;0000&#39; for BE addresses.
     *
     * @return zipCode
     **/
    @ApiModelProperty(example = "1111ZZ", required = true, value = "The zip code in '1234AB' format for NL and '0000' for BE addresses.")
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public DestinationWarehouse city(String city) {
        this.city = city;
        return this;
    }

    /**
     * The city of the pickup address.
     *
     * @return city
     **/
    @ApiModelProperty(example = "Waalwijk", required = true, value = "The city of the pickup address.")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public DestinationWarehouse countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * The ISO 3166-2 country code.
     *
     * @return countryCode
     **/
    @ApiModelProperty(example = "NL", required = true, value = "The ISO 3166-2 country code.")
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public DestinationWarehouse attentionOf(String attentionOf) {
        this.attentionOf = attentionOf;
        return this;
    }

    /**
     * Name of the person responsible for this replenishment.
     *
     * @return attentionOf
     **/
    @ApiModelProperty(example = "t.a.v. bol.com", value = "Name of the person responsible for this replenishment.")
    public String getAttentionOf() {
        return attentionOf;
    }

    public void setAttentionOf(String attentionOf) {
        this.attentionOf = attentionOf;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DestinationWarehouse destinationWarehouse = (DestinationWarehouse) o;
        return Objects.equals(this.streetName, destinationWarehouse.streetName) &&
                Objects.equals(this.houseNumber, destinationWarehouse.houseNumber) &&
                Objects.equals(this.houseNumberExtension, destinationWarehouse.houseNumberExtension) &&
                Objects.equals(this.zipCode, destinationWarehouse.zipCode) &&
                Objects.equals(this.city, destinationWarehouse.city) &&
                Objects.equals(this.countryCode, destinationWarehouse.countryCode) &&
                Objects.equals(this.attentionOf, destinationWarehouse.attentionOf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streetName, houseNumber, houseNumberExtension, zipCode, city, countryCode, attentionOf);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DestinationWarehouse {\n");

        sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
        sb.append("    houseNumber: ").append(toIndentedString(houseNumber)).append("\n");
        sb.append("    houseNumberExtension: ").append(toIndentedString(houseNumberExtension)).append("\n");
        sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
        sb.append("    attentionOf: ").append(toIndentedString(attentionOf)).append("\n");
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
