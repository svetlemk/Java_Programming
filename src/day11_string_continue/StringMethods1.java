package day11_string_continue;

public class StringMethods1 {
    public static void main(String[] args) {
        String str1 = "Java Programming";

        str1 = str1.toLowerCase();

        System.out.println(str1);

        String str2 = "hello world";

        str2 = str2.toUpperCase(); //"JAVA PROGRAMMING"
        System.out.println(str2);

        ///------------------------------

        String word = "WoDDEn spooN";

        word.toUpperCase(); // "WOODEN SPOON"

        word.toLowerCase(); // "wooden spoon"

        //------------------------------

        String str4 = "         Cydeo school";
        System.out.println(str4.trim());

        System.out.println("------------------");
        String sentence1 = "today is Sunday and we have Java Class";

        sentence1.indexOf('w');

        System.out.println(sentence1.indexOf('w'));


        String s2 = "Java Python JavaScript Cydeo Python";

        int a3 = s2.indexOf("avaS");

        System.out.println(a3);

        System.out.println("---------------");

        String str5 = "           Cydeo School";

        str5.toUpperCase();
        str5.trim();// remove white spaces
        str5.indexOf(6);// find the index number for whatever character

        String s1 = " I love Java programming";

        System.out.println(s1.indexOf('a'));
        System.out.println(s1.lastIndexOf('a'));

        System.out.println("====================");











    }
}
