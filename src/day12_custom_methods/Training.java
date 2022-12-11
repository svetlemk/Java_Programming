package day12_custom_methods;

public class Training {

    public static void main(String[] args) {
        String str1 = "Q.E.D";
        String str2 = "Arcturan Megadonkey";
        String str3 = "Sirius Cybernetics Corporation";
        //             012345678901234567890123456789

        System.out.println(str1.substring(2, 4));// E.
        System.out.println(str2.substring(10,14));//egad
        System.out.println(str1.indexOf("D"));// 4
        System.out.println(str1.indexOf(".")); //1
        System.out.println(str2.indexOf("donkey"));//13
        System.out.println(str3.indexOf("X"));//empty -1
        System.out.println(str2 + str3.charAt(17));//Arcturan Megadonkeys
        System.out.println(str3.substring(9,str3.indexOf("e")));//b
        System.out.println(str3.substring(7,12));//Cyber
        System.out.println(str2.toLowerCase().substring(9,13) + str3.substring(18,str3.length() -7));//mega Corp
        System.out.println("======================");

        String str4 = "Frodo Baggins";
        String str5 = "Gandalf the GRAY";
        ///            01234567890123456

        System.out.println(str4.length());// 13
        System.out.println(str4.charAt(7));// a
        System.out.println(str5.charAt(0));//G
        System.out.println(str4.indexOf("o"));//2
        System.out.println(str4.toLowerCase().indexOf("B"));// -1
        System.out.println(str4.substring(4));//o Baggins
        System.out.println(str5.substring(3,14));// dalf the GR
        System.out.println(str5.replace("a","oo"));//Goondoolf the GRAY
        System.out.println(str5.replace("gray","white"));// original
        System.out.println("str4".replace("r","range"));//strange4





    }
}
