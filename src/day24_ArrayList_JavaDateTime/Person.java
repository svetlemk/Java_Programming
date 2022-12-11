package day24_ArrayList_JavaDateTime;

import java.time.LocalDate;

public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;

    public Person(String name, char gender, LocalDate dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.age = LocalDate.now().getYear() - dateOfBirth.getYear();

    }


}
