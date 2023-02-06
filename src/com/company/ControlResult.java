package com.company;

import java.util.Date;

public class ControlResult {

    Sample sample ;
    String resultValue;
    Date resultDate;

    public ControlResult(Sample sample, String resultValue) {
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
}
