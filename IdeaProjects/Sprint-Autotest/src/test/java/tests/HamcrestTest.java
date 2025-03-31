package com.example;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class HamcrestTest {

    @Test
    public void shouldCheckValuesUsingHamcrest() {
        String actual = "Selenide";
        MatcherAssert.assertThat(actual, Matchers.startsWith("S"));
        MatcherAssert.assertThat(actual, Matchers.containsString("len"));
    }
}