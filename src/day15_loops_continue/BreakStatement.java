package day15_loops_continue;

public class BreakStatement {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i == 6){ // if i value reach 6
                break;   // exits the loop
            }

            System.out.println(i);

        }
        System.out.println("------------------");

        for( char i = 'A'; i <= 'Z'; i++){
            System.out.print(i + " ");

            if( i == 'D'){
                break;
            }
        }


    }


}
