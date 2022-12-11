package day05_operators;

public class LogicalOperator {
    public static void main(String[] args) {

        double salary =90_000;
        int creditScore = 550;
        int age = 42;

        boolean eligibleForLoan = salary >= 30_000 && creditScore >= 600 && age <= 50;
       //                                 true     &&      false
        System.out.println(eligibleForLoan);

        System.out.println("---------------");

        age = 18;
        String country = "USA";

        boolean eligibleToVote = age >= 18 && country == "USA";

        System.out.println(eligibleToVote);

        System.out.println("-------------");

        char grade = 'A';

        boolean passedTheExam = grade == 'A' || grade == 'B' || grade == 'C';

        System.out.println("Did you pass the exam? " + passedTheExam);

        System.out.println("--------");
        







    }
}
