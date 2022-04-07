package com.example;

import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static com.example.Constants.*;
import static org.junit.Assert.*;

/**
 * Author: Alexey Bondarenko
 * Date: 04.04.2022
 */
@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    public Feline feline;

    @Test
    public void lionExceptionTest() throws Exception {
        try {
            new Lion("Между самкой и самцом", feline);
        } catch (Exception e) {
            assertEquals(e.getMessage(), UNKNOWN_GENDER);
        }
    }

    @Test
    public void doesHaveManeTrueTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void doesHaveManeFalseTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        List<String> data = List.of("test1", "test2");
        Mockito.when(feline.eatMeat()).thenReturn(data);
        assertEquals(data, lion.getFood());
    }
}