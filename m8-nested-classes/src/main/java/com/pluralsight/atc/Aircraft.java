package com.pluralsight.atc;

public class Aircraft {
    private final AircraftModel model;
    private final int modeADecimal;

    public Aircraft(int modeADecimal, AircraftModel model) {
        this.model = model;
        this.modeADecimal = modeADecimal;
    }

    public String getModeAOctal() {
        var octal = "";

        if (this.modeADecimal < 0 || this.modeADecimal > 7777) {
            octal = null;
        }

        String octalValue = Integer
                .toOctalString(this.modeADecimal);

        // Append leading zeros
        if (octalValue.length() == 4) {
            octal = octalValue;
        }
        if (octalValue.length() == 3) {
            octal = "0" + octalValue;
        }
        if (octalValue.length() == 2) {
            octal = "00" + octalValue;
        }
        if (octalValue.length() == 1) {
            octal = "000" + octalValue;
        }

        return octal;
    }

    @Override
    public String toString() {
        return this.model.getValue() + "; ModeA: " + this.getModeAOctal();
    }
}
