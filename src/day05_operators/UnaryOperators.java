package day05_operators;

public class UnaryOperators {
    public static void main(String[] args) {
        // pre increment/decrement
        int x = 10;
        System.out.println( ++x );// change the value immediately in the memory// 11
        System.out.println( x ); // same as 11

        int y = 100;
        System.out.println( --y );// change the value immediately.

        System.out.println("------------------");

        //post increment/decrement is going to postpone it

        int a = 50;
        System.out.println( a++);
        System.out.println( a++);
        System.out.println( a++);

        int b = 25;
        System.out.println( b--);
        System.out.println( b--);
        System.out.println( b);

        System.out.println("------------------------------");
        int n = 30;
        int m = n++; //30
        System.out.println("m = " + m);
        System.out.println("n = " + n);
        System.out.println("m = " + m);
        







    }
}
