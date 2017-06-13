package com.java.generator.rng;

/**
 * Created by gcorghencea on 13-Jun-17.
 */
public enum CharSet {
    SPECIAL_CHARACTERS_LOW(32, 47),
    SPECIAL_CHARACTERS_HIGH(58, 64),
    NUMBERS(48, 57),
    CAPS(65, 90),
    LETTERS(97, 122);

    private int lowMark;
    private int highMark;

    CharSet(int lowMark, int highMark) {
        this.lowMark = lowMark;
        this.highMark = highMark;
    }

    public int getLowMark() {
        return lowMark;
    }

    public int getHighMark() {
        return highMark;
    }

}
