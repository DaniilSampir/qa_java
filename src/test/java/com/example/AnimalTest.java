package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AnimalTest {
    private final String animalKind;
    private final List<String> kindFood;

    public AnimalTest(String animalKind, List<String> kindFood) {
        this.animalKind = animalKind;
        this.kindFood = kindFood;
    }

    @Parameterized.Parameters
    public static Object[][] getFood() {
        return new Object[][] {
                { "Травоядное", List.of("Трава", "Различные растения")},
                { "Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }
    @Test
    public void testAnimalGetFamily_EqualsTextTrue(){
        Animal animal = new Animal();
        String compareText = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        boolean actual = compareText.equals(animal.getFamily());
        assertTrue(actual);
    }

    @Test
    public void testAnimalGetFamily_NotEqualsTextFalse(){
        Animal animal = new Animal();
        String compareText = "asdadasd";
        boolean actual = compareText.equals(animal.getFamily());
        assertFalse(actual);
    }

    @Test
    public void testAnimalGetFood_EqualsRightFoodType() throws Exception {
        Animal animal = new Animal();
        assertEquals(this.kindFood,animal.getFood(this.animalKind));
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testAnimalGetFood_ExpectExceptionMessage() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        Animal animal = new Animal();
        animal.getFood("asdasdas");
    }
}
