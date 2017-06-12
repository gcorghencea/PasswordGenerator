package com.java.generator.app;

import com.java.generator.rng.Generator;

public class App {

    public static void main(String[] args) {
        Generator generator = new Generator();
        System.out.println(generator.getRandomChar());
    }
}
