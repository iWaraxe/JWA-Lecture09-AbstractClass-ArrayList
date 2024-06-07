package com.coherentsolutions.java.webauto.section02;

import java.util.ArrayList;

/**
 * Shelter class containing a list of animals and methods to manipulate it.
 */
public class Shelter {

    private ArrayList<Animal> animals = new ArrayList<>();

    public Shelter() {}

    public Shelter(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public ArrayList<Animal> getAnimalsByColor(Color color) {
        ArrayList<Animal> resultList = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.getColor().equals(color)) {
                resultList.add(animal);
            }
        }
        return resultList;
    }

    public void addToShelter(Animal animal) {
        animals.add(animal);
    }

    public static void main(String[] args) {
        Shelter shelter = new Shelter();
        shelter.addToShelter(new Dog("Buddy", Color.RED, 2, true));
        shelter.addToShelter(new Cat("Kitty", Color.WHITE, 4, false));

        for (Animal animal : shelter.getAnimalsByColor(Color.RED)) {
            System.out.println(animal.getName() + " is red.");
        }
    }
}
