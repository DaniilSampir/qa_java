package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineTest {
    Feline feline = new Feline();
    private final int kittensCount;

    public FelineTest(int kittensCount) {
        this.kittensCount = kittensCount;
    }

    @Test
    public void testGetKittens() {
        assertEquals(feline.getKittens(),1);
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
    public void testGetKittensWithParameters() {
        assertEquals(kittensCount, feline.getKittens(kittensCount));
    }

    @Test
    public void testGetFamily(){
        assertEquals(feline.getFamily(),"Кошачьи");
    }

    @Test
    public void testGetFood() throws Exception {
        List<String> actualList = List.of("Животные", "Птицы", "Рыба");
        assertEquals(feline.getFood(),actualList);
    }

}