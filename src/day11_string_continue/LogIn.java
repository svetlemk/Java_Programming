package day11_string_continue;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String correctName = "Cydeo",
                correctPassword = "WoodenSpoon";

        System.out.println("Enter your username:");
        String user_name = input.next();

        System.out.println("Enter your password:");
        String password = input.next();

        input.close();

        if(user_name.equals(correctName) && password.equals(correctPassword)){
            System.out.println("You are now logged in");

        }else{
            System.err.println("Incorrect username or password. Please try again");
        }




    }
}

/*
2. Create a class named LogIn
			2.1 Ask the user to enter the username & password
			2.2 print "You are now logged in" If user entered valid username and password
				otherwise print the error message "Incorrect username or password. Please try again"

			Note: Assume that the valid credentials are:
						username: Cydeo
						password: WoodenSpoon
 */