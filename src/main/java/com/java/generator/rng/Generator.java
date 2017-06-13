package com.java.generator.rng;

import java.util.Random;

public class Generator {

    private Random random = new Random();

    public Character getRandomChar(CharSet charSet) {
        int randomChar = random.nextInt(charSet.getHighMark() - charSet.getLowMark()) + charSet.getLowMark();
        return (char) randomChar;
    }


}
