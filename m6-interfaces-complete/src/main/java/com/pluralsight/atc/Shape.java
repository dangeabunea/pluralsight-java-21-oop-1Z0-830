package com.pluralsight.atc;

public sealed interface Shape permits Route, Waypoint {
    default String toWkt() {
        String wkt = this.convertToWkt();

        if (this.isWktValid(wkt)) {
            return wkt;
        }
        throw new RuntimeException("Can not draw shape");
    }

    String convertToWkt();

    private boolean isWktValid(String wkt) {
        if (wkt == null || wkt.isEmpty()) {
            return false;
        }

        return wkt.startsWith("POINT") ||
                wkt.startsWith("LINESTRING") ||
                wkt.startsWith("POLYGON");
    }
}
