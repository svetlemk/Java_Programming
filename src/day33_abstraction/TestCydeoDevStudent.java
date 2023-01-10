package day33_abstraction;

import java.time.LocalDate;

public class TestCydeoDevStudent {
    public static void main(String[] args) {

        CydeoDevStudent student1 = new CydeoDevStudent("Daniel",'M', LocalDate.of(2000,1,1), "T12", "zero to hero", 12);
        System.out.println(student1);

        student1.eat();
        student1.drink();
        student1.sleep();
        student1.breath();


    }


}
