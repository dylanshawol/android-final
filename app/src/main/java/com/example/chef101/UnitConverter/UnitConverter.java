package com.example.chef101.UnitConverter;

import java.util.List;

public class UnitConverter {

    protected static List<Conversions.MassUnitConversions> massConversionList = Conversions.getMassConversionList();
    protected static List<Conversions.VolumeUnitConversions> volumeConversionList = Conversions.getVolumeConversionList();
    protected static int conversionListLength = volumeConversionList.size();


    public static double spinnerConversion(double quantity, int spinner1Position, int spinner2Position) {
        for (int i = 0; i < conversionListLength; i++) {
            if (spinner1Position == 0) {
                return convertBySpinner(quantity, spinner1Position, spinner2Position);
            } else if (spinner1Position == i) {
                return convertBySpinner(quantity, spinner1Position, spinner2Position, i);
            }
        }
        return quantity;
    }


    private static double convertBySpinner(double quantity, int spinner1Position, int spinner2Position, int index) {
        for (int i = 0; i < conversionListLength; i++) {
            if (i == index) {
                i++;
            }

            if (spinner1Position == index && spinner2Position == i) {
                // Code for general conversion


                return volumeConversionList.get(index).volumeConversion(quantity, spinner2Position);
            }
        }
        return quantity;
    }

    private static double convertBySpinner(double quantity, int spinner1Position, int spinner2Position) {
        for (int i = 1; i < conversionListLength; i++) {
            if (spinner1Position == 0 && spinner2Position == i) {
                // Code for gram conversion

                return volumeConversionList.get(0).volumeConversion(quantity, spinner2Position);
            }
        }
        return quantity;
    }

}
