package com.coherentsolutions.java.webauto.section01;

/**
 * Class to demonstrate inheritance in Java.
 */
public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex", Color.BLACK, 5, true);
        dog.eat();
        dog.say();

        Cat cat = new Cat("Whiskers", Color.GRAY, 3, false);
        cat.eat();
        cat.say();
    }
}
