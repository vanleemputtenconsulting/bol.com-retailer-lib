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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Upload report.
 */
@ApiModel(description = "Upload report.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class UploadReportResponse {
    @SerializedName("uploadId")
    private String uploadId = null;

    /**
     * The language in which content is submitted.
     */
    @JsonAdapter(LanguageEnum.Adapter.class)
    public enum LanguageEnum {
        NL("nl"),

        NL_BE("nl-BE"),

        FR("fr"),

        FR_BE("fr-BE");

        private String value;

        LanguageEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static LanguageEnum fromValue(String text) {
            for (LanguageEnum b : LanguageEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<LanguageEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final LanguageEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public LanguageEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return LanguageEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("language")
    private LanguageEnum language = null;

    /**
     * The current status of the upload report.
     */
    @JsonAdapter(StatusEnum.Adapter.class)
    public enum StatusEnum {
        IN_PROGRESS("IN_PROGRESS"),

        COMPLETED("COMPLETED");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<StatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StatusEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StatusEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("status")
    private StatusEnum status = null;

    @SerializedName("attributes")
    private List<UploadReportAttribute> attributes = new ArrayList<UploadReportAttribute>();

    @SerializedName("assets")
    private List<UploadReportAsset> assets = null;

    public UploadReportResponse uploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }

    /**
     * The identifier of the upload report.
     *
     * @return uploadId
     **/
    @ApiModelProperty(example = "3fa90f24-5b44-417f-b212-5cd18ce64c0e", required = true, value = "The identifier of the upload report.")
    public String getUploadId() {
        return uploadId;
    }

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    public UploadReportResponse language(LanguageEnum language) {
        this.language = language;
        return this;
    }

    /**
     * The language in which content is submitted.
     *
     * @return language
     **/
    @ApiModelProperty(example = "nl", required = true, value = "The language in which content is submitted.")
    public LanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    public UploadReportResponse status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * The current status of the upload report.
     *
     * @return status
     **/
    @ApiModelProperty(example = "IN_PROGRESS", required = true, value = "The current status of the upload report.")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public UploadReportResponse attributes(List<UploadReportAttribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    public UploadReportResponse addAttributesItem(UploadReportAttribute attributesItem) {
        this.attributes.add(attributesItem);
        return this;
    }

    /**
     * Get attributes
     *
     * @return attributes
     **/
    @ApiModelProperty(required = true, value = "")
    public List<UploadReportAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<UploadReportAttribute> attributes) {
        this.attributes = attributes;
    }

    public UploadReportResponse assets(List<UploadReportAsset> assets) {
        this.assets = assets;
        return this;
    }

    public UploadReportResponse addAssetsItem(UploadReportAsset assetsItem) {
        if (this.assets == null) {
            this.assets = new ArrayList<UploadReportAsset>();
        }
        this.assets.add(assetsItem);
        return this;
    }

    /**
     * Get assets
     *
     * @return assets
     **/
    @ApiModelProperty(value = "")
    public List<UploadReportAsset> getAssets() {
        return assets;
    }

    public void setAssets(List<UploadReportAsset> assets) {
        this.assets = assets;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UploadReportResponse uploadReportResponse = (UploadReportResponse) o;
        return Objects.equals(this.uploadId, uploadReportResponse.uploadId) &&
                Objects.equals(this.language, uploadReportResponse.language) &&
                Objects.equals(this.status, uploadReportResponse.status) &&
                Objects.equals(this.attributes, uploadReportResponse.attributes) &&
                Objects.equals(this.assets, uploadReportResponse.assets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uploadId, language, status, attributes, assets);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadReportResponse {\n");

        sb.append("    uploadId: ").append(toIndentedString(uploadId)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
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
