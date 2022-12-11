package day26_statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentGroup {  // students group
    public String groupName;
    public int groupId;
    public ArrayList<Student> students = new ArrayList<>(); // array list to enable us to us add multiple students obejcts

    // instance creates array list too.
    public StudentGroup(String groupName, int groupId) {  // constructor to use the essential for them
        this.groupName = groupName;
        this.groupId = groupId;
        //students == new ArrayList<>();
    }// constructor creates the student groups object by setting the group name and group id

    public void addStudent(Student student) { // takes one student object and adds it to the arraylist of students
        students.add(student);   // additional functions to add and  remove sttudents
    }

    public void addStudent(String name, int age, char gender, String id) { // takes name, age, gender and is of the students info
        //Student student = new Student(name, age, gender, id);    // and creates student object by using the given info
        students.add(new Student(name, age, gender, id)); // ArrayList students
        // adds stuendt object to the array list of students
    }

    public void addStudents(Student[] students) {
        this.students.addAll(Arrays.asList(students));
// takes one array of student and add it to the instance variable array list of students.
    }

    public void removeStudent(String id) {
        students.removeIf(p -> p.id.equals(id)); // lambda
    } // Takes the Id and removes a student object with the specified id from the arraylist of student


    public String toString() {
        return "StudentGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students=" + students.size() +
                '}';
    }
}


/*
Create a custom class named StudentsGroup
 Attributes:
  groupName, groupId, students (ArrayList<Students>)

Add a constructor that can set the groupId and groupName
	                    initialize students arraylist in the constrcutor's body
Methods:
	                addStudent(Student): adds the specified student to the students arrayList

	                removeStudent(id): removes the student with the specified id from the students arraylist

	                toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement

 */