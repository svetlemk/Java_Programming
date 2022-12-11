package day17_customClass;

public class TestDogObejctClass {

    public static void main(String[] args) {

        Dog dog1 = new Dog(); // store into variable in order to be reuseble;

        dog1.name = "Max";
        dog1.breed = "Husky";
        dog1.gender = 'M';
        dog1.age = 4;
        dog1.size = "Large";
        dog1.color = "Grey";

        dog1.eat();

        System.out.println(dog1); // gives hashcode is to string method is ot used
                                    // need .toString() to display


        Dog dog3 = new Dog();
        dog3.setInfo("Loki","Chow chow,",'M',5,"small", "while");


        Dog dog4 = new Dog();
        dog3.setInfo("Baxy", "Mix",'M', 2
        , "Medium","Black");

        System.out.println(dog1);
        System.out.println(dog3);
        System.out.println(dog4);

        dog3.eat();

    }




}
