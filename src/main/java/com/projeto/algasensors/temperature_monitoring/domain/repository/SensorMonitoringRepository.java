package com.projeto.algasensors.temperature_monitoring.domain.repository;

import com.projeto.algasensors.temperature_monitoring.domain.model.SensorId;
import com.projeto.algasensors.temperature_monitoring.domain.model.SensorMonitoring;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorMonitoringRepository extends JpaRepository<SensorMonitoring, SensorId> {
}
