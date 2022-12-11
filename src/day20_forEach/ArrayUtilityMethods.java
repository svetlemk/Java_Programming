package day20_forEach;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayUtilityMethods {
    public static void main(String[] args) {

        int[] score = {70, 80, 90, 100};

        System.out.println(Arrays.toString(score));

        System.out.println("----------------");

        int[] a1 = {1, 2, 3, 4, 5, 6};
        int[] a2 = {1, 2, 3, 4, 5, 6};

        boolean r1 = Arrays.equals(a1, a2);

        System.out.println(r1);

        System.out.println("----------------------");

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'A', 'C', 'B'};

        boolean ch3 = Arrays.equals(ch1, ch2);

        System.out.println(ch3);

        System.out.println("-------------------------");
        int[] nums = {100, 70, 36, 87, 298, 2};

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
        System.out.println("Maximum number " + nums[0]);
        System.out.println("Minimum number " + nums[nums.length - 1]);

        String[] b1 = {"A", "B","C","D"};
        String[] b2 = {"A", "C", "B", "D"};
        Arrays.sort(b1);
        Arrays.sort(b2);

        boolean a = Arrays.equals(b1,b2);

        System.out.println(a);

        String[] students = {"Yaxier","Madivar","Ali", "Abidullah", "Alena" };
        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("--------------------------");

        int[] array = {10,20,30,40,50,60,70};

        int[] array2 = Arrays.copyOf(array,10);

        System.out.println(Arrays.toString(array2));

        System.out.println("--------------------------");

        int[] n1 = {1,2,3,4,5};
        int[] n2 = {6,7,8,9,10};

        int[] n3 = Arrays.copyOf(n1,n1.length+ n2.length);

        for (int i = 0, j = n1.length; i < n2.length; i++, j++) {
            n3[j] = n2[i];
        }

        System.out.println(Arrays.toString(n3));

        System.out.println("-------------------------");

        char[] ch = {'A', 'B', 'C', 'D', 'E','F', 'G'};

        char[] result1 = Arrays.copyOf(ch,20);
        System.out.println(Arrays.toString(result1));

        char[] result2 = Arrays.copyOfRange(ch, 2, 4);
        //String [] words = {"Hello", "I", "need", "help"};

        System.out.println(Arrays.toString(result2));
        char [] result3 = Arrays.copyOfRange(ch, 2, ch.length );

        System.out.println(Arrays.toString(result3));






    }


}
