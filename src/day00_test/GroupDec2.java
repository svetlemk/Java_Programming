package day00_test;

import java.util.Arrays;

public class GroupDec2 {
    
    public static int[] insert(int[] array, int index, int element){
        
        int[] newArray = new int[array.length+1];

        for (int i = 0,j =0; i < newArray.length+1; i++,j++) {
            if(i==index){
                newArray[i] = element;
                continue;
            }
            newArray[i] = array[j];
            j++;
            
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        int[] array2 = insert(array1,2,100);

        System.out.println(Arrays.toString(array2));
    }

}
/*
 Insert Task:
    1.1 Create a method named insert that passes three
     parameters: integer array, integer index,
    integer element.
    the method inserts the given
     element to the given index of the array
    and returns the new array
            Ex:
                arr = {10, 20, 30, 40, 50};
                insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}
 */