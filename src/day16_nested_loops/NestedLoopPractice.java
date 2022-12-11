package day16_nested_loops;

public class NestedLoopPractice {

    public static void main(String[] args) {
        String str = "aaabbbbbbbbcccccc";

        String result = "";

        for (int j = 0; j < str.length(); j++) {// outer loop

            char ch = str.charAt(j); // inner loop
            int count = 0;
            for (int i = 0; i < str.length(); i++) {// finding the frequency of char
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            if (count == 2 && !result.contains(ch+"")) {
                result += ch;
            }


        }

        System.out.println(result);

    }


}
