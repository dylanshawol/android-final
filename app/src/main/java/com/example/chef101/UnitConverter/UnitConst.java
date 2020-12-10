package com.example.chef101.UnitConverter;

public class UnitConst {
    /**
     * The purpose of this class is to create constants that will store the amount
     * of a unit in another unit. Then we create an array of those constants in the
     * order of the string array in string.xml where the integer 1 is the unit itself
     */

    //    g
    //    teaspoon
    //    tablespoon
    //    oz
    //    lb
    //    kg

    // Constants for mass
    protected final static double G_TO_TSP = 0.2;
    protected final static double G_TO_TBSP = 0.0782;
    protected final static double G_TO_OZ = 0.0352;
    protected final static double G_TO_LB = 0.0022;
    protected final static double G_TO_KG = 0.001;
    protected final static double[] gramsToUnit = {1, G_TO_TSP, G_TO_TBSP, G_TO_OZ, G_TO_LB, G_TO_KG};

    protected final static double TSP_TO_G = 4.93;
    protected final static double TSP_TO_TBSP = 0.333;
    protected final static double TSP_TO_OZ = 0.166;
    protected final static double TSP_TO_LB = 0.010;
    protected final static double TSP_TO_KG = 0.00492;
    protected final static double[] teaspoonsToUnit = {TSP_TO_G, 1, TSP_TO_TBSP, TSP_TO_OZ, TSP_TO_LB, TSP_TO_KG};

    protected final static double TBSP_TO_G = 21.25;
    protected final static double TBSP_TO_TSP = 3;
    protected final static double TBSP_TO_OZ = 0.5;
    protected final static double TBSP_TO_LB = 0.0325;
    protected final static double TBSP_TO_KG = 0.0147;
    protected final static double[] tablespoonsToUnit = {TBSP_TO_G, TBSP_TO_TSP, 1, TBSP_TO_OZ, TBSP_TO_LB, TBSP_TO_KG};

    protected final static double OZ_TO_G = 28.34;
    protected final static double OZ_TO_TSP = 6;
    protected final static double OZ_TO_TBSP = 2;
    protected final static double OZ_TO_LB = 0.0625;
    protected final static double OZ_TO_KG = 0.0283;
    protected final static double[] ouncesToUnit = {OZ_TO_G, OZ_TO_TSP, OZ_TO_TBSP, 1, OZ_TO_LB, OZ_TO_KG};

    protected final static double LB_TO_G = 453.592;
    protected final static double LB_TO_TSP = 96;
    protected final static double LB_TO_TBSP = 30.675;
    protected final static double LB_TO_OZ = 16;
    protected final static double LB_TO_KG = 0.453;
    protected final static double[] poundsToUnit = {LB_TO_G, LB_TO_TSP, LB_TO_TBSP, LB_TO_OZ, 1, LB_TO_KG};

    protected final static double KG_TO_G = 1000;
    protected final static double KG_TO_TSP = 202.884;
    protected final static double KG_TO_TBSP = 67.62;
    protected final static double KG_TO_OZ = 35.274;
    protected final static double KG_TO_LB = 2.204;
    protected final static double[] kilogramsToUnit = {KG_TO_G, KG_TO_TSP, KG_TO_TBSP, KG_TO_OZ, KG_TO_LB, 1};


    //    cup
    //    teaspoon
    //    tablespoon
    //    fl oz
    //    L
    //    ml

    // Constants for volume
    protected final static double CUP_TO_TSP = 48;
    protected final static double CUP_TO_TBSP = 16;
    protected final static double CUP_TO_FL_OZ = 8;
    protected final static double CUP_TO_L = 0.236;
    protected final static double CUP_TO_ML = 236.588;
    protected final static double[] cupsToUnit = {1, CUP_TO_TSP, CUP_TO_TBSP, CUP_TO_FL_OZ, CUP_TO_L, CUP_TO_ML};


    protected final static double TSP_TO_CUP = 0.02083;
    protected final static double TSP_TO_TBSP_VOL = 0.333;
    protected final static double TSP_TO_FL_OZ = 0.166;
    protected final static double TSP_TO_L = 0.00492;
    protected final static double TSP_TO_ML = 4.928;
    protected final static double[] teaspoonsToVolUnit = {TSP_TO_CUP, 1, TSP_TO_TBSP_VOL, TSP_TO_FL_OZ, TSP_TO_L, TSP_TO_ML};

    protected final static double TBSP_TO_CUP = 0.0625;
    protected final static double TBSP_TO_TSP_VOL = 3;
    protected final static double TBSP_TO_FL_OZ = 0.5;
    protected final static double TBSP_TO_L = 0.0147;
    protected final static double TBSP_TO_ML = 14.786;
    protected final static double[] tablespoonsToVolUnit = {TBSP_TO_CUP, TBSP_TO_TSP_VOL, 1, TBSP_TO_FL_OZ, TBSP_TO_L, TBSP_TO_ML};

    protected final static double FL_OZ_TO_CUP = 0.125;
    protected final static double FL_OZ_TO_TSP = 6;
    protected final static double FL_OZ_TO_TBSP = 2;
    protected final static double FL_OZ_TO_L = 0.0295;
    protected final static double FL_OZ_TO_ML = 29.573;
    protected final static double[] fluidOuncesToUnit = {FL_OZ_TO_CUP, FL_OZ_TO_TSP, FL_OZ_TO_TBSP, 1, FL_OZ_TO_L, FL_OZ_TO_ML};

    protected final static double L_TO_CUP = 4.226;
    protected final static double L_TO_TSP = 202.884;
    protected final static double L_TO_TBSP = 67.628;
    protected final static double L_TO_FL_OZ = 33.814;
    protected final static double L_TO_ML = 1000;
    protected final static double[] litersToUnit = {L_TO_CUP, L_TO_TSP, L_TO_TBSP, L_TO_FL_OZ, 1, L_TO_ML};

    protected final static double ML_TO_CUP = 0.00422;
    protected final static double ML_TO_TSP = 0.202;
    protected final static double ML_TO_TBSP = 0.0676;
    protected final static double ML_TO_FL_OZ = 0.0338;
    protected final static double ML_TO_L = 0.001;
    protected final static double[] millilitersToUnit = {ML_TO_CUP, ML_TO_TSP, ML_TO_TBSP, ML_TO_FL_OZ, ML_TO_L, 1};
}
