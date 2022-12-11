package day22_ArrayList;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10); // autoboxing internally. adding int to Integer wrapper class
        list.add(20);// one element at the time
        list.add(30);//  index : 2

        // inserting element --- method overloaded// old number
        // will be shifted to the right
        list.add(1, 15);
        System.out.println(list);


        System.out.println("--------------------------");
        ArrayList<String> studentList = new ArrayList<>();

        studentList.add("Mohammed");
        studentList.add("Adbul");
        studentList.add("Alina");
        studentList.add("Tatiana");

        System.out.println(studentList.size());
        System.out.println(studentList);

        String firstStudent = studentList.get(0);// get method
        System.out.println(firstStudent);

        String lastStudent = studentList.get(studentList.size()-1);// last student name

        System.out.println(lastStudent);




    }
}
