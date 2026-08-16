package com.anas.api_monitoring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anas.api_monitoring.model.Monitor;

public interface MonitorRepository extends JpaRepository<Monitor, Long> {
}