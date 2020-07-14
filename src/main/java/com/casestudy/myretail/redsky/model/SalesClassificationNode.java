
/*
 * Copyright (c) 2020. myRetail Case study
 */

package com.casestudy.myretail.redsky.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "node_id"
})
public class SalesClassificationNode implements Serializable
{

    @JsonProperty("node_id")
    private String nodeId;
    private final static long serialVersionUID = 8755313579168040147L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SalesClassificationNode() {
    }

    /**
     * 
     * @param nodeId
     */
    public SalesClassificationNode(String nodeId) {
        super();
        this.nodeId = nodeId;
    }

    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    @JsonProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

}
