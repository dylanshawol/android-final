package com.example.chef101.UnitConverter;

public class UnitConverter {

    protected static int conversionListLength = Conversions.getMassConversionList().size();

    public static double unitConversion(double quantity, int spinner1Position, int spinner2Position) {
        for (int i = 0; i < conversionListLength; i++) {
            if (spinner1Position == 0) {
                return convert(quantity, spinner1Position, spinner2Position);
            } else if (spinner1Position == i) {
                return convert(quantity, spinner1Position, spinner2Position, i);
            }
        }
        return quantity;
    }


    private static double convert(double quantity, int spinner1Position, int spinner2Position, int index) {
        for (int i = 0; i < conversionListLength; i++) {
            if (i == index) {
                i++;
            }

            if (spinner1Position == index && spinner2Position == i) {
                // Code for conversion
                return Conversions.getMassConversionList().get(index).conversion(quantity, spinner2Position);
            }
        }
        return quantity;
    }

    private static double convert(double quantity, int spinner1Position, int spinner2Position) {
        for (int i = 1; i < conversionListLength; i++) {
            if (spinner1Position == 0 && spinner2Position == i) {
                // Code for gram conversion
                return Conversions.getMassConversionList().get(0).conversion(quantity, spinner2Position);
            }
        }
        return quantity;
    }

}
