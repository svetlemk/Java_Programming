package day34_inference.animalTask;

public class Parrot extends Animal implements Playable, Flyable{


    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Parrot " + getName()+ " is eating bird feed.");

    }

    @Override
    public void play() {
        System.out.println("Parrot " + getName()+ " is playing with his owner.");
    }

    @Override
    public void fly() {
        System.out.println("Parrot "+ getName()+ " is flying in the room.");
    }
}
