package com.example.lion;

import com.example.Lion;
import org.junit.Test;

import static com.example.Constants.*;
import static org.junit.Assert.*;

/**
 * Author: Alexey Bondarenko
 * Date: 04.04.2022
 */
public class LionTest {

    @Test
    public void lionExceptionTest() throws Exception {
        try {
            new Lion("Между самкой и самцом");
        } catch (Exception e) {
            assertEquals(e.getMessage(), UNKNOWN_GENDER);
        }
    }

    @Test
    public void doesHaveManeTrueTest() throws Exception {
        Lion lion = new Lion("Самец");
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void doesHaveManeFalseTest() throws Exception {
        Lion lion = new Lion("Самка");
        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самка");
        assertEquals(ANIMAL_FOOD.get(1), lion.getFood());
    }
}