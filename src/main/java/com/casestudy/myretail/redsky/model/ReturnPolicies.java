
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
    "user",
    "policyDays",
    "guestMessage"
})
public class ReturnPolicies implements Serializable
{

    @JsonProperty("user")
    private String user;
    @JsonProperty("policyDays")
    private String policyDays;
    @JsonProperty("guestMessage")
    private String guestMessage;
    private final static long serialVersionUID = 5505098904401556196L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ReturnPolicies() {
    }

    /**
     * 
     * @param user
     * @param policyDays
     * @param guestMessage
     */
    public ReturnPolicies(String user, String policyDays, String guestMessage) {
        super();
        this.user = user;
        this.policyDays = policyDays;
        this.guestMessage = guestMessage;
    }

    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    @JsonProperty("policyDays")
    public String getPolicyDays() {
        return policyDays;
    }

    @JsonProperty("policyDays")
    public void setPolicyDays(String policyDays) {
        this.policyDays = policyDays;
    }

    @JsonProperty("guestMessage")
    public String getGuestMessage() {
        return guestMessage;
    }

    @JsonProperty("guestMessage")
    public void setGuestMessage(String guestMessage) {
        this.guestMessage = guestMessage;
    }

}
