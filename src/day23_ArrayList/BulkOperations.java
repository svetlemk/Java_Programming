package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        // containsAll();
        // addAll():

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.addAll(1, numbers);// insert the type, shifting to the ru

        System.out.println(list1);

        System.out.println("---------------------");

        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll(Arrays.asList(75, 85, 95, 70, 80)); // as list methos

        System.out.println(scores);

        System.out.println("---------------------");

        ArrayList<String> students = new ArrayList<>();

        students.addAll(Arrays.asList("Gadir", "Alex", "Tanya", "Abdulla"));
        System.out.println(students);

        students.addAll(3, Arrays.asList("Anna", "Yousef"));
        System.out.println(students);

        System.out.println("------------------------");

        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8};

        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(nums)); // using constructor is one method of adding the leelemnts to the arraylist

        //  l1.addAll(Arrays.asList(nums));

        System.out.println(l1);
        System.out.println("-----------------------");

        ArrayList<String> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList("Alena", "Muhtar", "Gadir", "Ali"));

        boolean hasAlena = employeeList.contains("Alena");
        boolean hasAlenaGadir = employeeList.containsAll(Arrays.asList("Alena", "Gadir"));
        boolean hasMuhtarAliKuzzat = employeeList.containsAll(Arrays.asList("Muhtar", "Ali", "Kuzzat"));

        System.out.println("hasAlena = " + hasAlena);
        System.out.println("hasAlenaGadir = " + hasAlenaGadir);
        System.out.println("hasMuhtarAliKuzzat = " + hasMuhtarAliKuzzat);

        System.out.println("----------------------");
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 10, 10, 10, 10, 20, 20, 20));

        System.out.println(list); //[10, 20, 30, 40, 50, 60, 70, 10, 10, 10, 10, 20, 20, 20]
        list.removeAll(Arrays.asList(10, 20));
        System.out.println(list); //[30, 40, 50, 60, 70]




    }
}
