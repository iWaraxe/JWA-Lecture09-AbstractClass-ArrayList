package com.coherentsolutions.java.webauto.section03.advanced;

import com.coherentsolutions.java.webauto.section03.supportingclasses.Cat;
import com.coherentsolutions.java.webauto.section03.supportingclasses.Color;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Demonstrates advanced usage of ArrayList in Java.
 */
public class Ex04AdvancedArrayListUsage {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();

        cats.add(new Cat("Whiskers", Color.GRAY, 3, false));
        cats.add(new Cat("Tom", Color.BLACK, 5, true));
        cats.add(new Cat("Garfield", Color.ORANGE, 6, true));

        // Sorting ArrayList
        Collections.sort(cats, (cat1, cat2) -> cat1.getName().compareTo(cat2.getName()));
        System.out.println("Sorted cats by name:");
        for (Cat cat : cats) {
            System.out.println(cat.getName());
        }

        // Shuffling ArrayList
        Collections.shuffle(cats);
        System.out.println("Shuffled cats:");
        for (Cat cat : cats) {
            System.out.println(cat.getName());
        }

        // Copying ArrayList
        ArrayList<Cat> copiedCats = new ArrayList<>(cats);
        System.out.println("Copied cats:");
        for (Cat cat : copiedCats) {
            System.out.println(cat.getName());
        }

        // Checking if ArrayList is empty
        boolean isEmpty = cats.isEmpty();
        System.out.println("Is cats list empty: " + isEmpty);
    }
}
