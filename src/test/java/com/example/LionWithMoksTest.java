package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class LionWithMoksTest {

    @Mock
    IFeline feline;

    @Test
    public void getKittensWithMoksTest() throws Exception {
        Lion lion = new Lion(feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(lion.getKittens(),1);
    }

    @Test
    public void getFoodWithMoksTest() throws Exception{
        Lion lion = new Lion(feline);
        Mockito.when(feline.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualList = lion.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"),actualList);
    }
}
