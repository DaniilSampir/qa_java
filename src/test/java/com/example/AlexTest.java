package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class AlexTest {
    Alex alex = new Alex();

    public AlexTest() throws Exception {
    }

    @Test
    public void testGetAlexSex_ShuldReturnTrue(){
    assertEquals(alex.hasMane,true);
    }

    @Test
    public void testGetPlaceOfLiving_ShouldReturnLivingPlace() {
        String actual = "Нью-Йоркский зоопарк";
        assertEquals(alex.getPlaceOfLiving(),actual);
    }

    @Test
    public void testGetFriends_ShouldReturnAlexFriends(){
        List<String> actual = List.of("Марти, Глория, Мелман");
        assertEquals(alex.getFriends(),actual);
    }
    @Test
    public void testGetKittens_ShouldReturnZero(){
        int actual = 0;
        assertEquals(alex.getKittens(),actual);
    }
}
