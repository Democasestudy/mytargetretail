
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
    "is_size_chart"
})
public class DisplayOption implements Serializable
{

    @JsonProperty("is_size_chart")
    private Boolean isSizeChart;
    private final static long serialVersionUID = -4538428614188974215L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DisplayOption() {
    }

    /**
     * 
     * @param isSizeChart
     */
    public DisplayOption(Boolean isSizeChart) {
        super();
        this.isSizeChart = isSizeChart;
    }

    @JsonProperty("is_size_chart")
    public Boolean getIsSizeChart() {
        return isSizeChart;
    }

    @JsonProperty("is_size_chart")
    public void setIsSizeChart(Boolean isSizeChart) {
        this.isSizeChart = isSizeChart;
    }

}
