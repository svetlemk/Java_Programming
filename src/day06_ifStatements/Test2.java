package day06_ifStatements;

public class Test2 {
    public static void main(String[] args) {
          char grade = 'A';
        boolean Passed = grade == 'A' || grade == 'B';
        boolean Passed2 = grade == 'C' || grade == 'D';

        if (Passed || Passed2){
            System.out.println(" you passed ");
        }else {
            System.out.println("you failed");
        }
    }
}
