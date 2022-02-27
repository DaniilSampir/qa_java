package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void testFelineGetKittensEqualsOneKitten() {
        assertEquals(feline.getKittens(),1);
    }

    @Test
    public void testFelineGetFamilyEqualsKittensFamily(){
        assertEquals(feline.getFamily(),"Кошачьи");
    }

    @Test
    public void testFelineGetFoodEqualsFoodType() throws Exception {
        List<String> actualList = List.of("Животные", "Птицы", "Рыба");
        assertEquals(feline.getFood(),actualList);
    }

    @Test
    public void testFelineEatMeatEqualsFoodType() throws Exception {
        List<String> actualList = List.of("Животные", "Птицы", "Рыба");
        assertEquals(feline.eatMeat(),actualList);
    }
}