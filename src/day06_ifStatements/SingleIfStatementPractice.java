package day06_ifStatements;

public class SingleIfStatementPractice {
    public static void main(String[] args) {
        int num = 1545;

        boolean isEven = num % 2 == 0;


        if (isEven){
            System.out.println( num + " is even.");
        }

        System.out.println("-----------------");

      if (num % 2 == 0){
          System.out.println( num + " is even");
      }

        if (num % 2 != 0){
            System.out.println( num + " is odd");
        }

        if(!isEven){
            System.out.println( num + " is odd.");
        }

    }
}
