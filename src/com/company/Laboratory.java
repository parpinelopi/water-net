package com.company;


/**
 * This class represents the collaborating laboratories
 */

public class Laboratory {
    String name;
    String laboratoryId;
    ControlType controlType;

    public Laboratory(String name, String laboratoryId, ControlType controlType) {
        this.name = name;
        this.laboratoryId = laboratoryId;
        this.controlType = controlType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLaboratoryId() {
        return laboratoryId;
    }

    public void setLaboratoryId(String laboratoryId) {
        this.laboratoryId = laboratoryId;
    }

    public ControlType getControlType() {
        return controlType;
    }

    public void setControlType(ControlType controlType) {
        this.controlType = controlType;
    }

}
