package com.company;

import java.util.Date;

/**
 * This class includes the control information and specifies the type
 */

public class Control {
    ControlType type;
    String measurementUnit;
    String frequency;
    String humanImpact;
    String hazardLevel;
    Date orderDate;

    public Control(ControlType type, String measurementUnit, String frequency, String humanImpact, String hazardLevel, Date orderDate) {
        this.type = type;
        this.measurementUnit = measurementUnit;
        this.frequency = frequency;
        this.humanImpact = humanImpact;
        this.hazardLevel = hazardLevel;
        this.orderDate = orderDate;
    }



    public ControlType getType() {
        return type;
    }

    public void setType(ControlType type) {
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
