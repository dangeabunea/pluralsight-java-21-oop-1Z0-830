package com.pluralsight.atc;

public final class AircraftTakeOffModel {
    private final String callSign;
    private final String model;

    public AircraftTakeOffModel(String callSign,
                                String model) {
        if (model == null || model.isEmpty()) {
            throw new IllegalArgumentException("Model is null or empty");
        }
        if (callSign == null || callSign.isEmpty()) {
            throw new IllegalArgumentException("CallSign is null or empty");
        }

        this.callSign = callSign;
        this.model = model;
    }

    public String callSign() {
        return this.callSign;
    }

    public String getModel() {
        return this.model;
    }
}