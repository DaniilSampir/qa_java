package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class AlexTest {
    Alex alex = new Alex();

    public AlexTest() throws Exception {
    }

    @Test
    public void testGetAlexSexShuldReturnTrue(){
    assertEquals(alex.hasMane,true);
    }

    @Test
    public void testGetPlaceOfLivingShouldReturnLivingPlace() {
        String actual = "Нью-Йоркский зоопарк";
        assertEquals(alex.getPlaceOfLiving(),actual);
    }

    @Test
    public void testGetFriendsShouldReturnAlexFriends(){
        List<String> actual = List.of("Марти, Глория, Мелман");
        assertEquals(alex.getFriends(),actual);
    }
    @Test
    public void testGetKittensShouldReturnZero(){
        int actual = 0;
        assertEquals(alex.getKittens(),actual);
    }
}
