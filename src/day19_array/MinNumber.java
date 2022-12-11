package day19_array;

import java.util.Arrays;

public class MinNumber {
    public static void main(String[] args) {
        
      int[] array2 = {782,34,5322,444,422,222};
      
      int min = array2[0];

        for (int i = 1; i < array2.length; i++) {
            
            if(array2[i] < min){
                min = array2[i];
            }
            
        }

        System.out.println(Arrays.toString(array2));

        System.out.println("min = " + min);
        
        
        
        
        
        
        
    }
    
}
