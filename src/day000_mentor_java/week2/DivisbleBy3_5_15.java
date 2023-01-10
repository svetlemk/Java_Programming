package day000_mentor_java.week2;

public class DivisbleBy3_5_15 {

    public static void main(String[] args) {

    /*    for(int i = 1; i<= 100; i++){
            if(i%5 ==0 && i %3 ==0 && i% 15 ==0){
                System.out.println("Divisible by 15: "+i);
            } else if (i %3 ==0 && i %15!=0){
                System.out.println("Divisible by 3: "+i);
            }else if ( i % 5 == 0 && i % 15  != 0 ){
                System.out.println("Divisible by 5: "+i);
            }*/

        String s1 = "Divisible by 3,5 and 15: ";
        String s2 = "Divisible by 3: ";
        String s3 = "Divisible by 5: ";

        for (int i = 1; i <= 100; i++) {
            if (/*i % 3 == 0 && i % 5 == 0 && */i % 15 == 0) { // automatically disible
                s1 += i +" ";
            } else if (i % 3 == 0) {
                s2 += i +" ";
            } else if (i % 5 == 0) {
                s3 += i +" ";
            }
        }


        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}


/*
Write a program that print number between 1-100 that are divisible by 3, 5 and 15.
if they are divisible by 3, 5, 15 it should be displayed in DivisibleBy15 section
if divisible by 3 but not by 15, in DivisibleBy3 section
if divisible by 5 but not 15, it should be in DivisibleBy5 section

Ex:
output
Divisible by 15 : 15,30 etc
Divisible by 5 : 5,10 etc
Divisible by 3: 3,6,9 etc
 */



