package com.example;

import org.junit.Before;
import org.junit.Test;

import static com.example.Constants.*;
import static org.junit.Assert.*;

/**
 * Author: Alexey Bondarenko
 * Date: 04.04.2022
 */
public class FelineTest {

    private Feline feline;

    @Before
    public void init() {
        feline = new Feline();
    }

    @Test
    public void eatMeatTest() throws Exception {
        assertEquals(ANIMAL_FOOD.get(1), feline.eatMeat());
    }

    @Test
    public void getFamilyTest() {
        assertEquals(FAMILY_TYPES.get(3), feline.getFamily());
    }

    @Test
    public void getKittensTest() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensTest() {
        assertEquals(2, feline.getKittens(2));
    }
}