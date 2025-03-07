package com.pluralsight.atc;

import java.time.LocalDateTime;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<AircraftTakeOffModel> aircraftTakeOffs = List.of(
                new AircraftTakeOffModel("OT567", "B737", WakeTurbulence.LIGHT),
                new AircraftTakeOffModel("FR893", "A320", WakeTurbulence.LIGHT),
                new AircraftTakeOffModel("RO123", "A330", WakeTurbulence.MEDIUM),
                new AircraftTakeOffModel("BA894", "A380", WakeTurbulence.SUPER)
        );

        int offset = 0;
        for (AircraftTakeOffModel a : aircraftTakeOffs) {
            offset += a.wakeTurbulence().getTimeOffset();
            LocalDateTime depTime = LocalDateTime
                    .now()
                    .plusSeconds(offset);
            System.out.println("Aircraft " + a.callSign() + " takes off at " + depTime);
        }
    }
}
