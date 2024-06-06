package com.coherentsolutions.java.webauto.section01;

/**
 * Dog class extending Animal and implementing abstract methods.
 */
public class Dog extends Animal {

    private boolean vaccinated;

    public Dog(String name, Color color, int age, boolean vaccinated) {
        super(name, color, age);
        this.vaccinated = vaccinated;
    }

    @Override
    public void eat() {
        System.out.println("I only eat bones");
    }

    @Override
    public void say() {
        System.out.println("Woof, woof!!");
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }
}
