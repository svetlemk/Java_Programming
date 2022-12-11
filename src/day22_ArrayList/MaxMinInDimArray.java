package day22_ArrayList;

public class MaxMinInDimArray {
    public static void main(String[] args) {
//       index of 1D arry         1              2               3
        int[][] array = {{100, 20, 300}, {10, 1000, 50}, {-200, 400, 0}}; // length is 3 ; index 0-2
        // index of 1D array 0    1   3      0    1     2     0     1   2

        int max = array[0][0];
        int min = array[0][0];

        for (int[] each1D : array) {
            for (int eachElement : each1D) {
                if (eachElement > max) {
                    max = eachElement;

                    if (eachElement < min) {
                        min = eachElement;


                    }

                    if (eachElement > max) {
                        max = eachElement;


                    }
                }

            }



        }
        System.out.println("maximum number is: " + max);

        System.out.println("mimimum number is: " + min);



     /*
     Write a program that can find the minimum and maximum numbers from a two dimensional array of integers
		Ex:
			array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };

			output:
				Minimum number is: -200
				Maximum number is: 1000
      */
        }
    }




