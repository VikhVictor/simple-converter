package com.eh.simpleconverter;

/**
 * Created by IT SCHOOL on 11.11.2017.
 */
public class Converter {

    public static final double FT = 0.3048;
    public static final double MET = 1.0;
    public static final double YARD = 0.9;

    public static final int TYPE_FT = 0;
    public static final int TYPE_MET = 1;
    public static final int TYPE_YARD = 2;

    public static double convert(int typeInput, int typeOutput, double value) {
        double standard = getStandardValue(typeInput, value);
        double result = convertTo(typeOutput, standard);
        return result;
    }

    private static double convertTo(int typeOutput, double standard) {
        switch (typeOutput) {
            case TYPE_FT:
                return standard * FT;
            case TYPE_YARD:
                return standard * YARD;
            case TYPE_MET:
                return standard * MET;
        }
        return 0;
    }

    private static double getStandardValue(int typeInput, double value) {
        switch (typeInput) {
            case TYPE_FT:
                return value * FT;
            case TYPE_MET:
                return value * MET;
            case TYPE_YARD:
                return value * YARD;
        }
        return 0;
    }

}
