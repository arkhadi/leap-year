package com.codurance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class YearTest {

    @Test
    void shouldBeALeapYearIfItIsDivisibleByFour() {
        assertThat(Year.isLeapYear(1996)).isEqualTo(true);
    }
}
