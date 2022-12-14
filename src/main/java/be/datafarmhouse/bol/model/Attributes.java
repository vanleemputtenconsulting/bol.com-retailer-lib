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
 * Attributes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class Attributes {
    @SerializedName("id")
    private String id = null;

    @SerializedName("values")
    private List<Values> values = new ArrayList<Values>();

    public Attributes id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The identifier of the attribute.
     *
     * @return id
     **/
    @ApiModelProperty(example = "Appearance Name", required = true, value = "The identifier of the attribute.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Attributes values(List<Values> values) {
        this.values = values;
        return this;
    }

    public Attributes addValuesItem(Values valuesItem) {
        this.values.add(valuesItem);
        return this;
    }

    /**
     * Get values
     *
     * @return values
     **/
    @ApiModelProperty(required = true, value = "")
    public List<Values> getValues() {
        return values;
    }

    public void setValues(List<Values> values) {
        this.values = values;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Attributes attributes = (Attributes) o;
        return Objects.equals(this.id, attributes.id) &&
                Objects.equals(this.values, attributes.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, values);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Attributes {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

