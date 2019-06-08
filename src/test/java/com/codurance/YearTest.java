package com.codurance;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class YearTest {

    @ParameterizedTest
    @ValueSource(ints = {1996, 2000, 2008})
    void shouldBeALeapYearIfItIsDivisibleByFour(int input) {
        assertThat(Year.isLeapYear(input)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {1997, 2002, 2011})
    void shouldNotBeLeapYearIfNotDivisibleByFour(int input) {
        assertThat(Year.isLeapYear(input)).isFalse();
    }

    @ParameterizedTest
    @ValueSource(ints = {1600, 2000, 2400})
    void shouldBeLeapYearIfItIsDivisibleBy400(int input) {
        assertThat(Year.isLeapYear(input)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {1300, 1500, 2200})
    void shouldNotBeALeapYearIfIsDivisibleBy100ButNotBy400(int input) {
        assertThat(Year.isLeapYear(input)).isFalse();
    }
}
