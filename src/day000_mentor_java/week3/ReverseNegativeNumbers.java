package day000_mentor_java.week3;

public class ReverseNegativeNumbers {

    public static void NegToPosi(int num) {
        if (num >= 0) {
            System.err.println("Number should be negative ");
            System.exit(1);
        } else {
            int result = num * -1;
            System.out.println(result);

        }

    }
    public static void main(String[] args) {
        NegToPosi(12);
    }

}
/*
Write a method that can reverse negative
number and return as int
 */
