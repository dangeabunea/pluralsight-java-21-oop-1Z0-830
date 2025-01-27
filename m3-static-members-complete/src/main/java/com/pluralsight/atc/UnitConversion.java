package com.pluralsight.atc;

public class UnitConversion {
    private static int nauticalMileToMeters;
    private static double meterToFoot;

    static {
        // static initializer
        nauticalMileToMeters = 1852;
        meterToFoot = 3.28;
    }

    public static double fromMetersToFeet(int meters) {
        return meters * meterToFoot;
    }

    public static double fromMetersToNm(int meters) {
        return (double) (meters / nauticalMileToMeters);
    }
}
