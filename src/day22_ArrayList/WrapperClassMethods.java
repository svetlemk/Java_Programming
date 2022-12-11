package day22_ArrayList;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "20";
        System.out.println(str + 1);

        int num1 = Integer.parseInt(str); // unboxing turns "20" tp 20 int

        System.out.println(num1 + 1);

        Integer num2 = Integer.valueOf(str);

        System.out.println(num2);
        System.out.println("------------------------");

        String s = "20.5";

        double num3 = Double.parseDouble(s);

        Double num4 = Double.valueOf(s);

        System.out.println(num3);
        System.out.println(num4);

        System.out.println("-------------------");

        char ch = '-';

        boolean isDigit = Character.isDigit(ch);
        boolean isLowerCaseLetter = Character.isLowerCase(ch);
        boolean isLetter = Character.isLetter(ch);
        boolean isUpperCase = Character.isUpperCase(ch);
        boolean isSpecialChar = !Character.isLetterOrDigit(ch);

        System.out.println("isDigit = " + isDigit);
        System.out.println("isLetter = " + isLetter);
        System.out.println("isLowerCaseLetter = " + isLowerCaseLetter);
        System.out.println("isUpperCase = " + isUpperCase);
        System.out.println("isSpecialChar = " + isSpecialChar);
        System.out.println("-----------------------");

        String str1 = "a1b2c3d4e5";// extracting digits from string.

        int sum = 0;

        for (char each : str1.toCharArray()) {// call the method that creates array
            if(Character.isDigit(each)){ // and then call for each loop to itirate each char
              sum+=  Integer.parseInt(""+each); // convert back to string cause parse is for
        }                                         // strings only, convert by concating +""

        }

        System.out.println(sum);


    }
}
