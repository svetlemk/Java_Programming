package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        int min = Collections.min(list);
        int max = Collections.max(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("----------------------------------");

        ArrayList<String> items = new ArrayList<>();
        items.addAll( Arrays.asList("Eggs","Potato","Milk","Tomato","Rice","Orange",
                "Strawberry","Blueberry","PaperTowels"));
        Collections.sort(items);

        System.out.println(items);

        System.out.println("----------------------------------");

        Collections.reverse(items);
        System.out.println(items);

        System.out.println("---------------------------------");


        ArrayList<String> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList("Alena", "Muhtar", "Gadir", "Ali", "Hasan"));

        Collections.swap(employeeList, 1,4);

        System.out.println(employeeList);

        Collections.swap(employeeList, 1,employeeList.size()-1);




    }
}
