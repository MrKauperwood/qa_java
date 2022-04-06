package com.example.animal;

import com.example.Animal;
import org.junit.Before;
import org.junit.Test;

import static com.example.Constants.*;
import static org.junit.Assert.assertEquals;

/**
 * Author: Alexey Bondarenko
 * Date: 03.04.2022
 */

public class AnimalExceptionTest {

    private Animal animal;

    @Before
    public void init() {
        animal = new Animal();
    }

    @Test
    public void getFamilyTest() throws Exception {
        assertEquals(EXPECTED_GET_FAMILY_TEXT, animal.getFamily());
    }

    @Test
    public void getFoodExceptionTest() throws Exception {
        try {
            animal.getFood("ТравоХищ");
        } catch (Exception e) {
            assertEquals(e.getMessage(), UNKNOWN_TYPE_OF_ANIMAL);
        }
    }
}