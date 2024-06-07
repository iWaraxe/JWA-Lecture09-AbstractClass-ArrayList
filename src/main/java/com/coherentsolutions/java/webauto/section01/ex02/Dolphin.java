package com.coherentsolutions.java.webauto.section01.ex02;

import com.coherentsolutions.java.webauto.section01.ex01.Animal;
import com.coherentsolutions.java.webauto.section01.ex01.Color;

/**
 * Dolphin class implementing Swimmable interface and extending Animal.
 */
public class Dolphin extends Animal implements Swimmable {

    public Dolphin(String name, int age) {
        super(name, Color.GRAY, age);
    }

    @Override
    public void eat() {
        System.out.println("I eat fish.");
    }

    @Override
    public void say() {
        System.out.println("Click-click!");
    }

    @Override
    public void swim() {
        System.out.println("I swim gracefully.");
    }
}
