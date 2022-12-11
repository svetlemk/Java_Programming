package day25_constructors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;
    public boolean isMarried;
    public boolean isEmployed;


    public Person(String name, int age, char gender, LocalDate dateOfBirth, boolean isMarried, boolean isEmployed){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth.format(DateTimeFormatter.ofPattern("y/MMMM/dd")) +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                '}';
    }



        public void eat(String food) {
            System.out.println(name + " is eating " + food);
        };

        public void sleeping(){
            System.out.println(name + "he is sleeping");
        }

        public void drink(String drink){
            System.out.println(name + " is drinking "+ drink);
        }





}
/* name, age, gender,
 dateOfBirth, isMarries, IsEmployed
 */