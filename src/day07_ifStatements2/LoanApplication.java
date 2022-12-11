package day07_ifStatements2;

public class LoanApplication {
    public static void main(String[] args) {
        int salary = 78_000;
        int creditScore = 600;

        if(salary >= 45_000 && creditScore >= 700){
            System.out.println("You are eligible for the loan");
        }else{
            System.out.println("You are NOT eligible for the loan");
        }



    }
}
/*
1. Create a class named LoanApplication. two variables named salary
and createdScore are declared and given, write a program that
can check if the person is eligible to apply for a loan

            Note:In order to be eligible for a loan:
                    1. salary: at least 45K
                    2. credit score: at least 700
 */