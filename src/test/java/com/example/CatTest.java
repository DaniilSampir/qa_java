package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;
    Predator predator;

    @Test
    public void testTrueSound() {
        Cat cat = new Cat(feline);
        assertEquals(cat.getSound(),"Мяу");
    }
}