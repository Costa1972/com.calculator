package com.calculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanToArabicConverter {
    static int convertRomanToArabic(String input){
        String romanNumber;
        int result = 0;
        romanNumber = input.toUpperCase();
        List<RomanNumbers> romanNumbers = RomanNumbers.getReverseNums();
        int index = 0;

        while(romanNumber.length() > 0 && index < romanNumbers.size()){
            RomanNumbers symbol = romanNumbers.get(index);
            if (romanNumber.startsWith(symbol.name())){
                result += symbol.getNumber();
                romanNumber = romanNumber.substring(symbol.name().length());
            } else {
                index ++;
            }

        }
        return result;
    }

}







