package day00_test;

public class Test1 {

    static String studentName = "Mike";

    static{
        studentName = "Jordan";
    }

    public static void main(String[] args) {
        studentName = "Jean";

        System.out.println(studentName);
    }


}
