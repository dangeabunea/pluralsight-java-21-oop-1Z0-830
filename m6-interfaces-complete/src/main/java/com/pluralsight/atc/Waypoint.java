package com.pluralsight.atc;

public final class Waypoint implements Shape {
    private final String name;
    private final LatLon position;

    public Waypoint(String name, LatLon position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String convertToWkt() {
        StringBuilder sb = new StringBuilder();
        sb.append("POINT (")
                .append(this.position.getLon())
                .append(" ")
                .append(this.position.getLat())
                .append(")");

        return sb.toString();
    }
}
