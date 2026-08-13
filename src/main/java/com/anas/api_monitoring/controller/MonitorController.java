package com.anas.api_monitoring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anas.api_monitoring.model.Monitor;
import com.anas.api_monitoring.service.MonitorService;

@RestController
@RequestMapping("/api/monitors")
public class MonitorController {

    private final MonitorService monitorService;

    public MonitorController(MonitorService monitorService) {
        this.monitorService = monitorService;
    }

    @GetMapping
    public List<Monitor> getMonitors() {
        return monitorService.getAllMonitors();
    }

    @PostMapping
    public Monitor createMonitor(@RequestBody Monitor monitor) {
        return monitorService.createMonitor(monitor);
    }

    @GetMapping("/{id}")
    public Monitor getMonitorById(@PathVariable Long id) {
        return monitorService.getMonitorById(id);
    }

}