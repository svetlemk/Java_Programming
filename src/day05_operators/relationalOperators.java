package day05_operators;

public class relationalOperators {
    public static void main(String[] args) {
        int a = 1000;
        int b = 200;

//        System.out.println( a > b);
//        System.out.println( a < b);
        boolean aIsGreater = a > b;
        System.out.println("aIsGreater = " + aIsGreater);
        
        int score = 75;
        boolean passed = score >= 60;
        System.out.println("passed = " + passed);

        score = 48;
        boolean failedExam = score < 60;
        System.out.println(failedExam);

        System.out.println("---------------");

        System.out.println(100<1009);// true
        System.out.println(95 <= 100); // true
        System.out.println(100 <= 100);// true
        System.out.println( 1000 <= 6); //false
        System.out.println("-----------");
        System.out.println('a' < 'b');// character Ascii table has number// 65 < 66 ==. true




    }
}
