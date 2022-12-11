package day17_customClass;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aabcccd";
        String result = ""; //a2b1c3d1
                            // a b c d
                            // 2 1 3 1 === main focus how to get frequency and then each char concate it
        for (int j = 0; j < str.length() ; j++) {

            char ch = str.charAt(j); // a  == first char at index0
            int count = 0;

            for (int i = 0; i < str.length() ; i++) {
                if(str.charAt(i) == ch){
                    count++;
                }
            }
            if(result.contains(ch +"")){ // if the character is already in the result
                continue;   // skip that character
            }
            result += ch + "" + count;
        }

        System.out.println(result);

        //System.out.println(ch +" : " + count);


    }
}
/*
2. Write a program that can find the frequency of the characters from a string

                Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1

 */