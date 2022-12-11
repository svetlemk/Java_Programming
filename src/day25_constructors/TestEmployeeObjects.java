package day25_constructors;

import java.time.LocalDate;


public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee e1 = new Employee("Alex", 24, 'M', "Developer", 100000, LocalDate.of(2022, 1, 1));
        Employee e2 = new Employee("Muhammad", 31, 'M', "Developer", 95000, LocalDate.of(2012, 12, 10));

        System.out.println(e1);
        System.out.println(e2);


    }

}
