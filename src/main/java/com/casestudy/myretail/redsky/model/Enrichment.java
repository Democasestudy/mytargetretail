
/*
 * Copyright (c) 2020. myRetail Case study
 */

package com.casestudy.myretail.redsky.model;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "images",
    "sales_classification_nodes"
})
public class Enrichment implements Serializable
{

    @JsonProperty("images")
    private List<Image> images = null;
    @JsonProperty("sales_classification_nodes")
    private List<SalesClassificationNode> salesClassificationNodes = null;
    private final static long serialVersionUID = 8666964578594892322L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Enrichment() {
    }

    /**
     * 
     * @param images
     * @param salesClassificationNodes
     */
    public Enrichment(List<Image> images, List<SalesClassificationNode> salesClassificationNodes) {
        super();
        this.images = images;
        this.salesClassificationNodes = salesClassificationNodes;
    }

    @JsonProperty("images")
    public List<Image> getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(List<Image> images) {
        this.images = images;
    }

    @JsonProperty("sales_classification_nodes")
    public List<SalesClassificationNode> getSalesClassificationNodes() {
        return salesClassificationNodes;
    }

    @JsonProperty("sales_classification_nodes")
    public void setSalesClassificationNodes(List<SalesClassificationNode> salesClassificationNodes) {
        this.salesClassificationNodes = salesClassificationNodes;
    }

}
