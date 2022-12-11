package day24_ArrayList_JavaDateTime;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String str = "aaabbbbcccccccc";
        //a3b4c8
        String result = "";

        for (String each : str.split("")) {
            int frequency = Collections.frequency( Arrays.asList (str.split("")),each );
            
            if(!result.contains(each)){
                result += each + frequency;
            }
        }

        System.out.println("result = " + result);


    }
}
