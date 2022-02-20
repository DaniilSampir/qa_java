package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class AlexTest {
    Alex alex = new Alex();

    public AlexTest() throws Exception {
    }

    @Test
    public void testGetPlaceOfLiving_ShouldReturnLivingPlace() {
        String actual = "Нью-Йоркский зоопарк";
        assertEquals(actual,alex.getPlaceOfLiving());
    }

    @Test
    public void testGetFriends_ShouldReturnAlexFriends(){
        List<String> actual = List.of("Марти, Глория, Мелман");
        assertEquals(actual,alex.getFriends());
    }
    @Test
    public void testGetKittens_ShouldReturnZero(){
        int actual = 0;
        assertEquals(actual,alex.getKittens());
    }
}
