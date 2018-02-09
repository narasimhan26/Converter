package com.example.akashnarasimhan.converter;

import android.provider.Settings;

/**
 * Created by Akash narasimhan on 29-12-2017.
 */

public class Converter {
    double val1,val2,base,result;
    public double Convert(String str, double val1) {
        this.val1 = val1;
        switch(str){
            case "kilogram":
                base = val1 * 1000;
                break;

            case "gram":
                base = val1 * 1;
                break;

            case "pound":
                base = val1 * 453.5924;
                break;

            case "ton":
                base = val1 * 1000000;
                break;

            case "litre":
                base = val1 * 1000;
                break;

            case "quintal":
                base = val1 * 100000;
                break;

        }
        return base;
    }
    public double Display(String str,double val2){
        this.val2 = val2;
        switch (str){
            case "ton":
                result = val2 / 1000000 ;
                break;

            case "kilogram":
                result = val2 / 1000;
                break;

            case "pound":
                result = val2 / 453.5924;
                break;

            case "gram":
                result = val2 / 1;
                break;

            case "litre":
                result = val2 / 1000;
                break;

            case "quintal":
                result = val2 / 100000;
        }
        return result;
    }

}
