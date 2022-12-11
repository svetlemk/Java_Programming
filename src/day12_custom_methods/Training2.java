package day12_custom_methods;

public class Training2 {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = new String("Java");
        String s4 = "java";
        System.out.println(str1 == str3);// false
        System.out.println(str1 == str2);// true
        System.out.println(str1.equals(str3));// true
        System.out.println(str3.equals(str4));// true
        System.out.println(str1 == str4);// false
        System.out.println(str1.equals(s4));// false
        System.out.println(str1.equalsIgnoreCase(s4));// true
        System.out.println("---------------");

        String str5 = "abc";
        String str6 = "abc";

        System.out.println("str1==str2 is :" + str5 == str6);//false

        System.out.println("---------------");
        String names = "jim ";
        String greeting = "hello " + names;
        greeting += "good to see you";
        System.out.println(greeting);// hello jim good to see you

        String str = "Cydeo";
        str.concat(" School");
        System.out.println(str);//Cydeo
        str = str.concat(" School");
        System.out.println(str);// Cydeo School

        System.out.println("=====================");

        String ta = "A";
        ta = ta.concat("B"); //AB
        String tb ="C";
        ta = ta + tb;// ABC
        ta.replace('C', 'D');//ABD
        ta = ta +tb; // ABCC
        System.out.println(ta);





    }
}