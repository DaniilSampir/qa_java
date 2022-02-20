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
    public void testLionGetKittens_EqualsOneLion() throws Exception {
        Lion lion = new Lion(feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(lion.getKittens(),1);
    }

    @Test
    public void testLionGetFood_EqualsRightFoodType() throws Exception{
        Lion lion = new Lion(feline);
        Mockito.when(feline.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedList = lion.getFood();
        assertEquals(expectedList,List.of("Животные", "Птицы", "Рыба"));
    }
}
