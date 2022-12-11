package day07_ifStatements2;

public class NetINcomeCalculator {
    public static void main(String[] args) {

       int salary = 80_000;
       boolean isMarried = true;

        double taxRate = 0;

        if( salary >= 130_000 ){
            taxRate = 0.35;
        }
        if( salary >= 100_000 && salary < 130_000){
            taxRate = 0.3;
        }
        if( salary >= 80_000 && salary < 100_000){
            taxRate = 0.25;
        }
        if( salary >= 79_000){
            taxRate = 0.20;
        }

        if(isMarried){
            taxRate -= 0.05;
        }

        double netIncome = salary * (1 - taxRate);

        System.out.println("netIncome = " + netIncome);


    }
}
/*

    3. Create a class named NetIncomeCalc,
     Write a program that can calculate the salary
     after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition:
                	if the person is married, he/she will pay 5% less tax
 */