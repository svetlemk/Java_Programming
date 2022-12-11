package day08_ternaries;

public class SwitchIntro {

    public static void main(String[] args) {
        char grade = 'Q';

        /*
        Grade to be compared with
        A : Excellent
        B : Great job
        C : Good job
        D : Passed
        F : Failed
         etc
        */

        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great job");
                break;
            case 'C':
                System.out.println("Good job");
                break;

            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid");
                break;

        }


    }
}
