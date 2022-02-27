package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalParameterizedTest {
        private final String animalKind;
        private final List<String> kindFood;

    public AnimalParameterizedTest(String animalKind,List<String> kindFood) {
        this.kindFood = kindFood;
        this.animalKind = animalKind;
    }

    @Parameterized.Parameters
        public static Object[][] getFood() {
            return new Object[][] {
                    { "Травоядное", List.of("Трава", "Различные растения")},
                    { "Хищник", List.of("Животные", "Птицы", "Рыба")},
            };
        }

    @Test
    public void testAnimalGetFoodEqualsRightFoodType() throws Exception {
        Animal animal = new Animal();
        assertEquals(this.kindFood,animal.getFood(this.animalKind));
    }
    }
