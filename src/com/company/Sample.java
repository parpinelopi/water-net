package com.company;

public class Sample {
    Laboratory laboratory ;
    Location location ;
    Control  control ;
    String quantity;
    int quantityUnit;

    public Sample(Laboratory laboratory, Location location, Control control, String quantity, int quantityUnit) {
        this.laboratory = laboratory;
        this.location = location;
        this.control = control;
        this.quantity = quantity;
        this.quantityUnit = quantityUnit;
    }
}
