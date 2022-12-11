package day00_test;

import java.util.ArrayList;
import java.util.Arrays;

public class testingWIthGroup {
    public static void main(String[] args) {
        //int[] list = {1, 0, 2, 0, 3, 0, 4, 0};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        int count = 0;
        for (Integer each : list) {
            if(each == 0 ){
                count += 1;
            }
        }

        list.removeAll(Arrays.asList(0));

        System.out.println(list);

        for (int i = 0; i < count; i++) {// put back 0 to the array
            list.add(0);
        }
        System.out.println(list);




    }
}
/*3. Write a program that can move all the zeros to the last indexes of ArrayList
            ex:
                list: {1,0,2,0,3,0,4,0}
            output:
                [1, 2, 3, 4, 0, 0, 0, 0]

 */