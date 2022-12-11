package day06_ifStatements;

public class IfStatementIntro {
    public static void main(String[] args) {
        int num = - 100;
        boolean isPositive = num > 0;
        boolean isNegative = num < 0;
        boolean isZero = num == 0;

        if( isPositive ) {
            System.out.println(num + " is positive");
        }
        if ( isNegative ){
            System.out.println(num + " is negative");
        }
        if ( isZero){
            System.out.println( num + " is zero");
        }

        System.out.println("----------------------------");

        int number = 5;

        if (number >0 ){
            System.out.println( number + " is positive");
        }
        if (number < 0 ){
            System.out.println( number + " is negative");
        }

        if (num == 0){
            System.out.println( number + " is zero");
        }



    }
}
