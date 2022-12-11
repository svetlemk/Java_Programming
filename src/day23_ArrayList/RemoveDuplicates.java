package day23_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        // same approach as with the string: declare secondry
        // array list, call mom duplicates

        ArrayList<String> noDup = new ArrayList<>();

        for (String each : names) {
           if(noDup.contains(each)) {
           continue; // skipping the echa which is already in nodub
           }
            noDup.add(each);

        }
        names = noDup;

        System.out.println(names);




    }
}
