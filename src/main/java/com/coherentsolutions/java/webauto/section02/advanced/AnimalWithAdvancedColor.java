package com.coherentsolutions.java.webauto.section02.advanced;

/**
 * Abstract class Animal demonstrating use of AdvancedColor enum.
 */
public abstract class AnimalWithAdvancedColor {

    public static int counter;

    private String name;
    private AdvancedColor color;
    private int age;

    public AnimalWithAdvancedColor(String name, AdvancedColor color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AdvancedColor getColor() {
        return color;
    }

    public void setColor(AdvancedColor color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Abstract method to be implemented by subclasses.
     */
    public abstract void eat();

    /**
     * Abstract method to be implemented by subclasses.
     */
    public abstract void say();
}
