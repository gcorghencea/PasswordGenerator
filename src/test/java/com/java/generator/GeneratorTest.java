package com.java.generator;


import com.java.generator.rng.CharSet;
import com.java.generator.rng.Generator;
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
        for (int i = 0; i <= 1000; i++) {
            characters.add((int) generator.getRandomChar(CharSet.CAPS));
        }
        assertThat(characters, everyItem(greaterThanOrEqualTo(65)));
        assertThat(characters, everyItem(lessThanOrEqualTo(90)));
    }
}
