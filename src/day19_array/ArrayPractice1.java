package day19_array;


import java.util.Arrays;

public class ArrayPractice1 {
    public static void main(String[] args) {

        String[] myGroup = new String[5];

        myGroup[0]= "Jeremy";
        myGroup[myGroup.length-1] = "Annie";
        myGroup[2] = "Anthony";
        myGroup[3] = "Alvin";
        myGroup[1] = "Abdullah";
        //myGroup[4] = "Karina";

        System.out.println(Arrays.toString(myGroup));

        myGroup[1] = "Kuzzat";
       // myGroup[5] = "Elip";

        System.out.println("-------------------");

        for (int i = myGroup.length-1; i >= 0 ; i--) {
            System.out.println(myGroup[i]);

        }

        System.out.println("----------------");


















    }


}
