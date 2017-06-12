package com.java.rng;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Random;

class Generator {

    private Random random = new Random();

    Character getRandomCharFromCaps() {
        int randomChar = random.nextInt(25) + 65;
        return (char) randomChar;
    }

    Character getRandomFromLetters() {
        throw new NotImplementedException();
    }

    Character getRandomFromNumbers() {
        throw new NotImplementedException();
    }

    Character getRandomFromSpecialCharacters() {
        throw new NotImplementedException();
    }
}
