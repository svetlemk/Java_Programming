package day30_inheritance.types_of_inheritance;

import java.time.LocalDate;

public class TestPersonObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Lucy", 'F', LocalDate.of(1979, 01, 01),
                'F', "Aty");
        President president1 = new President("Ali", 'M', LocalDate.of(1889, 1, 1),
                LocalDate.of(1900, 9, 3));

        Teacher teacher1 = new Teacher("Amelia",'F',LocalDate.of(1902,1,1),
                "Lead teacher","A23",20000);

        System.out.println(student1);
        System.out.println(teacher1);
        System.out.println(president1);

        student1.study();
        teacher1.teach();
        president1.lie();

        System.out.println("----------------------------------");

        student1.eat("peanuts");
        teacher1.eat("Kebab");
        president1.eat("apple");

        student1.drink("water");
        teacher1.drink("vodka");
        president1.drink("poison");


    }
}
