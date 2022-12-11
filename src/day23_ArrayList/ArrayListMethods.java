package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        array[0] = 100;

        System.out.println(Arrays.toString(array));

        System.out.println("------------------------");
        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("Eggs");
        groceryList.add("Paper Towels");
        groceryList.add("Appples");
        groceryList.add("Cooking oil");

        System.out.println(groceryList);

        groceryList.set(2, "Oranges");

        System.out.println(groceryList);

        groceryList.add(2, "Chicken");// increase the size of the Array list

        groceryList.remove(0); // with integer
        groceryList.remove("Chicken"); // by object

        System.out.println(groceryList);

        System.out.println("=======================");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); // index 0
        numbers.add(20); // 1
        numbers.add(30); // 2
        numbers.add(40); //3
        numbers.add(50); //4

       boolean r1 = numbers.remove(Integer.valueOf(10));

        System.out.println(numbers);
        System.out.println(r1);

        numbers.clear();
        System.out.println(numbers.size()); // it is 0

        System.out.println("-------");

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        System.out.println(names.indexOf("Vasyl"));
        System.out.println(names.lastIndexOf("Vasyl"));
        System.out.println("+-----------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;

        System.out.println(list2 == list1);

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(10);
        l2.add(10);

        System.out.println(l1);
        System.out.println(l2);

        System.out.println(l1 == l2); // different objects
// used equals to check if they contain the same elements

        System.out.println(l1.equals(l2)); // true

        System.out.println("--------------------------");

        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(10);
        n2.add(20);
        n2.add(30);

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        System.out.println(n1.equals(n2));

        System.out.println(n1.isEmpty());
        System.out.println(n2.isEmpty());
        System.out.println("**************");
        n1.clear();
        n2.clear();

        System.out.println(n1.isEmpty());
        System.out.println(n2.isEmpty());







    }
}
