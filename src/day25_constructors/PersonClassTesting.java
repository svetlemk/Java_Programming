package day25_constructors;

import java.time.LocalDate;

public class PersonClassTesting {
    public static void main(String[] args) {

        Person p1 = new Person("Abi", 23,'F', LocalDate.of(2012,12,10),false,true);
        Person p2 = new Person("Masha", 28,'F', LocalDate.of(2011,1,15),false,true);


        System.out.println(p1);
        System.out.println(p2);


    }

}
