package day00_test;

import java.lang.reflect.Array;
import java.util.ArrayList;

class test {

    public static void main(String[] args) {

        String str = "Malabalenmsnkkjk";
        int firstIndex = str.length() / 2 - 1;
        int secondIndex = str.length() / 2;

        if (str.length() % 2 == 0) {

            System.out.println(str.charAt(firstIndex) + "" + str.charAt(secondIndex));
        } else {
            System.out.println("Invalid string");
        }


        String hasBad = "eddbadxx";


        //  boolean bad = hasBad.charAt(0).equals('b') || hasBad.charAt(1) == 'b' && hasBad.contains("bad");
        //  System.out.println(bad);

        String str1 = "helko";
        String str2 = str1.substring(str1.length() - 2);

        System.out.println(str2.repeat(3));

        ArrayList<Integer> list = new ArrayList<>();
        //list.addALl(Array.asList(1,2,3,4,5));

        list.set(0, list.get(4));
        list.set(4, list.get(0));

        System.out.println(list);


        Integer a = 1;
        list.remove(a);

        System.out.println(list);

        System.out.println("+++++++++++++++++++");

        int[] numbers = {20, 30, 25, 35, -16, 60, -100};
        int result = 0;

        for (int each : numbers) {
            if (each % 2 == 0) {
                result += each;
            }

        }
        // create a method will return the  sum of odd all array elements





        /*
        Given a string, return a new string made of
        3 copies of the last 2 chars of the original string.

        The string length will be at least 2.




extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"


       /*
        Given a string, return true if "bad"
        appears starting at index 0 or 1 in the string,
         such as with "badxxx" or "xbadxx" but not "xxbadxx".
          The string may be any length, including 0.
          Note: use .equals() to compare 2 strings.


hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false

         */


        //int word = Integer.parseInt(str);

        //System.out.println(word);

        /*for (int i = str.length()-1; i <= 0; i--) {
          str.indexOf(i);

        }

        for (int i = 0; i <str.length()-1 ; i++) {
            System.out.println(i);



        }*/


    }

}

 /*
Given a string of even length, return a string made of the middle two chars, so the string
 "string" yields "ri". The string length will be at least 2.


middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
         */


/*     int Solution(int[] A){
         int ans = 0;

         for (int i = 0; i < A.length; i++){
             if (ans > A[i]){
                 ans = A[i];
             }
         }
         return ans;
     }
 }
    public static void main(String[] args) {
        int i = 10;
        while (i <= 10){
            System.out.println("i like java");
            ++i;
            System.out.println("good to hear from you");
            i--;
        }

    }
}*/
