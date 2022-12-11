package day13_customMethods;

import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {

        System.out.println("Print the month number: ");
        int month = new Scanner(System.in).nextInt();

        if (month < 1 && month > 12) {
            System.err.println("The month is invalid");
            return;
        }
      /*  System.out.println((month == 1)?"Jan"
                :(month ==2 )?"Feb"
                :(month ==3 )?"March"
                :(month ==4 )?"April"
                :(month ==5 )?"May"
                :(month ==6 )?"June"
                :(month ==7 )?"July"
                :(month ==8 )?"Aug"
                :(month ==9 )?"Sept"
                :(month ==10 )?"Oct"
                :(month ==11 )?"NOv"
                :"December"

        );*/

        switch (month) { // 1~12
            case 2:
                System.out.println("28 days");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 days");
                break;
            default:
                System.out.println("31 days");



        }


    }


}
