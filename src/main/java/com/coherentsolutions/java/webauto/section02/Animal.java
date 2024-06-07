package com.coherentsolutions.java.webauto.section02;

/**
 * Abstract class Animal demonstrating abstract methods and fields.
 */
public abstract class Animal {

    public static int counter;

    private String name;
    private Color color;
    private int age;

    public Animal(String name, Color color, int age) {
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
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
