package day07_ifStatements2;

public class GradeReport {
    public static void main(String[] args) {
        int score = 81;
      String result = "Your grade is: ";

      if (score >= 90){ // false - score < 90
          result += "A";
      }
      else if(score >= 80){ // it automatic  <90 because the first block did not get executed
          result += "B";
      }
      else if( score >= 70){
          result += "C";
      }
      else if( score >= 60){
          result += "D";
      }
      else {
          result = "F";
      }

        System.out.println("result = " + result);



    }
}
/*
1. Create a class named GradeReport.java
2. An integer variable named score
is declared and given,
Write a program that can print the grade of the student
Ex:
score = 95
output:
Your grade is A
Note: Assume that the given score is between 0 ~ 100
 */