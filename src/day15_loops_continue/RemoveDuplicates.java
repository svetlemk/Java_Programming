package day15_loops_continue;

/*
Write a program that can remove the duplicated characters from the a string

				Ex:
					str = "aabbbcccc"

					output:
						abc
 */
public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "aabbcccc"; // "abc"

        String result = "";        // store th temp,
                                   // which should contain new variable
        for ( int i =0; i < str.length(); i++){ // i is the index number of sdtring
          //  System.out.println(str.charAt(i));

            char each = str.charAt(i); // each character pf the string str

            if (!result.contains(each +"") ){ // if string result does not contain string str yet we will add
                result += each;
            // if the character s not contain yet in
                // the new string, otherwise gets skipped
            }

        }

        System.out.println(result);







    }
}
