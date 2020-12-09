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
    protected final static double G_IN_TSP = 0.2;
    protected final static double G_IN_TBSP = 0.0782;
    protected final static double G_IN_OZ = 0.0352;
    protected final static double G_IN_LB = 0.0022;
    protected final static double G_IN_KG = 0.001;
    protected final static double[] gramsInUnit = {1, G_IN_TSP, G_IN_TBSP, G_IN_OZ, G_IN_LB, G_IN_KG};

    protected final static double TSP_IN_G = 4.93;
    protected final static double TSP_IN_TBSP = 0.333;
    protected final static double TSP_IN_OZ = 0.166;
    protected final static double TSP_IN_LB = 0.010;
    protected final static double TSP_IN_KG = 0.00492;
    protected final static double[] teaspoonsInUnit = {TSP_IN_G, 1, TSP_IN_TBSP, TSP_IN_OZ, TSP_IN_LB, TSP_IN_KG};

    protected final static double TBSP_IN_G = 21.25;
    protected final static double TBSP_IN_TSP = 3;
    protected final static double TBSP_IN_OZ = 0.5;
    protected final static double TBSP_IN_LB = 0.0325;
    protected final static double TBSP_IN_KG = 0.0147;
    protected final static double[] tablespoonsInUnit = {TBSP_IN_G, TBSP_IN_TSP, 1, TBSP_IN_OZ, TBSP_IN_LB, TBSP_IN_KG};

    protected final static double OZ_IN_G = 28.34;
    protected final static double OZ_IN_TSP = 6;
    protected final static double OZ_IN_TBSP = 2;
    protected final static double OZ_IN_LB = 0.0625;
    protected final static double OZ_IN_KG = 0.0283;
    protected final static double[] ouncesInUnit = {OZ_IN_G, OZ_IN_TSP, OZ_IN_TBSP, 1, OZ_IN_LB, OZ_IN_KG};

    protected final static double LB_IN_G = 453.592;
    protected final static double LB_IN_TSP = 96;
    protected final static double LB_IN_TBSP = 30.675;
    protected final static double LB_IN_OZ = 16;
    protected final static double LB_IN_KG = 0.453;
    protected final static double[] poundsInUnit = {LB_IN_G, LB_IN_TSP, LB_IN_TBSP, LB_IN_OZ, 1, LB_IN_KG};

    protected final static double KG_IN_G = 1000;
    protected final static double KG_IN_TSP = 202.884;
    protected final static double KG_IN_TBSP = 67.62;
    protected final static double KG_IN_OZ = 35.274;
    protected final static double KG_IN_LB = 2.204;
    protected final static double[] kilogramsInUnit = {KG_IN_G, KG_IN_TSP, KG_IN_TBSP, KG_IN_OZ, KG_IN_LB, 1};


    //    cup
    //    teaspoon
    //    tablespoon
    //    fl oz
    //    L
    //    ml

    // Constants for volume
    protected final static double CUP_IN_TSP = 48;
    protected final static double CUP_IN_TBSP = 16;
    protected final static double CUP_IN_FL_OZ = 8;
    protected final static double CUP_IN_L = 0.236;
    protected final static double CUP_IN_ML = 236.588;
    protected final static double[] cupsInUnit = {1, CUP_IN_TSP, CUP_IN_TBSP, CUP_IN_FL_OZ, CUP_IN_L, CUP_IN_ML};


    protected final static double TSP_IN_CUP = 0.02083;
    protected final static double TSP_IN_TBSP_VOL = 0.333;
    protected final static double TSP_IN_FL_OZ = 0.166;
    protected final static double TSP_IN_L = 0.00492;
    protected final static double TSP_IN_ML = 4.928;
    protected final static double[] teaspoonsInVolUnit = {TSP_IN_CUP, 1, TSP_IN_TBSP_VOL, TSP_IN_FL_OZ, TSP_IN_L, TSP_IN_ML};

    protected final static double TBSP_IN_CUP = 0.0625;
    protected final static double TBSP_IN_TSP_VOL = 3;
    protected final static double TBSP_IN_FL_OZ = 0.5;
    protected final static double TBSP_IN_L = 0.0147;
    protected final static double TBSP_IN_ML = 14.786;
    protected final static double[] tablespoonsInVolUnit = {TBSP_IN_CUP, TBSP_IN_TSP_VOL, 1, TBSP_IN_FL_OZ, TBSP_IN_L, TBSP_IN_ML};

    protected final static double FL_OZ_IN_CUP = 0.125;
    protected final static double FL_OZ_IN_TSP = 6;
    protected final static double FL_OZ_IN_TBSP = 2;
    protected final static double FL_OZ_IN_L = 0.0295;
    protected final static double FL_OZ_IN_ML = 29.573;
    protected final static double[] fluidOuncesInUnit = {FL_OZ_IN_CUP, FL_OZ_IN_TSP, FL_OZ_IN_TBSP, 1, FL_OZ_IN_L, FL_OZ_IN_ML};

    protected final static double L_IN_CUP = 0.236;
    protected final static double L_IN_TSP = 202.884;
    protected final static double L_IN_TBSP = 67.628;
    protected final static double L_IN_FL_OZ = 33.814;
    protected final static double L_IN_ML = 1000;
    protected final static double[] litersInUnit = {L_IN_CUP, L_IN_TSP, L_IN_TBSP, L_IN_FL_OZ, 1, L_IN_ML};

    protected final static double ML_IN_CUP = 0.00422;
    protected final static double ML_IN_TSP = 0.202;
    protected final static double ML_IN_TBSP = 0.0676;
    protected final static double ML_IN_FL_OZ = 0.0338;
    protected final static double ML_IN_L = 0.001;
    protected final static double[] millilitersInUnit = {ML_IN_CUP, ML_IN_TSP, ML_IN_TBSP, ML_IN_FL_OZ, ML_IN_L, 1};
}
