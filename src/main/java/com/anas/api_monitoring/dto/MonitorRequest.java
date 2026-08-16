package com.anas.api_monitoring.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class MonitorRequest {

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "URL is required")
    private String url;

    @NotBlank(message = "Method is required")
    private String method;

    @Positive(message = "Interval must be greater than 0")
    private Integer intervalSeconds;

    public MonitorRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Integer getIntervalSeconds() {
        return intervalSeconds;
    }

    public void setIntervalSeconds(Integer intervalSeconds) {
        this.intervalSeconds = intervalSeconds;
    }
}