package day25_constructors;


import day17_customClass.Dog;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethodPractice {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

        ArrayList<Dog> smallDog = new ArrayList<>();

        smallDog.addAll(Arrays.asList(dogs));
        smallDog.removeIf(p -> !p.size.equalsIgnoreCase("small"));
        // remove all except small dogs
        System.out.println(smallDog);
        System.out.println("-----------------------");

        ArrayList<Dog> youngDogs = new ArrayList<>();

       /* for (Dog dog : dogs) {
            if(dog.age <= 4){
                youngDogs.add(dog); // if qualified will be added to the array list
            }

        }*/

        youngDogs.removeIf(p -> p.age > 4);

        System.out.println(youngDogs);

        ArrayList<Dog> femaleDogs = new ArrayList<>();
        femaleDogs.removeIf(p -> p.gender == 'M');


        ArrayList<Dog> maleDogs = new ArrayList<>();
        maleDogs.removeIf(p -> p.gender == 'F');

        System.out.println("-------------------------------------");

        // what if at the end you need to keep it as array, not array list
        Dog[] dogs2 = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs2[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs2[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs2[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs2[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs2[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs2[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");


        ArrayList<Dog> noSmall = new ArrayList<>(Arrays.asList(dogs2));
        noSmall.removeIf(p -> p.size.equalsIgnoreCase("small"));

        dogs2 = noSmall.toArray(new Dog[0]); // convert arraylist to array, meantion zero

       /* for (Dog doggy : dogs) {
            if (doggy.size.equalsIgnoreCase("small")){
                smallDog.add(doggy);
            }
        }
        System.out.println(smallDog);*/


    }
}
/*
1. Give the following array of dogs
            Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
            dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
            dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
            dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
            dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
            dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
            dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

            Note: Dog class is imported from package day17

        1.1 Create an arrayList named smallDogs, and add all the dog objects with the size of small from the dogs array to smallDogs arrayList

            Note: DO NOT use any loops
 */