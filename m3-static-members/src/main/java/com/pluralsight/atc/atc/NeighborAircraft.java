package com.pluralsight.atc.atc;

public class NeighborAircraft {
    private String callSign;
    private int horizontalDistInMeters;
    private int verticalDistInMeters;

    public NeighborAircraft(String callSign,
                            int horizontalDistInMeters,
                            int verticalDistInMeters) {
        this.callSign = callSign;
        this.horizontalDistInMeters = horizontalDistInMeters;
        this.verticalDistInMeters = verticalDistInMeters;
    }

    public String getCallSign() {
        return callSign;
    }

    public int getHorizontalDistInMeters() {
        return horizontalDistInMeters;
    }

    public int getVerticalDistInMeters() {
        return verticalDistInMeters;
    }
}
