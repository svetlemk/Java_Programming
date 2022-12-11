package day03_variables;

public class PrimitiveDataTypesIntro {
    public static void main(String[] args) {
        // DataType variableName = Data;
       //byte a = "Java"; // compiler error bc byte accepts only integer values (-128 to 127)
       int n = 36_678;
       //byte e = 20.20;
        //byte q = 130; error- byte is out of range
        // price of the car is $76000
        short p = 17500;
        long a = 222333444444555L;
        int s = 100000;// preferred data type
        System.out.println(n);
        System.out.println(a);
        System.out.println(p);
        System.out.println(s);

        // gpa is 3.5
        double gpa = 3.5;
        System.out.println(gpa);

        float gpa2 = 3.5F;

    }
}
