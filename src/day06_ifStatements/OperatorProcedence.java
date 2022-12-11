package day06_ifStatements;

public class OperatorProcedence {

    public static void main(String[] args) {
        System.out.println("The total amount is: " + (5 +5 )/5);
        System.out.println( 7 + 3 - 2 / 2);
        System.out.println( -5 - 5 );

        System.out.println(10 > 9 == 8 < 7 || "Java" == "Python");
        //                 true   == false  // return false

        System.out.println( 100 >= 20 && 40 * 2 > 60);
        //                                 (1)
        //                     (2)true      (3)true
        //                           (4)&&

       int a = 20;
       a += 10 + 2 * 3;
     //   (3)     (2) (1)


        System.out.println( 100 >= 20 && 40 *2 > 60);
        //                   100 >=20  &&  80 > 60

        int k = 20;
        k += 10 + 2 * 3;

        System.out.println(k);

    }

}
