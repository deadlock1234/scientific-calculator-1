package com.example;
import com.example.Main;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest{
    Main main = new Main();
    double delta = 0.001;

    @Test
    public void testSquareroot() {
        assertEquals(2.0, main.squareRoot(4.0), delta);
    }

    @Test
    public void testFactorial() {
        assertEquals(24, main.factorial(4));
    }

    @Test
    public void testNaturalLogarithm() {
        assertEquals(1.386, main.naturalLog(4.0), delta);
    }

    @Test
    public void testPower() {
        assertEquals(16.0, main.exponent(4.0, 2.0), delta);
    }
}