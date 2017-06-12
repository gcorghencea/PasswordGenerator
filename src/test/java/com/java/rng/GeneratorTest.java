package com.java.rng;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Every.everyItem;
import static org.hamcrest.number.OrderingComparison.greaterThanOrEqualTo;
import static org.hamcrest.number.OrderingComparison.lessThanOrEqualTo;
import static org.junit.Assert.assertThat;

public class GeneratorTest {

    @Test
    public void capsGeneratorTest() {
        Generator generator = new Generator();
        List<Integer> characters = new ArrayList<Integer>();
        for (int i = 0; i <= 100; i++) {
            characters.add((int) generator.getRandomCharFromCaps());
        }
        System.out.println(characters);
        assertThat(characters, everyItem(greaterThanOrEqualTo(65)));
        assertThat(characters, everyItem(lessThanOrEqualTo(90)));
    }

    @Test
    public void lettersGeneratorTest() {
        Generator generator = new Generator();
        List<Integer> characters = new ArrayList<Integer>();
        for (int i = 0; i <= 100; i++) {
            characters.add((int) generator.getRandomFromLetters());
        }
        System.out.println(characters);
        assertThat(characters, everyItem(greaterThanOrEqualTo(97)));
        assertThat(characters, everyItem(lessThanOrEqualTo(122)));
    }

    @Test
    public void numberGeneratorTest() {
        Generator generator = new Generator();
        List<Integer> characters = new ArrayList<Integer>();
        for (int i = 0; i <= 100; i++) {
            characters.add((int) generator.getRandomFromNumbers());
        }
        System.out.println(characters);
        assertThat(characters, everyItem(greaterThanOrEqualTo(48)));
        assertThat(characters, everyItem(lessThanOrEqualTo(57)));
    }
}
