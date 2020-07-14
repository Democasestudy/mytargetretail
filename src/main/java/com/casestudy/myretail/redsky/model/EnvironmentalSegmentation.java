
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
    "is_hazardous_material",
    "has_lead_disclosure"
})
public class EnvironmentalSegmentation implements Serializable
{

    @JsonProperty("is_hazardous_material")
    private Boolean isHazardousMaterial;
    @JsonProperty("has_lead_disclosure")
    private Boolean hasLeadDisclosure;
    private final static long serialVersionUID = -7658139421867506651L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public EnvironmentalSegmentation() {
    }

    /**
     * 
     * @param isHazardousMaterial
     * @param hasLeadDisclosure
     */
    public EnvironmentalSegmentation(Boolean isHazardousMaterial, Boolean hasLeadDisclosure) {
        super();
        this.isHazardousMaterial = isHazardousMaterial;
        this.hasLeadDisclosure = hasLeadDisclosure;
    }

    @JsonProperty("is_hazardous_material")
    public Boolean getIsHazardousMaterial() {
        return isHazardousMaterial;
    }

    @JsonProperty("is_hazardous_material")
    public void setIsHazardousMaterial(Boolean isHazardousMaterial) {
        this.isHazardousMaterial = isHazardousMaterial;
    }

    @JsonProperty("has_lead_disclosure")
    public Boolean getHasLeadDisclosure() {
        return hasLeadDisclosure;
    }

    @JsonProperty("has_lead_disclosure")
    public void setHasLeadDisclosure(Boolean hasLeadDisclosure) {
        this.hasLeadDisclosure = hasLeadDisclosure;
    }

}
