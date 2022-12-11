package day14_ForLoop_Overloading;

public class ForLoopPractice {

    public static void main(String[] args) {
        for (int i = 10; i >= 5; i--) {// i=10, condition is true > statement runs
            System.out.println("Hello");// i=9, condition, then statement printed, then iterator discrease
            // i = 8 etc
        }                               // i = 8 etc
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);

        char alpha = ' ';

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("hello");

        for( char i = 'Z'; i >= 'A'; i--){
            System.out.print(i +" ");
        }


    }
}
