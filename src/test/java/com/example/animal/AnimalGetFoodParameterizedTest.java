package com.example.animal;

import com.example.Animal;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static com.example.Constants.*;
import static org.junit.Assert.assertEquals;

/**
 * Author: Alexey Bondarenko
 * Date: 03.04.2022
 */
@RunWith(Parameterized.class)
public class AnimalGetFoodParameterizedTest {

    private Animal animal;
    private final String checkedText;
    private final List<String> expected;

    public AnimalGetFoodParameterizedTest(String checkedText, List<String> expected) {
        this.checkedText = checkedText;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getTextData() {
        return new Object[][] {
                {TYPES_OF_ANIMALS.get(0), ANIMAL_FOOD.get(0)},
                {TYPES_OF_ANIMALS.get(1), ANIMAL_FOOD.get(1)},
        };
    }

    @Before
    public void init() {
        animal = new Animal();
    }

    @Test
    public void getFood() throws Exception {
        List<String> actual = animal.getFood(checkedText);
        assertEquals(expected, actual);
    }
}