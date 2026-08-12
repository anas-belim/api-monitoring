package com.anas.api_monitoring.repository;

import com.anas.api_monitoring.model.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonitorRepository extends JpaRepository<Monitor, Long> {
}