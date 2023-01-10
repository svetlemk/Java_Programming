package day34_inference.animalTask;

public class Eagle extends Animal implements Flyable, Hunting{
    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Eagle " + getName()+" is eating rabbits");

    }

    @Override
    public void fly() {
        System.out.println("Eagle " + getName()+ " is flying above the moutains.");
    }

    @Override
    public void hunt() {
        System.out.println("Eagle " + getName()+ " is hunting the rabbit.");
    }
}
