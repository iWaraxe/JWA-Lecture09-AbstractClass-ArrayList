package com.coherentsolutions.java.webauto.section01.ex02;

import com.coherentsolutions.java.webauto.section01.ex01.Color;
import com.coherentsolutions.java.webauto.section01.ex01.Dog;

/**
 * GoldenRetriever class demonstrating multi-level inheritance.
 */
public class GoldenRetriever extends Dog {

    public GoldenRetriever(String name, Color color, int age, boolean vaccinated) {
        super(name, color, age, vaccinated);
    }

    @Override
    public void say() {
        System.out.println("Woof! I'm a Golden Retriever!");
    }

    public void performTrick() {
        System.out.println("I can fetch a ball!");
    }
}
