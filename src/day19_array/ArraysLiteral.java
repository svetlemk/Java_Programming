package day19_array;

import java.util.Arrays;

public class ArraysLiteral {

    public static void main(String[] args) {

        int[] number = new int[5];

        int[] num = {1, 2, 3, 4, 5};

        System.out.println(number.length);
        System.out.println(num.length);

        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(num));

        System.out.println("-------------------------------------");

        String[] weekDay = {"Monday", "Tuesday","Wednesday",
                //index        1        2          3
                "Thursday","Friday", "Saturday", "Sunday"};
        // index   4         5         67
        int n = 1;

        System.out.println( weekDay[n-1] + " ");

        String[] months = {"Jan", "Feb", "March", "April","May","June",
                "July","Aug","Sept","Oct","Nov","Dec"};

        System.out.println("months = " + Arrays.toString(months));

        System.out.println("---------------------------");

        //int[]  numbers2 = new int[100];

        for (int i = months.length - 1; i >= 0; i--) {
            System.out.print(months[i]);
        }








    }
}
