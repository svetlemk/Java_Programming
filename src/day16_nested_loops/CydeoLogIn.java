package day16_nested_loops;

import java.util.Scanner;

public class CydeoLogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username:");
        String user_name = input.next();

        System.out.println("Enter your password:");
        String password = input.next();

        if (user_name.equals("Cydeo") && password.equals("WoodenSpoon")) {
            System.out.println("You are logged in");
        } else {

            for (int i = 0; i < 3; i++) { // i : 0,1,2
                if (i != 2) {
                    System.err.println("Incorrect username and password, please" +
                            "re-enter");
                } else {
                    System.err.println("This is your chance, please re-enter your username and password");
                }


                System.out.println("Enter your username:");
                user_name = input.next();

                System.out.println("Enter your password:");
                password = input.next();

                if (user_name.equals("Cydeo") && password.equals("WoodenSpoon")) {
                    // if the user enters valid credential user exits the loop
                    System.out.println("You are now logged in");
                    break; // exit the loop
                }
            }

            if (!(user_name.equals("Cydeo") && password.equals("WoodenSpoon"))) {
                System.err.println("Your account is locked");


            }
            input.close();

        }


    }

    public static void cydeoLogIn(String username, String pass) {
        if(username.equals("Cydeo") && pass.equals("WoodenSpoon")){
            System.out.println("Logged in");
        }else{
            System.out.println("Invalid user name credentials");
        }

    }
}
/*1. Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo
 Application, assume that your credentials are:

                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."

                If the credentials are not matched, the program should allow
                the user to have three attempts to enter correct credentials

                if all three attempts are failed, then print "Your account is lucked."
                */
