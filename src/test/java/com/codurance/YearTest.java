package com.codurance;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class YearTest {

    @ParameterizedTest
    @ValueSource(ints = {1996, 2000 ,2008})
    void shouldBeALeapYearIfItIsDivisibleByFour(int input) {
        assertThat(Year.isLeapYear(input)).isEqualTo(true);
    }

    @ParameterizedTest
    @ValueSource(ints = {1997, 2002 ,2011})
    void shouldNotBeLeapYearIfNotDivisibleByFour(int input) {
        assertThat(Year.isLeapYear(input)).isEqualTo(false);
    }
}
