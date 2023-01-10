package day31_inheritance.animal_method_overriding;

public class TestAnimalObjects {

    public static void main(String[] args) {

        Cat cat = new Cat("Emily", "Bengle", 'F', 5, "Small", "Gray");
        Dog dog = new Dog("Max", "Husky", 'M', 7, "Large", "White");
        Lion lion = new Lion("Simba", "African Lion", 'M', 6, "large", "Yellow", true);
        Eagle eagle = new Eagle("Bella", "American Eagle", 'F', 6, "Medium", "Black& White");

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);

        System.out.println("------------");

        cat.eat();
        dog.eat();
        eagle.eat();
        lion.eat();

        System.out.println("---------------------");

        cat.sleep();
        dog.sleep();
        eagle.sleep();
        lion.sleep();

    }
}
