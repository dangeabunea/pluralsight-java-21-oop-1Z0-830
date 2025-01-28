package com.pluralsight.atc;

public class UnitConversion {
    private static int nauticalMileToMeters;
    private static double meterToFeet;

    static {
        // static initializer
        nauticalMileToMeters = 1852;
        meterToFeet = 3.28;
    }

    public static double fromMetersToFeet(int meters) {
        return meters * meterToFeet;
    }

    public static double fromMetersToNm(int meters) {
        return (double) (meters / nauticalMileToMeters);
    }
}
