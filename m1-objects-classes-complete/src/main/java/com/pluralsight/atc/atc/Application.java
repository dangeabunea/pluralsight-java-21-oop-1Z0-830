package com.pluralsight.atc.atc;

import java.time.LocalDateTime;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // Partial flight plan
        FlightPlan berlinToBucharest = new FlightPlan(
                "BER",
                "OTP"
        );
        berlinToBucharest.print();

        System.out.println();

        // Complete flight plan
        FlightPlan parisToLondon = new FlightPlan(
                "CDG",
                "LHR",
                LocalDateTime.of(2020, 01, 10, 23, 15),
                List.of("CDG", "FARAR", "BAYKA", "DUDES", "LHR")
        );

        parisToLondon.print();

        // Object reference
        System.out.println();
        FlightPlan flightPlan = parisToLondon;
        flightPlan.departure = "Paris Orly";
        parisToLondon.print();

        // Object reassignment
        System.out.println();
        parisToLondon = berlinToBucharest;
        parisToLondon.print();
    }
}
