package com.pluralsight.atc;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        final List<NeighbourAircraft> neighbourAircraft = List.of(
                new NeighbourAircraft("OS793", 4000, 300),
                new NeighbourAircraft("RO123", 10000, 200),
                new NeighbourAircraft("AF567", 6000, 400)
        );

        neighbourAircraft.forEach((neighbour) -> {
                    double horizDistanceInNm = UnitConversion.fromMetersToNm(neighbour.getHorizontalDistInMeters());
                    double vertDistInFeet = UnitConversion.fromMetersToFeet(neighbour.getVerticalDistInMeters());

                    if (horizDistanceInNm < 5.0 && vertDistInFeet < 2000) {
                        System.out.println("Alert - Aircraft " + neighbour.getCallSign() + " too close");
                    }
                }
        );
    }
}
