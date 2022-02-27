package com.example;

import org.junit.Test;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

public class FelineParameterizedTest {
    Feline feline = new Feline();
    private final int kittensCount;

    public FelineParameterizedTest(int kittensCount) {
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensCount() {
        return new Object[][] {
                { 1},
                { 2},
                { 3},
                { 4},
                { 5},
        };
    }

    @Test
    public void testFelineGetKittensEqualsKittensCount() {
        assertEquals(kittensCount, feline.getKittens(kittensCount));
    }
}
