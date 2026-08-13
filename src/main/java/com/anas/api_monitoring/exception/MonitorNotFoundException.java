package com.anas.api_monitoring.exception;

public class MonitorNotFoundException extends RuntimeException {

    public MonitorNotFoundException(Long id) {
        super("Monitor with id " + id + " not found");
    }
}