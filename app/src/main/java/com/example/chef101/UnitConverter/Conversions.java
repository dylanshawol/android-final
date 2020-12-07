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
        double conversion(double quantity, int spinner2Position);
    }

    private static final MassUnitConversions gramsConversion = new MassUnitConversions() {
        @Override
        public double conversion(double quantity, int spinner2Position) {
            return massUnitConversion(quantity, positionToString(spinner2Position), UnitConst.gramsInUnit);
        }
    };

    private static final MassUnitConversions tspConversion = new MassUnitConversions() {
        @Override
        public double conversion(double quantity, int spinner2Position) {
              return massUnitConversion(quantity, positionToString(spinner2Position), UnitConst.teaspoonsInUnit);
        }
    };

    private static final MassUnitConversions tbspConversion = new MassUnitConversions() {
        @Override
        public double conversion(double quantity, int spinner2Position) {
            return massUnitConversion(quantity, positionToString(spinner2Position), UnitConst.tablespoonsInUnit);
        }
    };

    private static final MassUnitConversions ouncesConversion = new MassUnitConversions() {
        @Override
        public double conversion(double quantity, int spinner2Position) {
            return massUnitConversion(quantity, positionToString(spinner2Position), UnitConst.ouncesInUnit);
        }
    };

    private static final MassUnitConversions poundsConversion = new MassUnitConversions() {
        @Override
        public double conversion(double quantity, int spinner2Position) {
            return massUnitConversion(quantity, positionToString(spinner2Position), UnitConst.poundsInUnit);
        }
    };

    private static final MassUnitConversions kilosConversion = new MassUnitConversions() {
        @Override
        public double conversion(double quantity, int spinner2Position) {
            return massUnitConversion(quantity, positionToString(spinner2Position), UnitConst.kilogramsInUnit);
        }
    };

    private static final List<MassUnitConversions> massConversionList = new ArrayList<>();

    protected static List<MassUnitConversions> getMassConversionList() {
        massConversionList.add(gramsConversion);
        massConversionList.add(tspConversion);
        massConversionList.add(tbspConversion);
        massConversionList.add(ouncesConversion);
        massConversionList.add(poundsConversion);
        massConversionList.add(kilosConversion);
        return massConversionList;
    }

    protected static double massUnitConversion(double quantity, String spinner2PositionToString, double[] unitsTo) {
        String[] units = {"g", "tsp", "tbsp", "oz", "lb", "kg"};
        for (int i = 0; i < units.length; i++) {
            if (spinner2PositionToString.equals(units[i])) {
                return quantity * unitsTo[i];
            }
        }
        return 0;
    }

    protected static String positionToString(int spinnerPosition) {
        String unitString = "";
        switch (spinnerPosition) {
            case 0: unitString = "g";
                break;
            case 1: unitString = "tsp";
                break;
            case 2: unitString = "tbsp";
                break;
            case 3: unitString = "oz";
                break;
            case 4: unitString = "lb";
                break;
            case 5: unitString = "kg";
                break;
        }
        return unitString;
    }
}
