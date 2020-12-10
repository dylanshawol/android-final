package com.example.chef101.UnitConverter;

import com.example.chef101.fragments.ConverterFragment;

import java.util.List;

public class UnitConverter {
    // Create a list of massConversions
    protected static List<Conversions.MassUnitConversions> massConversionList = Conversions.getMassConversionList();
    // Create a list of unitConversions
    protected static List<Conversions.VolumeUnitConversions> volumeConversionList = Conversions.getVolumeConversionList();
    // Get the size of one of the lists (both are the same size)
    protected static int conversionListLength = volumeConversionList.size();

    /**
     *
     * This method utilizes the MassUnitConversions and VolumeUnitConversions interfaces and
     * converts a quantity to another unit by calling the method associated with each interface
     * based on what was selected in each spinner.
     *
     * @param quantity              - The quantity that is to be converted.
     * @param firstSpinnerPosition  - The first position of the spinner, the unit that is to be converted from.
     * @param secondSpinnerPosition - The second position of the spinner, the unit that is to be converted to.
     * @return                      - Converted volume unit OR Converted mass unit/
     * @author Dylan Shawol
     */
    public static double convertBySpinner(double quantity, int firstSpinnerPosition, int secondSpinnerPosition) {
        for (int i = 0; i < conversionListLength; i++) {
            if (secondSpinnerPosition == i) {
                if (ConverterFragment.isMassOrVolume.equals("mass")) {
                    return massConversionList.get(firstSpinnerPosition).massConversion(quantity, secondSpinnerPosition);
                } else if (ConverterFragment.isMassOrVolume.equals("volume")) {
                    return volumeConversionList.get(firstSpinnerPosition).volumeConversion(quantity, secondSpinnerPosition);
                }
            }
        }
        return quantity;
    }
}
