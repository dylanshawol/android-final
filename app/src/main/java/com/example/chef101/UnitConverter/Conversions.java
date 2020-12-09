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
            return unitConverter(quantity, spinner2Position, UnitConst.gramsInUnit);
        }
    };

    private static final MassUnitConversions tspMassConversion = new MassUnitConversions() {
        @Override
        public double massConversion(double quantity, int spinner2Position) {
              return unitConverter(quantity, spinner2Position, UnitConst.teaspoonsInUnit);
        }
    };

    private static final MassUnitConversions tbspMassConversion = new MassUnitConversions() {
        @Override
        public double massConversion(double quantity, int spinner2Position) {
            return unitConverter(quantity, spinner2Position, UnitConst.tablespoonsInUnit);
        }
    };

    private static final MassUnitConversions ouncesConversion = new MassUnitConversions() {
        @Override
        public double massConversion(double quantity, int spinner2Position) {
            return unitConverter(quantity, spinner2Position, UnitConst.ouncesInUnit);
        }
    };

    private static final MassUnitConversions poundsConversion = new MassUnitConversions() {
        @Override
        public double massConversion(double quantity, int spinner2Position) {
            return unitConverter(quantity, spinner2Position, UnitConst.poundsInUnit);
        }
    };

    private static final MassUnitConversions kilosConversion = new MassUnitConversions() {
        @Override
        public double massConversion(double quantity, int spinner2Position) {
            return unitConverter(quantity, spinner2Position, UnitConst.kilogramsInUnit);
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
            return unitConverter(quantity, spinner2Position, UnitConst.cupsInUnit);
        }
    };

    private static final VolumeUnitConversions tspVolumeConversion = new VolumeUnitConversions() {
        @Override
        public double volumeConversion(double quantity, int spinner2Position) {
            return unitConverter(quantity, spinner2Position, UnitConst.teaspoonsInVolUnit);
        }
    };

    private static final VolumeUnitConversions tbspVolumeConversion = new VolumeUnitConversions() {
        @Override
        public double volumeConversion(double quantity, int spinner2Position) {
            return unitConverter(quantity, spinner2Position, UnitConst.tablespoonsInVolUnit);
        }
    };

    private static final VolumeUnitConversions fluidOuncesConversion = new VolumeUnitConversions() {
        @Override
        public double volumeConversion(double quantity, int spinner2Position) {
            return unitConverter(quantity, spinner2Position, UnitConst.fluidOuncesInUnit);
        }
    };

    private static final VolumeUnitConversions litersConversion = new VolumeUnitConversions() {
        @Override
        public double volumeConversion(double quantity, int spinner2Position) {
            return unitConverter(quantity, spinner2Position, UnitConst.litersInUnit);
        }
    };

    private static final VolumeUnitConversions millilitersConversion = new VolumeUnitConversions() {
        @Override
        public double volumeConversion(double quantity, int spinner2Position) {
            return unitConverter(quantity, spinner2Position, UnitConst.millilitersInUnit);
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

    protected static double unitConverter(double quantity, int spinner2Position, double[] unitsTo) {
        for (int i = 0; i < unitsTo.length; i++) {
            if (spinner2Position == i) {
                return quantity * unitsTo[i];
            }
        }
        return 0;
    }

}
