package day05_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int a = 20;// assigment operator
        System.out.println( a ); // 20
        System.out.println( a );

        System.out.println("----------------");

        // Addition assignment operator

        double balance = 100;
        balance += 1000; // balance will be re-assigned to the new one
        System.out.println("balance = " + balance);

        balance += 10_500;
        System.out.println("balance = " + balance);

        System.out.println("----------------");
        
        balance -= 500;// withdraw the money from account
        System.out.println("balance = " + balance);

        System.out.println("-------------------------------");
// Multiplication assignement operator
        double salary = 45000;
        salary *= 2;
        System.out.println("salary = " + salary);
        
        salary *= 5;
        System.out.println("salary = " + salary);
        System.out.println("--------------------------------");
        
        double eth = 4;
        eth *= 250;
        System.out.println("eth = " + eth);
        
        eth /= 2;
        System.out.println("eth = " + eth);

        System.out.println("salary = " + salary); // previous salary

        salary /= 2; // divide by 2
        System.out.println("salary = " + salary);

        System.out.println("-------------------");

        int b = 39;
        b %= 7; // b = 39/7 remainder

        System.out.println("b = " + b);



    }
}
