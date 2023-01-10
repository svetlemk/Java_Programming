package day35_polymorphism;

import day34_inference.animalTask.*;
import day35_polymorphism.transport_task.*;

public class PolymorphismPractice {
    public static void main(String[] args) {

       Animal tiger = new Tiger("Sher Khan", "Bnegal",'M', 3,"Big","Orange");

        tiger.eat();
        //tiger.hunt();
        tiger.sleep();
        tiger.drink();

       Animal animal1= new Eagle("John", "American eagle", 'F', 3, "Small","White");

       // animal1.fly();

        Flyable obj1 = new Eagle("John", "American eagle", 'F', 3, "Small","White");
        // Reference type
        //obj1.eat();
        obj1.fly();

        System.out.println(obj1.canFly);
        Lion lion = null;
        Parrot parrot = null;
        Shark shark = null;
        Eagle eagle = null;
        Dog dog= null;
        Duck duck= null;
        CydeoCar cydeoCar= null;
        Dolphin dolphin= null;

        Flyable[] bird = {parrot,eagle};

        Swimmable[] waterBabies = { shark, dolphin};

       Playable[] friendlyAnimals = {duck};

        boolean isAnimal = dog instanceof Animal;


        System.out.println(isAnimal);

        System.out.println("-------------------------");

        Car car = new Tesla("Tesla", "Model Y", "White", 2020, 29000);

        boolean isTesla = car instanceof Tesla;
        boolean isAudi = car instanceof Audi;

        boolean isElectricCar = car instanceof Electric;
        boolean hasAutoPark = car instanceof AutoPark;
        boolean hasAutoPilot = car instanceof AutoPilot;

        System.out.println("isTesla = " + isTesla);
        System.out.println("isAudi = " + isAudi);
        System.out.println("hasAutoPilot = " + hasAutoPilot);
        System.out.println("hasAutoPark = " + hasAutoPark);
        System.out.println("isElectricCar = " + isElectricCar);


    }
}
