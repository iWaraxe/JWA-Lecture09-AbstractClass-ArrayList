package com.coherentsolutions.java.webauto.section01.ex02;

import com.coherentsolutions.java.webauto.section01.ex01.Color;

/**
 * Demonstrates advanced concepts of inheritance in Java.
 */
public class AdvancedInheritance {
    public static void main(String[] args) {
        // Demonstrates multi-level inheritance and method overriding
        GoldenRetriever golden = new GoldenRetriever("Max", Color.GOLD, 3, true);
        golden.eat();
        golden.say();
        golden.performTrick();
    }
}
