package day32_final_keyword.personTask;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class TestPersonObject {

    public static void main(String[] args) {
        Person person1 = new Person("Daniel", 'M', LocalDate.of(1991, 1, 25));
        person1.setName("Alex");
        System.out.println(person1);
        person1.breath();

        System.out.println("-------------------------------");

        Employee employee = new Employee("LilPop", 'F', LocalDate.of(1978, 1, 1), "QA", 123334);
        System.out.println(employee);

        employee.setSalary(67899);
        employee.setJobTitle("Manager");
        employee.setName("Lana");
        employee.breath();

        System.out.println(employee);
    }


}
