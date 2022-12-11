package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");
        names.add("Shukir");
        names.add("Marika");
        names.add("Marika");

        for (String each : names) {
            if(names.indexOf(each) == names.lastIndexOf(each)){
                System.out.println(each);// print unique element
                break; // use if only first unique element
            }
        }

        boolean hasMuhtar = names.contains("Mugtar"); // false
        boolean hasAli = names.contains("Ali");

        System.out.println("hasAli = " + hasAli);
        System.out.println("hasMuhtar = " + hasMuhtar);

        System.out.println("---------------------------");

        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("Alena", "Muhtar","Gadir","Ali"));
        
        developers.retainAll(Arrays.asList("Alena", "Ali"));
        System.out.println("developers = " + developers);

        System.out.println("-----------------");

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.addAll(
                Arrays.asList("Eggs","Potato","Milk","Tomato","Rice","Orange",
                        "Strawberry","Blueberry","PaperTowels")
        );
        System.out.println("groceryList = " + groceryList);
        groceryList.retainAll( Arrays.asList("Eggs","Milk","Potato") );

        System.out.println("groceryList = " + groceryList);

        groceryList.removeAll( Arrays.asList("Milk", "Potato") );

        System.out.println(groceryList);





    }
}
