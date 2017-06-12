package com.java.generator.rng;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Random;

public class Generator {

    private Random random = new Random();

    public Character getRandomChar() {
        int randomChar = random.nextInt(25) + 65;
        return (char) randomChar;
    }
}
