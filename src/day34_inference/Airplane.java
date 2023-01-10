package day34_inference;

import day34_inference.animalTask.Flyable;

public class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Airplane is flying");
    }
}
