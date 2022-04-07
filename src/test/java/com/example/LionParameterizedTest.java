package com.example;

import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static com.example.Constants.*;
import static org.junit.Assert.*;

/**
 * Author: Alexey Bondarenko
 * Date: 04.04.2022
 */
@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final String checkedText;
    private final Boolean expected;

    public LionParameterizedTest(String checkedText, Boolean expected) {
        this.checkedText = checkedText;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getTextData() {
        return new Object[][] {
                {GENDER.get(0), true},
                {GENDER.get(1), false},
        };
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(checkedText, feline);
        assertEquals(expected, lion.hasMane);
    }

}