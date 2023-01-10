package day34_inference.animalTask;

public class Shark extends Animal implements Hunting,Swimmable{
    public Shark(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Shark "+ getName()+ " is eating fish.");

    }

    @Override
    public void hunt() {
        System.out.println("Shark " +getName()+ " is hunting in the sea for thr fish");

    }

    @Override
    public void swim() {
        System.out.println("Shark "+ getName()+ " is swimming in the Atlantic ocean.");
    }
}
