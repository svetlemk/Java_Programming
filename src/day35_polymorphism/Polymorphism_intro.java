package day35_polymorphism;

import day31_inheritance.shape_methodOverriding.Circle;
import day34_inference.animalTask.*;
import day34_inference.carTask.Audi;
import day34_inference.carTask.Honda;
import day34_inference.carTask.Tesla;

import java.util.Arrays;

public class Polymorphism_intro {
    public static void main(String[] args) {
        Dog dog = new Dog("Max", "Husky",'M', 4, "Small", "White");
        Cat cat = new Cat("Anna", "ShortHair",'F',3,"Big","Black");
        Tiger tiger = new Tiger("Kitty", "Striped",'F',2,"Huge", "White");
        Lion lion= new Lion("Leo", "Mainy", 'M', 1,"Medium","Spotted");

        Animal[] animals ={dog, cat, tiger, lion};

        Animal animal = new Dog("Max", "Husky",'M', 4, "Small", "White");

        animal.sleep();
        animal.drink();
       // animal.play();

        System.out.println("------------------------------");

        String str= "Java";

        Integer n = 100;
        Boolean r = false;
        Double d = 10.5;
        Circle circle = new Circle(2.4);
        Honda honda = new Honda("Pilot", "Black", 2014,23000);
        Audi audi = new Audi("Q6", "Silver",2020, 34000);
        Tesla tesla= new Tesla("Model Y", "Blue", 2022, 65000);

        Object[] objects = {audi, n, r,d, circle};

        System.out.println(Arrays.toString(objects));



    }
}
