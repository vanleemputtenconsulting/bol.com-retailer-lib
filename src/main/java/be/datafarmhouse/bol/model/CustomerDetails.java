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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.Objects;

/**
 * Information related to the customer.
 */
@ApiModel(description = "Information related to the customer.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class CustomerDetails {
    /**
     * The salutation of the customer.
     */
    @JsonAdapter(SalutationEnum.Adapter.class)
    public enum SalutationEnum {
        MALE("MALE"),

        FEMALE("FEMALE"),

        UNKNOWN("UNKNOWN");

        private String value;

        SalutationEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static SalutationEnum fromValue(String text) {
            for (SalutationEnum b : SalutationEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<SalutationEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final SalutationEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public SalutationEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return SalutationEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("salutation")
    private SalutationEnum salutation = null;

    @SerializedName("firstName")
    private String firstName = null;

    @SerializedName("surname")
    private String surname = null;

    @SerializedName("streetName")
    private String streetName = null;

    @SerializedName("houseNumber")
    private String houseNumber = null;

    @SerializedName("houseNumberExtension")
    private String houseNumberExtension = null;

    @SerializedName("extraAddressInformation")
    private String extraAddressInformation = null;

    @SerializedName("zipCode")
    private String zipCode = null;

    @SerializedName("city")
    private String city = null;

    @SerializedName("countryCode")
    private String countryCode = null;

    @SerializedName("email")
    private String email = null;

    @SerializedName("deliveryPhoneNumber")
    private String deliveryPhoneNumber = null;

    @SerializedName("company")
    private String company = null;

    @SerializedName("vatNumber")
    private String vatNumber = null;

    public CustomerDetails salutation(SalutationEnum salutation) {
        this.salutation = salutation;
        return this;
    }

    /**
     * The salutation of the customer.
     *
     * @return salutation
     **/
    @ApiModelProperty(example = "MALE", required = true, value = "The salutation of the customer.")
    public SalutationEnum getSalutation() {
        return salutation;
    }

    public void setSalutation(SalutationEnum salutation) {
        this.salutation = salutation;
    }

    public CustomerDetails firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * The first name of the customer.
     *
     * @return firstName
     **/
    @ApiModelProperty(example = "Billie", value = "The first name of the customer.")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public CustomerDetails surname(String surname) {
        this.surname = surname;
        return this;
    }

    /**
     * The surname of the customer.
     *
     * @return surname
     **/
    @ApiModelProperty(example = "Jansen", value = "The surname of the customer.")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public CustomerDetails streetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    /**
     * The street name.
     *
     * @return streetName
     **/
    @ApiModelProperty(example = "Dorpstraat", value = "The street name.")
    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public CustomerDetails houseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    /**
     * The house number.
     *
     * @return houseNumber
     **/
    @ApiModelProperty(example = "1", value = "The house number.")
    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public CustomerDetails houseNumberExtension(String houseNumberExtension) {
        this.houseNumberExtension = houseNumberExtension;
        return this;
    }

    /**
     * The extension on the house number.
     *
     * @return houseNumberExtension
     **/
    @ApiModelProperty(example = "B", value = "The extension on the house number.")
    public String getHouseNumberExtension() {
        return houseNumberExtension;
    }

    public void setHouseNumberExtension(String houseNumberExtension) {
        this.houseNumberExtension = houseNumberExtension;
    }

    public CustomerDetails extraAddressInformation(String extraAddressInformation) {
        this.extraAddressInformation = extraAddressInformation;
        return this;
    }

    /**
     * Additional information related to the address that helps in delivering the package.
     *
     * @return extraAddressInformation
     **/
    @ApiModelProperty(example = "Apartment", value = "Additional information related to the address that helps in delivering the package.")
    public String getExtraAddressInformation() {
        return extraAddressInformation;
    }

    public void setExtraAddressInformation(String extraAddressInformation) {
        this.extraAddressInformation = extraAddressInformation;
    }

    public CustomerDetails zipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    /**
     * The ZIP code in &#39;1234AB&#39; format for NL orders and &#39;0000&#39; format for BE orders.
     *
     * @return zipCode
     **/
    @ApiModelProperty(example = "1111ZZ", value = "The ZIP code in '1234AB' format for NL orders and '0000' format for BE orders.")
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public CustomerDetails city(String city) {
        this.city = city;
        return this;
    }

    /**
     * The name of the city.
     *
     * @return city
     **/
    @ApiModelProperty(example = "Utrecht", value = "The name of the city.")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public CustomerDetails countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * The country code.
     *
     * @return countryCode
     **/
    @ApiModelProperty(example = "NL", value = "The country code.")
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public CustomerDetails email(String email) {
        this.email = email;
        return this;
    }

    /**
     * A scrambled email address that can be used to contact the customer.
     *
     * @return email
     **/
    @ApiModelProperty(example = "billie@verkopen.bol.com", value = "A scrambled email address that can be used to contact the customer.")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CustomerDetails deliveryPhoneNumber(String deliveryPhoneNumber) {
        this.deliveryPhoneNumber = deliveryPhoneNumber;
        return this;
    }

    /**
     * The delivery phone number of the customer. Filled in case the order requires an appointment for delivering the goods.
     *
     * @return deliveryPhoneNumber
     **/
    @ApiModelProperty(example = "012123456", value = "The delivery phone number of the customer. Filled in case the order requires an appointment for delivering the goods.")
    public String getDeliveryPhoneNumber() {
        return deliveryPhoneNumber;
    }

    public void setDeliveryPhoneNumber(String deliveryPhoneNumber) {
        this.deliveryPhoneNumber = deliveryPhoneNumber;
    }

    public CustomerDetails company(String company) {
        this.company = company;
        return this;
    }

    /**
     * The company name.
     *
     * @return company
     **/
    @ApiModelProperty(example = "bol.com", value = "The company name.")
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public CustomerDetails vatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
        return this;
    }

    /**
     * The Value Added Tax (VAT) / BTW number for business sellers situated in the Netherlands.
     *
     * @return vatNumber
     **/
    @ApiModelProperty(example = "NL999999999B99", value = "The Value Added Tax (VAT) / BTW number for business sellers situated in the Netherlands.")
    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomerDetails customerDetails = (CustomerDetails) o;
        return Objects.equals(this.salutation, customerDetails.salutation) &&
                Objects.equals(this.firstName, customerDetails.firstName) &&
                Objects.equals(this.surname, customerDetails.surname) &&
                Objects.equals(this.streetName, customerDetails.streetName) &&
                Objects.equals(this.houseNumber, customerDetails.houseNumber) &&
                Objects.equals(this.houseNumberExtension, customerDetails.houseNumberExtension) &&
                Objects.equals(this.extraAddressInformation, customerDetails.extraAddressInformation) &&
                Objects.equals(this.zipCode, customerDetails.zipCode) &&
                Objects.equals(this.city, customerDetails.city) &&
                Objects.equals(this.countryCode, customerDetails.countryCode) &&
                Objects.equals(this.email, customerDetails.email) &&
                Objects.equals(this.deliveryPhoneNumber, customerDetails.deliveryPhoneNumber) &&
                Objects.equals(this.company, customerDetails.company) &&
                Objects.equals(this.vatNumber, customerDetails.vatNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salutation, firstName, surname, streetName, houseNumber, houseNumberExtension, extraAddressInformation, zipCode, city, countryCode, email, deliveryPhoneNumber, company, vatNumber);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerDetails {\n");

        sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
        sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
        sb.append("    houseNumber: ").append(toIndentedString(houseNumber)).append("\n");
        sb.append("    houseNumberExtension: ").append(toIndentedString(houseNumberExtension)).append("\n");
        sb.append("    extraAddressInformation: ").append(toIndentedString(extraAddressInformation)).append("\n");
        sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    deliveryPhoneNumber: ").append(toIndentedString(deliveryPhoneNumber)).append("\n");
        sb.append("    company: ").append(toIndentedString(company)).append("\n");
        sb.append("    vatNumber: ").append(toIndentedString(vatNumber)).append("\n");
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

