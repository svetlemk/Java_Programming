package day34_inference.animalTask;

public class Duck extends Animal implements Playable, Flyable,Swimmable{
    public Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);


    }

    @Override
    public void eat() {
        System.out.println("Duck "+ getName() + " is eating the grass.");
    }

    @Override
    public void play() {
        System.out.println("Duck " + getName()+ "is playing with a boy.");
    }

    @Override
    public void fly() {
        System.out.println("Duck is " + getName()+ " is flying over the pond.");
    }

    @Override
    public void swim() {
        System.out.println("Duck is " + getName()+ " swimming in the water");
    }
}
