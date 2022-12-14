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
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.Objects;

/**
 * PromotionCountryCode
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class PromotionCountryCode {
    /**
     * The country code of the country in which the promotion is active.
     */
    @JsonAdapter(CountryCodeEnum.Adapter.class)
    public enum CountryCodeEnum {
        NL("NL"),

        BE("BE");

        private String value;

        CountryCodeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static CountryCodeEnum fromValue(String text) {
            for (CountryCodeEnum b : CountryCodeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<CountryCodeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final CountryCodeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public CountryCodeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return CountryCodeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("countryCode")
    private CountryCodeEnum countryCode = null;

    public PromotionCountryCode countryCode(CountryCodeEnum countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * The country code of the country in which the promotion is active.
     *
     * @return countryCode
     **/
    @ApiModelProperty(example = "NL", required = true, value = "The country code of the country in which the promotion is active.")
    public CountryCodeEnum getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(CountryCodeEnum countryCode) {
        this.countryCode = countryCode;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PromotionCountryCode promotionCountryCode = (PromotionCountryCode) o;
        return Objects.equals(this.countryCode, promotionCountryCode.countryCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryCode);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PromotionCountryCode {\n");

        sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

