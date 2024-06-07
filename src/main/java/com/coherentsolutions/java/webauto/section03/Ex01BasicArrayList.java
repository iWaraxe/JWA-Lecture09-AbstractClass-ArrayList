package com.coherentsolutions.java.webauto.section03;

import com.coherentsolutions.java.webauto.section03.supportingclasses.Cat;
import com.coherentsolutions.java.webauto.section03.supportingclasses.Color;

import java.util.ArrayList;

/**
 * Demonstrates basic usage of ArrayList in Java.
 */
public class Ex01BasicArrayList {
    public static void main(String[] args) {
        // Create an ArrayList to store Cat objects
        ArrayList<Cat> cats = new ArrayList<>();

        // Add Cat objects to the ArrayList
        cats.add(new Cat("Tom", Color.BLACK, 5, true));
        cats.add(new Cat("Whiskers", Color.GRAY, 3, false));
        cats.add(new Cat("Garfield", Color.ORANGE, 6, true));

        // Retrieve and print Cat objects from the ArrayList
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " is " + cat.getColor());
        }
    }
}
