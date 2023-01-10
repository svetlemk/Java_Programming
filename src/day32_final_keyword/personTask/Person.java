package day32_final_keyword.personTask;

import java.time.LocalDate;

public class Person {

    private String name;
    private final char gender;
    private final int age;
    private final LocalDate dateOfBirth;

    public static final int numberOfHeads;

    static {
        numberOfHeads = 1;
    }

    public Person(String name, char gender, LocalDate dateOfBirth) {
        setName(name);
        if (!(gender == 'M' || gender == 'F')) {
            System.err.println("Invalid gender: " + gender);
            System.exit(1);
        }
        this.gender = gender;
        /* if(age <=0){
            System.err.println("Invalid age: " +age);
            System.exit(1);
        }*/
        this.dateOfBirth = dateOfBirth;
        this.age = LocalDate.now().getYear()- dateOfBirth.getYear();
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void drink(){
        System.out.println(name + " is drinking");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
    public final void breath(){
        System.out.println(name + " is breathing");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                " name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}





/*
Variables:
    name, gender, age, DOB
    numberOfHeads
    eat(), drink(), sleep(), breath()
 */
