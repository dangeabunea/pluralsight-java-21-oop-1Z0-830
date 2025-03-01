package com.pluralsight.atc.atc;

public sealed abstract class Shape permits Route, Waypoint {
    public String toWkt() {
        String wkt = this.convertToWkt();

        if (this.isWktValid(wkt)) {
            return wkt;
        }
        throw new RuntimeException("Can not draw shape");
    }

    protected abstract String convertToWkt();

    private boolean isWktValid(String wkt) {
        if (wkt == null || wkt.isEmpty()) {
            return false;
        }

        return wkt.startsWith("POINT") ||
                wkt.startsWith("LINESTRING") ||
                wkt.startsWith("POLYGON");
    }
}
