package day10_string;

import java.util.Scanner;

public class StringMethods1 {
    public static void main(String[] args) {


        String str = "Cydeo";
        // index    : 01234;


        // 5 characters

        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);
        char thirdChar = str.charAt(2);
        char forthChar = str.charAt(3);
        char fifthChar = str.charAt(4);

        System.out.println("firstChar = " + firstChar);
        System.out.println("secondChar = " + secondChar);
        System.out.println("thirdChar = " + thirdChar);
        System.out.println("forthChar = " + forthChar);
        System.out.println("fifthChar = " + fifthChar);

        System.out.println("-----------");

        String sentence = "Java programming language";

        int length = sentence.length();

        System.out.println("length = " + length);// number of characters

        int lastIndex = sentence.length() - 1;// last index, with counts starts with 0

        System.out.println("lastIndex = " + lastIndex);

        String s1 = "Wooden spoon";
        char firstChar1 = s1.charAt(0);
        int lastIndexNum = s1.length() - 1;
        char lastChar2 = s1.charAt(lastIndexNum);

        System.out.println(firstChar1 + " : " + lastChar2);

        System.out.println("------------------------------");

        String name1 = "Murad";
        String name2 = new String("Murad");

        System.out.println(name1 == name2);

        // Use equals Method
        System.out.println(name1.equals(name2));

        System.out.println("-----------------------------");
        String r1 = "Java";
        String r2 = "Java";


        String r3 = new String("Java");

        System.out.println(r1 == r3); // false

        System.out.println(r1.equals(r3));  // true

        System.out.println("-------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("how old are you?");
        int age = input.nextInt();

        System.out.println("Are you a US citizen? yes/no");
        String answer = input.next();

        if(age >= 21 && answer.equals("yes")){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Ineligible to vote");
        }

        
        


    }

}
