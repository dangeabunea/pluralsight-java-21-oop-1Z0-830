package com.pluralsight.atc.atc;

public final class Coordinate {
    private final double lat;
    private final double lon;

    public Coordinate(double lat, double lon) {
        if (lat < -90 || lat > 90) {
            throw new IllegalArgumentException("Value not valid");
        }

        if (lon < -180 || lon > 180) {
            throw new IllegalArgumentException("Value not valid");
        }

        this.lat = lat;
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public String toString() {
        return "Lat: " + this.getLat() + ", Lon: " + this.getLon();
    }
}
