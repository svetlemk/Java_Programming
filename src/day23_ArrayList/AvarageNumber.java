package day23_ArrayList;

import java.util.ArrayList;

public class AvarageNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20); // autoboxing.
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(70);

        System.out.println(list);

        int sum = 0;

        for( Integer each :list ){
            sum += each;
        }

        double average = (double)sum/list.size(); // int by int= will give you int, so we need to cast
                                            // one of them to double
        System.out.println(average);

/*
Write a program that can find the average number from an arrayList of integers
 */











    }


}
