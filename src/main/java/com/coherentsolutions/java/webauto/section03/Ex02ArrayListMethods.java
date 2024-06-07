package com.coherentsolutions.java.webauto.section03;

import com.coherentsolutions.java.webauto.section03.supportingclasses.Cat;
import com.coherentsolutions.java.webauto.section03.supportingclasses.Color;

import java.util.ArrayList;

/**
 * Demonstrates various methods of ArrayList in Java.
 */
public class Ex02ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();

        cats.add(new Cat("Whiskers", Color.GRAY, 3, false));
        cats.add(new Cat("Tom", Color.BLACK, 5, true));
        cats.add(new Cat("Garfield", Color.ORANGE, 6, true));

        // Demonstrating indexOf()
        int index = cats.indexOf(new Cat("Tom", Color.BLACK, 5, true));
        System.out.println("Index of Tom: " + index);

        // Demonstrating get()
        Cat catAtIndex = cats.get(1);
        System.out.println("Cat at index 1: " + catAtIndex.getName());

        // Demonstrating contains()
        boolean containsTom = cats.contains(new Cat("Tom", Color.BLACK, 5, true));
        System.out.println("Contains Tom: " + containsTom);

        // Demonstrating add(int index, Cat element)
        cats.add(1, new Cat("Felix", Color.BLACK, 4, false));
        System.out.println("Cat added at index 1: " + cats.get(1).getName());

        // Demonstrating set(int index, Cat element)
        System.out.println("Cat at index 2 after set: " + cats.get(2).getName());
        cats.set(2, new Cat("Simba", Color.ORANGE, 2, true));
        System.out.println("Cat at index 2 after set: " + cats.get(2).getName());


        // Demonstrating clear()
        System.out.println("Size before clear: " + cats.size());
        cats.clear();
        System.out.println("Size after clear: " + cats.size());

        // Demonstrating size()
        System.out.println("Number of cats: " + cats.size());
    }
}
