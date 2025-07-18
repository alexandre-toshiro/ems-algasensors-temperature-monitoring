package com.projeto.algasensors.temperature_monitoring.domain.model;

import io.hypersistence.tsid.TSID;
import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SensorId implements Serializable {

    private TSID value;

    public SensorId(TSID value) {
        Objects.requireNonNull(value, "TSID cannot be null");
        this.value = value;
    }

    public SensorId(Long value) {
        Objects.requireNonNull(value, "TSID cannot be null");
        this.value = TSID.from(value);
    }

    public SensorId(String value) {
        Objects.requireNonNull(value, "TSID cannot be null");
        this.value = TSID.from(value);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
