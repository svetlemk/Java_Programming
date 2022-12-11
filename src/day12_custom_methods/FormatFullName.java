package day12_custom_methods;

import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first name:");
        String first_name = input.nextLine().trim();

        System.out.println("Please enter your last name: ");
        String last_name = input.nextLine().trim();

        input.close();

       String name = first_name.substring(0,1).toUpperCase() + first_name.substring(1).toLowerCase();
       String last = last_name.substring(0,1).toUpperCase() + last_name.substring(1).toLowerCase();

        System.out.println(name + " " + last);

/*      Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name:");
        String first_name = input.nextLine();

        System.out.println("Please enter your last name: ");
        String last_name = input.nextLine();

*/





    }
}
/*1. Write a program that asks user to enter first and last names, and then prints the full name

 in regular format (first character in upper case)

	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output:
	                        Cydeo School

 */
