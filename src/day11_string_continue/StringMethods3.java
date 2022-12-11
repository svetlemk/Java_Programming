package day11_string_continue;

import java.util.Locale;

public class StringMethods3 {
    public static void main(String[] args) {
        String word = "     ";
        boolean r1 = word.isEmpty();// boolean is empty
        System.out.println("r1 = " + r1);

        // is blank method: true is contains only white spaces

        String word1 = "        ";
        boolean r2 = word1.isBlank();
        System.out.println("r2 = " + r2);

        // equals method comparing the string characters in the string
        // use the above, do not use ==

        String str1 = "Cydeo";
        String str2 = new String("Cydeo");

        System.out.println("do not use this method: " + (str1 == str2));
        System.out.println("Use this method instead: " + str1.equals(str2));

        String str3 = new String("cydeo");

        System.out.println("It is case sensitive; " + str2.equals(str3));
        System.out.println("Is NOT case sensitive: " + str2.equalsIgnoreCase(str3));

        System.out.println("Contains method:");

        String students = "Hasan Naran Sumaye Natalia";

        boolean hasAhmed = students.contains("Ahmed");
        System.out.println("hasAhmed = " + hasAhmed);

        System.out.println("====================");
        System.out.println("Contains method used with toLowecase methods");
        String sentence3 = "My favorite language is Java";
        
        boolean hasJava = sentence3.toLowerCase().contains("java");
        System.out.println("hasJava = " + hasJava);

        System.out.println("====================");

        System.out.println("Starts with a character");

        String name = "Alica, Machael, Angel, Nino";
        boolean l = name.startsWith("A");
        System.out.println(l);

        String url = "www.cydeo,.com";
        boolean isValid = url.startsWith("www");
        System.out.println(isValid);

        boolean isEnding = url.endsWith(".com");
        System.out.println("isEnding = " + isEnding);

        System.out.println("====================");

        String email = "Cydeo@gmail.com";
        boolean isGmail = email.endsWith("gmail.com");
        boolean isHotmail = email.endsWith("hotmail.com");
        boolean isYahoo = email.endsWith("yahoo.com");

        System.out.println("isYahoo = " + isYahoo);
        System.out.println("isHotmail = " + isHotmail);
        System.out.println("isGmail = " + isGmail);




    }
}
