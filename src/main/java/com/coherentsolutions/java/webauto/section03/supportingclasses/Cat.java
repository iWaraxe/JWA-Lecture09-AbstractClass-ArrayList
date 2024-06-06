package com.coherentsolutions.java.webauto.section03;

/**
 * Cat class extending Animal and implementing abstract methods.
 */
public class Cat extends Animal {

    private boolean vaccinated;

    public Cat(String name, Color color, int age, boolean vaccinated) {
        super(name, color, age);
        this.vaccinated = vaccinated;
    }

    @Override
    public void eat() {
        System.out.println("I only eat Whiskas.");
    }

    @Override
    public void say() {
        System.out.println("Meow, meow!!!");
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cat cat = (Cat) obj;
        return getName().equals(cat.getName()) && getColor() == cat.getColor() && getAge() == cat.getAge();
    }

    @Override
    public int hashCode() {
        return getName().hashCode() + getColor().hashCode() + Integer.hashCode(getAge());
    }
}
