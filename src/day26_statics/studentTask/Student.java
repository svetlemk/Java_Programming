package day26_statics.studentTask;

public class Student {

    public String name;  /// make sure every student object has all of this attributes:
    public int age;
    public char gender;
    public String id;

    public Student(String name,int age, char gender, String id){ // to enable user to set all attribues when object created for
        this.name = name; // sets them for 4 instances of the student/calling instance variables
        this.age = age; //
        this.gender = gender;
        this.id = id;
    }

    public void study(){ // study method also instance
        System.out.println(name + " is studying");
    }

    public String toString() {  // to string method to display in the print method.
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                '}';
    }
}



/*
1. Create a custom class named Student
            Attributes:
                name, age, gender, id

            Add a constructor that can set all the fields

            Methods:
                study()
                toString()
 */