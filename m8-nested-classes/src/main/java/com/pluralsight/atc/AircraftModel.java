package com.pluralsight.atc;

public class AircraftModel {
    private final String value;

    public AircraftModel(String modelName) {
        if(modelName == null){
            throw new IllegalArgumentException("Model cannot be null");
        }

        if(modelName.length() < 4 || modelName.length() > 8){
            throw new IllegalArgumentException("Mode length not between 4 and 8");
        }

        this.value = modelName;
    }

    public String getValue() {
        return value;
    }
}
