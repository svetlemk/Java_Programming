package day00_test;

import java.util.Arrays;

public class AarryDublicate {


    public static void main(String[] args) {


        int[] arr = {5, 5, 3, 3, 2, 1, 3};
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            if (Arrays.asList(arr).contains(i)) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}


