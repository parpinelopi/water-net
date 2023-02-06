package com.company;

import java.util.Date;

/**
 *This class includes the result of the water quality control
 */

public class ControlResult {

    Sample sample ;
    String resultValue;
    Date resultDate;

    public ControlResult(Sample sample, String resultValue, Date resultDate) {
        this.sample = sample;
        this.resultValue = resultValue;
    }

    public Sample getSample() {
        return sample;
    }

    public void setSample(Sample sample) {
        this.sample = sample;
    }

    public String getResultValue() {
        return resultValue;
    }

    public void setResultValue(String resultValue) {
        this.resultValue = resultValue;
    }

    public Date getResultDate() {
        return resultDate;
    }

    public void setResultDate(Date resultDate) {
        this.resultDate = resultDate;
    }
}
