package com.example.chef101.UnitConverter;

public class UnitConst {
    /**
     * The purpose of this class is to create constants that will store the amount
     * of a unit in another unit. Then we create an array of those constants in the
     * order of the string array in string.xml where the integer 1 is the unit itself
     */

    // Create constants for mass
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


    // TODO: Create constants for volume
}
