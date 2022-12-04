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

import java.util.Objects;

/**
 * ProductDestinationAddress
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class ProductDestinationAddress {
    @SerializedName("streetName")
    private String streetName = null;

    @SerializedName("houseNumber")
    private Integer houseNumber = null;

    @SerializedName("zipCode")
    private String zipCode = null;

    @SerializedName("city")
    private String city = null;

    @SerializedName("countryCode")
    private String countryCode = null;

    @SerializedName("attentionOf")
    private String attentionOf = null;

    @SerializedName("houseNumberExtension")
    private String houseNumberExtension = null;

    public ProductDestinationAddress streetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    /**
     * The street name of the bol.com warehouse address.
     *
     * @return streetName
     **/
    @ApiModelProperty(example = "Industrieweg", required = true, value = "The street name of the bol.com warehouse address.")
    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public ProductDestinationAddress houseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    /**
     * The house number of the bol.com warehouse address.
     *
     * @return houseNumber
     **/
    @ApiModelProperty(example = "1", required = true, value = "The house number of the bol.com warehouse address.")
    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public ProductDestinationAddress zipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    /**
     * The zipcode of the bol.com warehouse address.
     *
     * @return zipCode
     **/
    @ApiModelProperty(example = "1111ZZ", required = true, value = "The zipcode of the bol.com warehouse address.")
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public ProductDestinationAddress city(String city) {
        this.city = city;
        return this;
    }

    /**
     * The city of the bol.com warehouse address.
     *
     * @return city
     **/
    @ApiModelProperty(example = "Waalwijk", required = true, value = "The city of the bol.com warehouse address.")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ProductDestinationAddress countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * The ISO 3166-2 country code of the bol.com warehouse address.
     *
     * @return countryCode
     **/
    @ApiModelProperty(example = "NL", required = true, value = "The ISO 3166-2 country code of the bol.com warehouse address.")
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public ProductDestinationAddress attentionOf(String attentionOf) {
        this.attentionOf = attentionOf;
        return this;
    }

    /**
     * Name of the person responsible for this replenishment.
     *
     * @return attentionOf
     **/
    @ApiModelProperty(example = "t.a.v. bol.com", required = true, value = "Name of the person responsible for this replenishment.")
    public String getAttentionOf() {
        return attentionOf;
    }

    public void setAttentionOf(String attentionOf) {
        this.attentionOf = attentionOf;
    }

    public ProductDestinationAddress houseNumberExtension(String houseNumberExtension) {
        this.houseNumberExtension = houseNumberExtension;
        return this;
    }

    /**
     * The house number extension of the bol.com warehouse address.
     *
     * @return houseNumberExtension
     **/
    @ApiModelProperty(example = "B", value = "The house number extension of the bol.com warehouse address.")
    public String getHouseNumberExtension() {
        return houseNumberExtension;
    }

    public void setHouseNumberExtension(String houseNumberExtension) {
        this.houseNumberExtension = houseNumberExtension;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductDestinationAddress productDestinationAddress = (ProductDestinationAddress) o;
        return Objects.equals(this.streetName, productDestinationAddress.streetName) &&
                Objects.equals(this.houseNumber, productDestinationAddress.houseNumber) &&
                Objects.equals(this.zipCode, productDestinationAddress.zipCode) &&
                Objects.equals(this.city, productDestinationAddress.city) &&
                Objects.equals(this.countryCode, productDestinationAddress.countryCode) &&
                Objects.equals(this.attentionOf, productDestinationAddress.attentionOf) &&
                Objects.equals(this.houseNumberExtension, productDestinationAddress.houseNumberExtension);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streetName, houseNumber, zipCode, city, countryCode, attentionOf, houseNumberExtension);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductDestinationAddress {\n");

        sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
        sb.append("    houseNumber: ").append(toIndentedString(houseNumber)).append("\n");
        sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
        sb.append("    attentionOf: ").append(toIndentedString(attentionOf)).append("\n");
        sb.append("    houseNumberExtension: ").append(toIndentedString(houseNumberExtension)).append("\n");
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

