package day15_loops_continue;

public class RemoveDuplicates2 {

    public static void main(String[] args) {
        String str = "hjkjgggghhhhhbiuhiui";

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (result.contains(str.charAt(i) + "")) { // if the char is in the new string

                continue;// we skip that iteration of loop

            }
            result += str.charAt(i);

        }
        System.out.println(result);

        System.out.println("-------------------");

        // create a sum of all even numbers between 50 to 100

        for (int i = 50; i < 101; i++) {
            if (i % 2 != 0) {
                continue;

            }

            System.out.print(i+ " ");
        }


    }


}
