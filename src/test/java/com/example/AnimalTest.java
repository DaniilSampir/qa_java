package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnimalTest {
    @Test
    public void testAnimalGetFamilyEqualsTextTrue(){
        Animal animal = new Animal();
        String compareText = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        boolean actual = compareText.equals(animal.getFamily());
        assertTrue(actual);
    }

    @Test
    public void testAnimalGetFamilyNotEqualsTextFalse(){
        Animal animal = new Animal();
        String compareText = "asdadasd";
        boolean actual = compareText.equals(animal.getFamily());
        assertFalse(actual);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testAnimalGetFoodExpectExceptionMessage() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        Animal animal = new Animal();
        animal.getFood("asdasdas");
    }
}
