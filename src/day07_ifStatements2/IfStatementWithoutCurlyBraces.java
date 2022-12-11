package day07_ifStatements2;

public class IfStatementWithoutCurlyBraces {
    public static void main(String[] args) {

        int age = 30;
        if (age >= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }

        System.out.println("---------------");

        if( age >= 21) System.out.println("Eligible");
        else System.out.println("Not eligible");

        System.out.println("------------------");

        int itemNum = 1;
        if(itemNum == 1){
            System.out.println("Eggs");
            System.out.println("Oranges");
        }
        else if (itemNum == 2){
            System.out.println("Milk");
            System.out.println("Onions");
        }else{
            System.out.println("Apples");
            System.out.println("Pineapples");
        }
        System.out.println("---------------------");

        int day = 2; // 1-7 based on mane of the day

        if (day == 1) System.out.println("Monday");
        else if ( day == 2) System.out.println("Tuesday");
        else if ( day == 3) System.out.println("Wednesday");
        else if ( day == 4) System.out.println("Thursday");
        else if ( day == 5) System.out.println("Friday");
        else if ( day == 6) System.out.println("Saturday");

    }

}
