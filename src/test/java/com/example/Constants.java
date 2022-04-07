package com.example;

import java.util.List;

/**
 * Author: Alexey Bondarenko
 * Date: 04.04.2022
 */
public class Constants {

    public static final String EXPECTED_GET_FAMILY_TEXT = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
    public static final List<String> FAMILY_TYPES = List.of("Заячьи", "Беличьи", "Мышиные", "Кошачьи", "Псовые", "Медвежьи", "Куньи");
    public static final List<String> GENDER = List.of("Самец", "Самка");
    public static final String UNKNOWN_GENDER = "Используйте допустимые значения пола животного - самец или самка";


    public static final List<String> TYPES_OF_ANIMALS = List.of("Травоядное", "Хищник");
    public static final List<List<String>> ANIMAL_FOOD = List.of(
                List.of("Трава", "Различные растения"),
                List.of("Животные", "Птицы", "Рыба"));

    public static final String UNKNOWN_TYPE_OF_ANIMAL = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
    public static final String CAT_SOUND = "Мяу";
}
