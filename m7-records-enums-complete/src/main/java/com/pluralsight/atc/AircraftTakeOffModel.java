package com.pluralsight.atc;

import com.pluralsight.atc.WakeTurbulence;

public record AircraftTakeOffModel(String callSign,
                                         String model,
                                         WakeTurbulence wakeTurbulence) {

    public AircraftTakeOffModel {
        if (model == null || model.isEmpty()) {
            throw new IllegalArgumentException("Model is null or empty");
        }
        if (callSign == null || callSign.isEmpty()) {
            throw new IllegalArgumentException("CallSign is null or empty");
        }
    }
}