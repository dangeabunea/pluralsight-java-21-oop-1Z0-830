package com.pluralsight.atc;

public class Aircraft {
    private final Model model;
    private final int modeADecimal;

    public Aircraft(int modeADecimal, Model model) {
        this.model = model;
        this.modeADecimal = modeADecimal;
    }

    public String getModeAOctal() {
        ModeACode modeACode = new ModeACode();
        return modeACode.getOctal();
    }

    @Override
    public String toString() {
        return this.model.getValue() + "; ModeA: " + this.getModeAOctal();
    }

    /**
     * Will not be reused outside the Aircraft class
     * Will keep it local
     */
    class ModeACode {
        private String octal;

        public ModeACode() {
            int decimalValue = Aircraft.this.modeADecimal;

            if (decimalValue < 0 || decimalValue > 7777) {
                this.octal = null;
            }

            String octalValue = Integer.toOctalString(decimalValue);

            // Append leading zeros
            if (octalValue.length() == 4) {
                this.octal = octalValue;
            }
            if (octalValue.length() == 3) {
                this.octal = "0" + octalValue;
            }
            if (octalValue.length() == 2) {
                this.octal = "00" + octalValue;
            }
            if (octalValue.length() == 1) {
                this.octal = "000" + octalValue;
            }
        }

        public String getOctal() {
            return octal;
        }
    }

    static class Horizontal{
        private double valueInNauticalMiles;

        Horizontal(double valueInNauticalMiles) {
            this.valueInNauticalMiles = valueInNauticalMiles;
        }
    }

    static class Vertical{
        private double valueInFeet;

        Vertical(double valueInFeet) {
            this.valueInFeet = valueInFeet;
        }
    }

    /**
     * Will be reused
     * Will declare it as a static nested class
     */
    public static class Model {
        private final String value;

        public Model(String modelName) {
            if(modelName == null){
                throw new IllegalArgumentException("Model cannot be null");
            }

            if(modelName.length() < 4 || modelName.length() > 8){
                throw new IllegalArgumentException("Mode length not between 4 and 8");
            }

            this.value = modelName;
        }

        public String getValue() {
            return value;
        }
    }
}
