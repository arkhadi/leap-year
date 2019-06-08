package com.codurance;

public class Year {

    static boolean isLeapYear(int year){
        return isDivisibleBy(year, 100) ? isDivisibleBy(year, 400) : isDivisibleBy(year, 4);
    }

    private static boolean isDivisibleBy(int year, int value) {
        return  year % value == 0;
    }
}
