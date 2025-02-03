package com.pluralsight.atc;

public class Application {
    public static void main(String[] args) {
        /*
        No encapsulation - four major issues:
        - no validation - coordinates are wrong
        - can set one without the other
        - no behaviour, scatter code, misuse
        - change
        Coordinate somePoint = new Coordinate();
        somePoint.lat = 91.124;
        somePoint.lon = 181.6795;
        System.out.println("Lat: " + somePoint.lat + ", Lon: " + somePoint.lon);
         */

        Coordinate somePoint = new Coordinate(12, 45);
        System.out.println(somePoint);
    }
}
