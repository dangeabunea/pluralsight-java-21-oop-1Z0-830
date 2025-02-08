package com.pluralsight.atc;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // Create an airspace
        List<Shape> airspace = List.of(
                new Waypoint("CREOL", new LatLon(20.3, 40.7)),
                new Waypoint("ZIDCO", new LatLon(87.1, 20.7)),
                new Waypoint("RYTHM", new LatLon(44.5, 23.2)),
                new Route("ROUTE1",
                        new LatLon(41.3, 2.3),
                        new LatLon(41.5, 2.4),
                        new LatLon(41.7, 2.7))
        );

        boolean printRoutes = true;
        boolean printWaypoints = false;

        // Print wkt for drawing on screen
        airspace.forEach(s -> {
            switch (s){
                case Waypoint waypoint:{
                    if(printWaypoints){
                        System.out.println(waypoint.toString());
                    }
                    break;
                }
                case Route route:{
                    if(printRoutes){
                        System.out.println(route.toWkt());
                    }
                    break;
                }
            }
        });
    }
}
