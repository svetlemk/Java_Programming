package day24_ArrayList_JavaDateTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Java", "Java", "C#", "Ruby", "Swift", "Swift", "Java"));
        System.out.println(names);

        Collections.replaceAll(names, "Java", "Python");

        System.out.println(names);

/*
        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).equals("Java")){
                names.set(i, "Python");
            }

        }*/

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 30, 40, 40, 50, 50, 50, 50, 60, 50, 50));

        int count = Collections.frequency(list, 50);

        System.out.println(count);

        System.out.println("------------------");

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java", "Java", "C#", "Ruby", "Swift", "Swift", "Java"));
        System.out.println(words);

        int javas = Collections.frequency(words, "Java");
        System.out.println(javas);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 20, 30, 40, 40, 50, 50, 50, 50, 60, 50, 50));

        for (Integer each : numbers) {
            if ( Collections.frequency(numbers, each) == 1){
                System.out.println(each);
            }

        }


    }
}
