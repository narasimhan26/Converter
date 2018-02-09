package com.example.akashnarasimhan.converter;

/**
 * Created by Admin on 1/14/2018.
 */

public class TempConverter {
    double val1,val2,base,result;
    public double Convert(String str,double val1){
        this.val1 = val1;
        switch(str){
            case "celsius":
                base = val1;
                break;

            case "farenheit":
                base = (val1 - 32) / 1.8;
                break;

            case "kelvin":
                base = (val1 - 273.15);
                break;
        }
        return base;
    }

    public double Display(String str, double val2){
        this.val2 = val2;
        switch(str){
            case "celsius":
                result = val2;
                break;

            case "farenheit":
                result = (val2 * 1.8) +32;
                break;

            case "kelvin":
                result = val2 + 273.15;
                break;

        }
        return result;
    }
}
