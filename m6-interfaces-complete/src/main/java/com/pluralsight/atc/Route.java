package com.pluralsight.atc;

import java.util.List;

public final class Route implements Shape, ClosableAirspace {
    private final String name;
    private final List<LatLon> coordinates;
    private boolean closed = false;

    public Route(String name, LatLon... coordinates) {
        this.name = name;
        this.coordinates = List.of(coordinates);
    }

    @Override
    public String convertToWkt() {
        StringBuilder sb = new StringBuilder();
        sb.append("LINESTRING (");
        for (int i = 0; i < coordinates.size(); i++) {
            LatLon latLon = coordinates.get(i);
            sb.append(latLon.getLon() + " " + latLon.getLat());
            if (i < coordinates.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(")");

        return sb.toString();
    }

    @Override
    public boolean isClosed() {
        return this.closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }
}
