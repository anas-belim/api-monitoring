package com.anas.api_monitoring.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anas.api_monitoring.dto.MonitorRequest;
import com.anas.api_monitoring.model.Monitor;
import com.anas.api_monitoring.service.MonitorService;

import jakarta.validation.Valid;

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
    public Monitor createMonitor(@Valid @RequestBody MonitorRequest request) {
        return monitorService.createMonitor(request);
    }

    @GetMapping("/{id}")
    public Monitor getMonitorById(@PathVariable Long id) {
        return monitorService.getMonitorById(id);
    }

    @PutMapping("/{id}")
    public Monitor updateMonitor(
        @PathVariable Long id,
        @RequestBody Monitor monitor
    ) {
        return monitorService.updateMonitor(id, monitor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMonitor(@PathVariable Long id) {

        monitorService.deleteMonitor(id);

        return ResponseEntity.noContent().build();
    }

}