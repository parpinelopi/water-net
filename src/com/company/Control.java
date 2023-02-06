package com.company;

import java.util.Date;

/**
 * This class includes the control information and specifies the type
 */

public class Control {
    Type type;
    String measurementUnit;
    String frequency;
    String humanImpact;
    String hazardLevel;
    Date orderDate;

    public Control(Type type, String measurementUnit, String frequency, String humanImpact, String hazardLevel, Date orderDate) {
        this.type = type;
        this.measurementUnit = measurementUnit;
        this.frequency = frequency;
        this.humanImpact = humanImpact;
        this.hazardLevel = hazardLevel;
        this.orderDate = orderDate;
    }

    enum Type {
        waterPH,
        turbidity,
        dissolvedOxygen
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getMeasurementUnit() {
        return measurementUnit;
    }

    public void setMeasurementUnit(String measurementUnit) {
        this.measurementUnit = measurementUnit;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getHumanImpact() {
        return humanImpact;
    }

    public void setHumanImpact(String humanImpact) {
        this.humanImpact = humanImpact;
    }

    public String getHazardLevel() {
        return hazardLevel;
    }

    public void setHazardLevel(String hazardLevel) {
        this.hazardLevel = hazardLevel;
    }
}
