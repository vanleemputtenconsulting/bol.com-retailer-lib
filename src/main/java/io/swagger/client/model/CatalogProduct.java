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
 * CatalogProduct
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-04T20:35:33.904+01:00")
public class CatalogProduct {
    @SerializedName("published")
    private Boolean published = null;

    @SerializedName("gpc")
    private Gpc gpc = null;

    @SerializedName("enrichment")
    private Enrichment enrichment = null;

    @SerializedName("attributes")
    private List<Attributes> attributes = new ArrayList<Attributes>();

    @SerializedName("parties")
    private List<Party> parties = new ArrayList<Party>();

    @SerializedName("audioTracks")
    private List<AudioTracks> audioTracks = null;

    @SerializedName("series")
    private List<Serie> series = null;

    public CatalogProduct published(Boolean published) {
        this.published = published;
        return this;
    }

    /**
     * Indicates whether the product meets the minimum requirements for publishing to the webshop.
     *
     * @return published
     **/
    @ApiModelProperty(example = "true", required = true, value = "Indicates whether the product meets the minimum requirements for publishing to the webshop.")
    public Boolean isPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public CatalogProduct gpc(Gpc gpc) {
        this.gpc = gpc;
        return this;
    }

    /**
     * Get gpc
     *
     * @return gpc
     **/
    @ApiModelProperty(required = true, value = "")
    public Gpc getGpc() {
        return gpc;
    }

    public void setGpc(Gpc gpc) {
        this.gpc = gpc;
    }

    public CatalogProduct enrichment(Enrichment enrichment) {
        this.enrichment = enrichment;
        return this;
    }

    /**
     * Get enrichment
     *
     * @return enrichment
     **/
    @ApiModelProperty(value = "")
    public Enrichment getEnrichment() {
        return enrichment;
    }

    public void setEnrichment(Enrichment enrichment) {
        this.enrichment = enrichment;
    }

    public CatalogProduct attributes(List<Attributes> attributes) {
        this.attributes = attributes;
        return this;
    }

    public CatalogProduct addAttributesItem(Attributes attributesItem) {
        this.attributes.add(attributesItem);
        return this;
    }

    /**
     * Get attributes
     *
     * @return attributes
     **/
    @ApiModelProperty(required = true, value = "")
    public List<Attributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attributes> attributes) {
        this.attributes = attributes;
    }

    public CatalogProduct parties(List<Party> parties) {
        this.parties = parties;
        return this;
    }

    public CatalogProduct addPartiesItem(Party partiesItem) {
        this.parties.add(partiesItem);
        return this;
    }

    /**
     * Get parties
     *
     * @return parties
     **/
    @ApiModelProperty(required = true, value = "")
    public List<Party> getParties() {
        return parties;
    }

    public void setParties(List<Party> parties) {
        this.parties = parties;
    }

    public CatalogProduct audioTracks(List<AudioTracks> audioTracks) {
        this.audioTracks = audioTracks;
        return this;
    }

    public CatalogProduct addAudioTracksItem(AudioTracks audioTracksItem) {
        if (this.audioTracks == null) {
            this.audioTracks = new ArrayList<AudioTracks>();
        }
        this.audioTracks.add(audioTracksItem);
        return this;
    }

    /**
     * Get audioTracks
     *
     * @return audioTracks
     **/
    @ApiModelProperty(value = "")
    public List<AudioTracks> getAudioTracks() {
        return audioTracks;
    }

    public void setAudioTracks(List<AudioTracks> audioTracks) {
        this.audioTracks = audioTracks;
    }

    public CatalogProduct series(List<Serie> series) {
        this.series = series;
        return this;
    }

    public CatalogProduct addSeriesItem(Serie seriesItem) {
        if (this.series == null) {
            this.series = new ArrayList<Serie>();
        }
        this.series.add(seriesItem);
        return this;
    }

    /**
     * Get series
     *
     * @return series
     **/
    @ApiModelProperty(value = "")
    public List<Serie> getSeries() {
        return series;
    }

    public void setSeries(List<Serie> series) {
        this.series = series;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CatalogProduct catalogProduct = (CatalogProduct) o;
        return Objects.equals(this.published, catalogProduct.published) &&
                Objects.equals(this.gpc, catalogProduct.gpc) &&
                Objects.equals(this.enrichment, catalogProduct.enrichment) &&
                Objects.equals(this.attributes, catalogProduct.attributes) &&
                Objects.equals(this.parties, catalogProduct.parties) &&
                Objects.equals(this.audioTracks, catalogProduct.audioTracks) &&
                Objects.equals(this.series, catalogProduct.series);
    }

    @Override
    public int hashCode() {
        return Objects.hash(published, gpc, enrichment, attributes, parties, audioTracks, series);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogProduct {\n");

        sb.append("    published: ").append(toIndentedString(published)).append("\n");
        sb.append("    gpc: ").append(toIndentedString(gpc)).append("\n");
        sb.append("    enrichment: ").append(toIndentedString(enrichment)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    parties: ").append(toIndentedString(parties)).append("\n");
        sb.append("    audioTracks: ").append(toIndentedString(audioTracks)).append("\n");
        sb.append("    series: ").append(toIndentedString(series)).append("\n");
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

