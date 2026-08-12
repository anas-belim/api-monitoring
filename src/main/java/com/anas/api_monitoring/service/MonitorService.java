package com.anas.api_monitoring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.anas.api_monitoring.model.Monitor;
import com.anas.api_monitoring.repository.MonitorRepository;

@Service
public class MonitorService {

    private final MonitorRepository monitorRepository;

    public MonitorService(MonitorRepository monitorRepository) {
        this.monitorRepository = monitorRepository;
    }

    public List<Monitor> getAllMonitors() {
        return monitorRepository.findAll();
    }

    public Monitor createMonitor(Monitor monitor) {
    return monitorRepository.save(monitor);
    }
}
