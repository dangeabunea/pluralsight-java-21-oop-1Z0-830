package com.pluralsight.atc;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        final List<NeighborAircraft> neighborAircraft = List.of(
                new NeighborAircraft("OS793", 4000, 300),
                new NeighborAircraft("RO123", 10000, 200),
                new NeighborAircraft("AF567", 6000, 400)
        );

        neighborAircraft.forEach((neighbour) -> {
                    double horizDistanceInNm = (double) neighbour.getHorizontalDistInMeters() / 1852;
                    double vertDistInFeet = neighbour.getVerticalDistInMeters() * 3.28;

                    if (horizDistanceInNm < 5.0 && vertDistInFeet < 2000) {
                        System.out.println("Alert - Aircraft " + neighbour.getCallSign() + " too close");
                    }
                }
        );
    }
}
