package com.pluralsight.atc;

import java.util.List;

public final class Route {
    private final String name;
    private final List<LatLon> coordinates;

    public Route(String name, LatLon... coordinates) {
        this.name = name;
        this.coordinates = List.of(coordinates);
    }
}
