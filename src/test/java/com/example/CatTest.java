package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static com.example.Constants.CAT_SOUND;
import static org.junit.Assert.*;

/**
 * Author: Alexey Bondarenko
 * Date: 04.04.2022
 */
@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    public Cat cat;

    @Mock
    public Feline feline;

    @Before
    public void init() {
        cat = new Cat(feline);
    }

    @Test
    public void getSoundTest() {
        assertEquals(CAT_SOUND, cat.getSound());
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> data = List.of("test1", "test2");
        Mockito.when(feline.eatMeat()).thenReturn(data);
        assertEquals(data, cat.getFood());
    }
}