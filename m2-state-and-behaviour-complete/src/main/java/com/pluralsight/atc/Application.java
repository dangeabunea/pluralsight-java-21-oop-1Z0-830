package com.pluralsight.atc;

import java.util.concurrent.CompletableFuture;

public class Application {
    public static void main(String[] args) {
        var os791 = new AircraftTarget("OS791", 280, "B737-800");

        // Print current label
        System.out.println(os791.getLabel());

        // Change altitude command
        os791.changeAltitude(200);
        //os791.changeAltitude(200, 2);
        System.out.println(os791.getLabel());

        var waitForAltitudeAdjustment = CompletableFuture.runAsync(() -> {
            try {
                // Simulate a task that takes a few seconds
                Thread.sleep(3000); // Wait for 5 seconds
                System.out.println(os791.getLabel());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException("Task was interrupted", e);
            }
        });
        waitForAltitudeAdjustment.join();
    }
}
