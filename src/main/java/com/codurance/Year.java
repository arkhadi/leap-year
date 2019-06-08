package com.codurance;

public class Year {

    static boolean isLeapYear(int year){
        if(year % 400 == 0) {
            return true;
        }
        return year % 4 == 0;
    }
}
