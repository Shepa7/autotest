package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnitTest {

    @Test
    public void shouldCheckEqualValues() {
        assertEquals(4, 2 + 2);
    }
}