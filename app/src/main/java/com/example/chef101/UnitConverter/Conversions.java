package com.example.chef101.UnitConverter;

import java.util.ArrayList;
import java.util.List;

public class Conversions {
    /**
     * This class will store methods that will preform the calculations for the converter
     * using the constants and the spinner 1 position and spinner 2 position
     *
     * Spinner 1 is the units you are converting from
     * Spinner 2 is the units you are converting to
     */

    interface MassUnitConversions {
        double massConversion(double quantity, int spinner2Position);
    }

    private static final MassUnitConversions gramsConversion = new MassUnitConversions() {
        @Override
        public double massConversion(double quantity, int spinner2Position) {
            return unitConverter(quantity, spinner2Position, UnitConst.gramsToUnit);
        }
    };

    private static final MassUnitConversions tspMassConversion = new MassUnitConversions() {
        @Override
        public double massConversion(double quantity, int spinner2Position) {
              return unitConverter(quantity, spinner2Position, UnitConst.teaspoonsToUnit);
        }
    };

    private static final MassUnitConversions tbspMassConversion = new MassUnitConversions() {
        @Override
        public double massConversion(double quantity, int spinner2Position) {
            return unitConverter(quantity, spinner2Position, UnitConst.tablespoonsToUnit);
        }
    };

    private static final MassUnitConversions ouncesConversion = new MassUnitConversions() {
        @Override
        public double massConversion(double quantity, int spinner2Position) {
            return unitConverter(quantity, spinner2Position, UnitConst.ouncesToUnit);
        }
    };

    private static final MassUnitConversions poundsConversion = new MassUnitConversions() {
        @Override
        public double massConversion(double quantity, int spinner2Position) {
            return unitConverter(quantity, spinner2Position, UnitConst.poundsToUnit);
        }
    };

    private static final MassUnitConversions kilosConversion = new MassUnitConversions() {
        @Override
        public double massConversion(double quantity, int spinner2Position) {
            return unitConverter(quantity, spinner2Position, UnitConst.kilogramsToUnit);
        }
    };

    private static final List<MassUnitConversions> massConversionList = new ArrayList<>();

    protected static List<MassUnitConversions> getMassConversionList() {
        massConversionList.add(gramsConversion);
        massConversionList.add(tspMassConversion);
        massConversionList.add(tbspMassConversion);
        massConversionList.add(ouncesConversion);
        massConversionList.add(poundsConversion);
        massConversionList.add(kilosConversion);
        return massConversionList;
    }

    interface VolumeUnitConversions {
        double volumeConversion(double quantity, int spinner2Position);
    }

    private static final VolumeUnitConversions cupsConversion = new VolumeUnitConversions() {
        @Override
        public double volumeConversion(double quantity, int spinner2Position) {
            return unitConverter(quantity, spinner2Position, UnitConst.cupsToUnit);
        }
    };

    private static final VolumeUnitConversions tspVolumeConversion = new VolumeUnitConversions() {
        @Override
        public double volumeConversion(double quantity, int spinner2Position) {
            return unitConverter(quantity, spinner2Position, UnitConst.teaspoonsToVolUnit);
        }
    };

    private static final VolumeUnitConversions tbspVolumeConversion = new VolumeUnitConversions() {
        @Override
        public double volumeConversion(double quantity, int spinner2Position) {
            return unitConverter(quantity, spinner2Position, UnitConst.tablespoonsToVolUnit);
        }
    };

    private static final VolumeUnitConversions fluidOuncesConversion = new VolumeUnitConversions() {
        @Override
        public double volumeConversion(double quantity, int spinner2Position) {
            return unitConverter(quantity, spinner2Position, UnitConst.fluidOuncesToUnit);
        }
    };

    private static final VolumeUnitConversions litersConversion = new VolumeUnitConversions() {
        @Override
        public double volumeConversion(double quantity, int spinner2Position) {
            return unitConverter(quantity, spinner2Position, UnitConst.litersToUnit);
        }
    };

    private static final VolumeUnitConversions millilitersConversion = new VolumeUnitConversions() {
        @Override
        public double volumeConversion(double quantity, int spinner2Position) {
            return unitConverter(quantity, spinner2Position, UnitConst.millilitersToUnit);
        }
    };

    private static final List<VolumeUnitConversions> volumeConversionList = new ArrayList<>();

    protected static List<VolumeUnitConversions> getVolumeConversionList() {
        volumeConversionList.add(cupsConversion);
        volumeConversionList.add(tspVolumeConversion);
        volumeConversionList.add(tbspVolumeConversion);
        volumeConversionList.add(fluidOuncesConversion);
        volumeConversionList.add(litersConversion);
        volumeConversionList.add(millilitersConversion);
        return volumeConversionList;
    }

    /**
     * This method calculates the converted value of what is given
     * in the first decimal field.
     *
     * @param quantity              - quantity that is to be converted
     * @param secondSpinnerPosition - The position of the second spinner
     * @param unitsTo               - The list of units and their constants
     * @return                      - The converted quantity
     */
    protected static double unitConverter(double quantity, int secondSpinnerPosition, double[] unitsTo) {
        for (int i = 0; i < unitsTo.length; i++) {
            if (secondSpinnerPosition == i) {
                return quantity * unitsTo[i];
            }
        }
        return 0;
    }

}
