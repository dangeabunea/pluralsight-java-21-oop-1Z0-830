package com.pluralsight.atc;

public class Application {
    public static void main(String[] args) {
        var aircraft = new Aircraft(1001, new AircraftModel("A320"));

        System.out.println(aircraft);
    }
}
