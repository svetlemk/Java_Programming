package day16_nested_loops;

public class FrequencyOfCharacter {
    public static void main(String[] args) {


        String str = "aaabbbccccccccccccc";
        char ch = 'c';

        int count = 0;

        for (int i = 0; i < str.length() ; i++) { // i is index number of str

            if( str.charAt(i) == ch){ // char uses ==, object needs .equals(
                count++; // if the char of the string is equial to teh given character
                // it means that the chr is appeared

            }

        }
        System.out.println(count);


    }

}
/*
 2. write a program that can return the frequency of a character from a string
      Ex:
      str = "aaabbbbccccc"
      ch = 'c'

	   output:
		   5

 */