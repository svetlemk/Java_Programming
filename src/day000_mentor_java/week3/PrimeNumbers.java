package day000_mentor_java.week3;

public class PrimeNumbers {


    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for(int i=2; i<=num/2;i++){
            if (num%i == 0) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        boolean b = isPrime(3);
        System.out.println(b);
    }
}

//https://www.educative.io/answers/how-to-check-if-a-number-is-prime-in-java


/*
write a method that can check
if a number is prime or not
 */
