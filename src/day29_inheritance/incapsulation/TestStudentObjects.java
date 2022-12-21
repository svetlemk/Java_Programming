package day29_inheritance.incapsulation;

public class TestStudentObjects {
    public static void main(String[] args) {
        Student student1 = new Student("Alisa", 32, 'F', 'A', "Harvard");
        student1.setName("MIT");
        student1.setGrade('M');
        System.out.println(student1);

    }
}
