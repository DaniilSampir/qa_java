package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LionTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testHasManeExpectExceptionMessage() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Используйте допустимые значения пола животного - самец или самка");
        Lion lion = new Lion("asdasdasd");
    }

}
