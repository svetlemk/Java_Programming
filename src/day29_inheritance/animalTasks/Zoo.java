package day29_inheritance.animalTasks;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", "red", 'M', 'M', 3);

        Cat cat = new Cat();
        cat.setInfo("Felicia", "Mix", "White", 'F', 'M', 4);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sheerhan", "Bengal tiger", "striped", 'M', 'L', 10);


        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        System.out.println("------------------------");

        dog.eat();
        dog.sleep();
        dog.drink();

        cat.eat();
        cat.drink();
        cat.sleep();

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        System.out.println("+++++++++++++++++++++++");
        dog.bark();


        System.out.println(dog.getName());
        System.out.println(dog.getColor());

        dog.setName("Ami");

    }
}
