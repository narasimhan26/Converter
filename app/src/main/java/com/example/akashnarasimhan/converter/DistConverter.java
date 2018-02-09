package com.example.akashnarasimhan.converter;

/**
 * Created by Admin on 1/14/2018.
 */

public class DistConverter {
    double val1,val2,base,result;
    public double Convert(String str, double val1){
        this.val1 = val1;
        switch(str){
            case "meter":
                base = val1;
                break;

            case "centimeter":
                base = val1 / 100;
                break;

            case "kilometer":
                base = val1 * 1000;
                break;

            case "yard":
                base = val1 * 0.9144;
                break;

            case "mile":
                base = val1 * 1609.344;
                break;

            case "feet":
                base = val1 * 0.3048;
                break;

            case "inch":
                base = val1 * 0.0254;
                break;
        }
        return base;
    }
    public double Display(String str, double val2){
        this.val2 = val2;
        switch(str){
            case "meter":
                result = val2;
                break;

            case "centimeter":
                result = val2 * 100;
                break;

            case "kilometer":
                result = val2 / 1000;
                break;

            case "yard":
                result = val2 /0.9144;
                break;

            case "mile":
                result = val2 / 1609.344;
                break;

            case "feet":
                result = val2 / 0.3048;
                break;

            case "inch":
                result = val2 / 0.0254;
                break;
        }
        return result;
    }
}
