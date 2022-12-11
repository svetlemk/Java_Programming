package day25_constructors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// custom class for employee object
public class Employee {

    public String name; // 6 instance variable
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public LocalDate hiredDate;

    //constructor to make

    public Employee (String name,int age, char gender, String jobTitle, double salary, LocalDate hiredDate){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hiredDate = hiredDate;
    }

   // toString method allows us to print the object when it si passed in teh print statement
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hiredDate=" + hiredDate.format(DateTimeFormatter.ofPattern("MMMM/dd/y")) +
                '}';// format the date
    }
}
/* age, name, gender, jobTitle,salary, hiredDate

 */