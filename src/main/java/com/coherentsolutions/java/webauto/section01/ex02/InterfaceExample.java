package com.coherentsolutions.java.webauto.section01.ex02;

/**
 * Demonstrates how interfaces work alongside abstract classes.
 */
public class InterfaceExample {
    public static void main(String[] args) {
        Dolphin dolphin = new Dolphin("Flipper", 5);
        dolphin.eat();
        dolphin.say();
        dolphin.swim();
    }
}
