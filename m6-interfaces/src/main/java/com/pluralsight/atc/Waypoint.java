package com.pluralsight.atc;

import com.pluralsight.atc.LatLon;
import com.pluralsight.atc.Shape;

public final class Waypoint {
    private final String name;
    private final LatLon position;

    public Waypoint(String name, LatLon position) {
        this.name = name;
        this.position = position;
    }
}
