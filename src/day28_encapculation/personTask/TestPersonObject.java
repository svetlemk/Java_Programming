package day28_encapculation.personTask;

public class TestPersonObject {
    public static void main(String[] args) {
        Person person1 = new Person("Mohammed");

        Person person2 = new Person("Alex", 'F');

        Person person3 = new Person("Hasan", 32);

        Person person4 = new Person("Tatiana", 25, 'F');

        Person person5 = new Person("Daniel", 34, 'M', "English");

        Person person6 = new Person("Lucy", 31, 'F');

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);

        Person.printPlanetName();

        person1.eat("Baklava");

        person5.drink("Water");

        person3.drink("Tea");





    }
}
