package com.skrser.surefire;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void multiply() {
        Calculator calc = new Calculator();

        int result = calc.multiply(2, 3);

        assertEquals(6, result);
    }
}