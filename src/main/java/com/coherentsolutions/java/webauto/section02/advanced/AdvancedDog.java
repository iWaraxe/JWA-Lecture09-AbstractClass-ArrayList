package com.coherentsolutions.java.webauto.section02.advanced;

/**
 * Dog class extending AnimalWithAdvancedColor and implementing abstract methods.
 */
public class AdvancedDog extends AnimalWithAdvancedColor {

    private boolean vaccinated;

    public AdvancedDog(String name, AdvancedColor color, int age, boolean vaccinated) {
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

    public static void main(String[] args) {
        AdvancedDog dog = new AdvancedDog("Max", AdvancedColor.RED, 4, true);
        System.out.println("Dog's name: " + dog.getName());
        System.out.println("Dog's color: " + dog.getColor().getDescription());
        dog.eat();
        dog.say();
    }
}
