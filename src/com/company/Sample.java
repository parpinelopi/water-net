package com.company;

import java.util.Date;

/**
 *This class provides the sample information
 */
public class Sample {
    Laboratory laboratory ;
    Location location ;
    Control  control ;
    String quantity;
    int quantityUnit;
    Date sampleDate;

    public Sample(Laboratory laboratory, Location location, Control control, String quantity, int quantityUnit, Date sampleDate) {
        this.laboratory = laboratory;
        this.location = location;
        this.control = control;
        this.quantity = quantity;
        this.quantityUnit = quantityUnit;
        this.sampleDate = sampleDate;
    }
}
