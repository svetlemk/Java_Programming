package day12_custom_methods;

public class CustomeMethodsWithParameter {
    public static void main(String[] args) {

        evenOrOdd(7);
        oddOrEvenOrZero(890);
        studentGrade(6);

    }
    //this method req numerical parameter and verifies if the number is odd or even

    public static void evenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("number is even: " + number);
        } else {
            System.out.println("number is odd: " + number);
        }
    }

     // Create a method that can check if a person is eligible to buy alcohol.

        public static void oddOrEvenOrZero(int num ){
            if(num % 2 == 0){
                System.out.println("The number " + num + " is even");
            }else if( num % 2 != 0){
                System.out.println("The number " + num + " is odd");
            }else{
                System.out.println("The number " + num + " is zero");
            }
        }



    // Create a method that can calculate a grade of a student

public static void studentGrade(int grade){

        if(grade >= 1 && grade <= 5){
            System.out.println(grade + " is in elementary school");

        }else if (grade >= 6 && grade <= 8){
            System.out.println(grade + " is in middle school");
        }else if (grade >= 9 && grade <= 12){
            System.out.println(grade + " is in high school");
        }

}



}

