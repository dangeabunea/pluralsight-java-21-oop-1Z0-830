package com.pluralsight.atc;

import java.util.concurrent.CompletableFuture;

public class AircraftTarget {
    private String callSign;
    private int flightLevel;
    private int requiredFlightLevel;
    private final String model;

    public AircraftTarget(String callSign, int flightLevel, String model) {
        this.callSign = callSign;
        this.flightLevel = flightLevel;
        this.requiredFlightLevel = flightLevel;
        this.model = model;
    }

    public String getLabel() {
        var sb = new StringBuilder();
        sb.append(this.callSign);
        sb.append(System.lineSeparator());
        sb.append(this.flightLevel);

        // If desired FL different that current FL, add additional info on target
        if (this.requiredFlightLevel != this.flightLevel) {
            sb.append(this.getClimbDescendIndicator());
            sb.append(this.requiredFlightLevel);
        }

        sb.append(System.lineSeparator());
        sb.append(model);
        sb.append(System.lineSeparator());

        return sb.toString();
    }

    public void changeAltitude(int newFl) {
        System.out.println(this.callSign + " change altitude to " + newFl);
        System.out.println();

        int maxTimeToComplyWithAltitudeChange = 3000; // 3 seconds

        // Set required flight level
        this.requiredFlightLevel = newFl;

        // Simulate long-running operation (altitude change after 5 seconds)
        CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(maxTimeToComplyWithAltitudeChange);
                this.flightLevel = requiredFlightLevel;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException("Task was interrupted", e);
            }
        });
    }

    public void changeAltitude(int newFl, int timeToComplyInSeconds) {
        System.out.println(this.callSign + " change altitude to " + newFl);
        System.out.println();

        int maxTimeToComplyWithAltitudeChange = timeToComplyInSeconds * 1000;

        // Set required flight level
        this.requiredFlightLevel = newFl;

        // Simulate long-running operation (altitude change after 5 seconds)
        CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(maxTimeToComplyWithAltitudeChange);
                this.flightLevel = requiredFlightLevel;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException("Task was interrupted", e);
            }
        });
    }

    private String getClimbDescendIndicator() {
        if (this.requiredFlightLevel > this.flightLevel) {
            return "▲";
        }
        if (this.requiredFlightLevel < this.flightLevel) {
            return "▼";
        }
        return "";
    }

}
