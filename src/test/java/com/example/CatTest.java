package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void testGetSoundEqualsSoundMeow() {
        Cat cat = new Cat(feline);
        assertEquals(cat.getSound(),"Мяу");
    }

    @Test
    public void testGetFoodEqualsRightFoodType() throws Exception {
        Cat cat = new Cat(feline);
        List<String> actualList = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(cat.getFood(),actualList);
    }
}