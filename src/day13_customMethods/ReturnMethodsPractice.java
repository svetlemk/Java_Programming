package day13_customMethods;


public class ReturnMethodsPractice {

    public static void main(String[] args) {
        System.out.println(isOdd(900));

        System.out.println(isOdd(7879));


    }
    int num = 200;

    public static boolean isOdd(int num) {
       // return (num % 2 != 0) ? true : false;// ternary

        if(num %2 != 0){
            return  true;
        } else{
            return false;}





    }

    public static boolean isEven(int num) {
        return !isOdd(num);
    }

    public static int max(int num1, int num2){
       // return  num1 > num2 ? num1 : num2;// ternary
           if(num1 >num2){
               return num1;
           }else{
           return num2;
           }
    }



}

/*
1. Create a method named isOdd, that can return
true if a number is an odd number, otherwise
returns false


2. Create a method named isEven, that can return
 true if a number is an even number, otherwise
 returns false


3. Create a method named max, that can return
 the maximum number between two numbers


4. Create a method named min, that can return
 the minimum number between two numbers
 */
