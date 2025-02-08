package com.pluralsight.atc;

public class Shape {
    public String toWkt() {
        String wkt = this.convertToWkt();

        if (this.isWktValid(wkt)) {
            return wkt;
        }
        throw new RuntimeException("Can not draw shape");
    }

    // Each class needs to provide override
    protected String convertToWkt(){
        return "";
    };

    private boolean isWktValid(String wkt) {
        if (wkt == null || wkt.isEmpty()) {
            return false;
        }

        return wkt.startsWith("POINT") ||
                wkt.startsWith("LINESTRING") ||
                wkt.startsWith("POLYGON");
    }
}
