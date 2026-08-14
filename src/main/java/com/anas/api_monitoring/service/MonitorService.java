package com.anas.api_monitoring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.anas.api_monitoring.exception.MonitorNotFoundException;
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

    public Monitor getMonitorById(Long id) {
    return monitorRepository.findById(id)
            .orElseThrow(() -> new MonitorNotFoundException(id));
    }

    public Monitor updateMonitor(Long id, Monitor updatedMonitor) {

        Monitor existingMonitor = monitorRepository.findById(id)
                .orElseThrow(() -> new MonitorNotFoundException(id));

        existingMonitor.setName(updatedMonitor.getName());
        existingMonitor.setUrl(updatedMonitor.getUrl());
        existingMonitor.setMethod(updatedMonitor.getMethod());
        existingMonitor.setIntervalSeconds(updatedMonitor.getIntervalSeconds());

    return monitorRepository.save(existingMonitor);
    }

    public void deleteMonitor(Long id) {

    Monitor existingMonitor = monitorRepository.findById(id)
            .orElseThrow(() -> new MonitorNotFoundException(id));

    monitorRepository.delete(existingMonitor);
}
}
