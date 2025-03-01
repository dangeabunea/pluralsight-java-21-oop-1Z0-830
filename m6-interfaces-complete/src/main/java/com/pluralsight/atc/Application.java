package com.pluralsight.atc;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // Create an airspace
        var route1 = new Route("ROUTE 1",
                new LatLon(41.3, 2.3),
                new LatLon(41.5, 2.4),
                new LatLon(41.7, 2.7));

        var route2 = new Route("ROUTE 2",
                new LatLon(36.3, 2.3),
                new LatLon(36.5, 2.4),
                new LatLon(36.7, 2.7));
        route2.setClosed(true);

        List<Shape> airspace = List.of(
                new Waypoint("CREOL", new LatLon(20.3, 40.7)),
                new Waypoint("ZIDCO", new LatLon(87.1, 20.7)),
                new Waypoint("RYTHM", new LatLon(44.5, 23.2)),
                route1,
                route2
        );

        // Print wkt for drawing on screen
        airspace.forEach(shape -> {
            if(shape instanceof ClosableAirspace ca) {
                if(!ca.isClosed()){
                    System.out.println(shape.toWkt());
                }
            } else{
                System.out.println(shape.toWkt());
            }
        });
    }
}
