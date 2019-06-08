package com.codurance;

public class Year {

    static boolean isLeapYear(int year){
        if (year % 100 == 0 && year % 400 != 0) {
            return false;
        }

        if(year % 400 == 0) {
            return year % 400 == 0;
        }
        return year % 4 == 0;
    }
}
