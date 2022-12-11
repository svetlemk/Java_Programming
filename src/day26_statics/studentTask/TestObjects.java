package day26_statics.studentTask;

public class TestObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Yusuf", 21, 'M', "A34");
        Student student2 = new Student("Glenio", 24, 'M', "E34");
        Student student3 = new Student("Sumeyye", 22, 'F', "C56");
        Student student4 = new Student("Mehmet", 25, 'M', "D43");
        Student student5 = new Student("Sebastian", 23, 'M', "E27");

        Student[] students = {student2, student3, student4, student5};


        StudentGroup group1 = new StudentGroup("Java Turtles", 1);

        group1.addStudents(students); // add arrays of student- altogether

        group1.addStudent(student1); //  add student object

        group1.addStudent("Khashavar", 34, 'M', "F34");

        System.out.println(group1);

        group1.removeStudent("E34");

        System.out.println(group1);

        for (Student each : group1.students) {

            System.out.println(each.name + " : " + each.id);

            System.out.println("----------------------------------------");

            // display names of students. store all studnet object in the groups

            StudentGroup group2 = new StudentGroup("Java Turtles", 1);
            StudentGroup group3 = new StudentGroup("Java Turtles", 1);
            StudentGroup group4 = new StudentGroup("Java Turtles", 1);

            StudentGroup[] groups = {group1, group2, group3, group4};

        }


    }
    }

/*Create a class named TestObjects:

 */

