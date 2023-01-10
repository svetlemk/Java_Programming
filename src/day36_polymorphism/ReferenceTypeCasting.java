package day36_polymorphism;

import day29_inheritance.animalTasks.Animal;
import day29_inheritance.animalTasks.Cat;
import day29_inheritance.animalTasks.Dog;
import day30_inheritance.phone_task.IPhone;
import day30_inheritance.phone_task.Nokia;
import day30_inheritance.phone_task.Phone;
import day33_abstraction.employee_task.*;
import day35_polymorphism.transport_task.AutoPilot;
import day35_polymorphism.transport_task.Electric;
import day35_polymorphism.transport_task.Tesla;

public class ReferenceTypeCasting {

    public static void main(String[] args) {
        Dog dog = new Dog();

        Animal animal = (Animal) new Dog();// optional, since it si done implicitly
        animal.setInfo("Max", "Husky", "White", 'M', 'L', 5);

        animal.eat();
        animal.drink();
        animal.sleep();

        ((Dog) animal).bark(); // down casting_ one time only

        Dog dog1 = (Dog) animal; // down casting: when needed more that 1 time

        dog1.bark();

        ((Dog) animal).bark();// down casting

        //Dog dog2 = (Dog)animal; // dog casting
        //dog2.bark();

        //((Cat)animal).scratch();// Dog can not be converted to cat
        // because there eis no "IS A " relationship

        System.out.println("-----------------------------------");

        Phone phone = new Nokia("X45", "small", "White", 2300);

        phone.call(3678);
        phone.text(7876);
        ((Nokia) phone).selfDefense();

        //((IPhone)phone).faceTime(3333);// nokia can not be cpnverted to iphone

        Employee employee = new Developer("Lucy", 43, 'F', "A34", "Developer", 453000, "java");

        employee.work();

        System.out.println(((Developer) employee).getProgrammingLanguage());

        //Tester tester = (Tester)employee;

        System.out.println("-----------");
        Electric electric = new Tesla("Tesle", "Model Y", "Blue", 2020, 50000);

        electric.charge();
        ((Tesla) electric).selfDrive();
        ((AutoPilot) electric).autoPark();

        System.out.println("---------------");

        Employee employee2 = new Teacher("James", 34, 'M', "M22", "Math teacher", 12000);

        Employee employee3 = new Driver("Lucy", 23, 'F', "A22", "Driverr", 23344);

        Employee employee4 = new Developer("Pony", 34, 'F', "S11", "Prorgam", 100000, "Java");

        Employee employee5 = new Tester("Olena", 32, 'F', "E11", "QA tester", 23000);

        employee2.work();
        employee3.work();
        employee4.work();
        employee5.work();

    }

}
