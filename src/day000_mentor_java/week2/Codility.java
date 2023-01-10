package day000_mentor_java.week2;

public class Codility {
    public static void solution(int n) {
       if(n<=0){
            System.err.println(n+ " is not a valid number, can not be negative or zero");
            System.exit(1);
        }

        String result = "";
        for(int i = 1;i <=n ; i++ ){
            if(i%2 ==0& i%3 == 0 && i%5 ==0){
                result += "CodilityTestCoders\n";
            }
            else if(i%2 ==0 && i%3 == 0){
                result += "CodilityTest\n";
            }
            else if(i%2 ==0&&  i%5 ==0){
                result += "CodilityCoders\n";
            }
            else if(i%3 ==0&& i%5 == 0){
                result += "TestCoders\n";
            }
            else if(i%2 ==0){
                result += "Codility\n";
            }
            else if(i%3 ==0){
                result += "Test\n";
            }
            else if(i%5 ==0){
                result += "Coders\n";
            }
            else result+= i +"\n";

        }
        System.out.println(result);


    }


    public static void main(String[] args) {
        solution(40);
    }
}


/*
Numbers- print consecutive numbers:

write a function:
that is given a positive integer N, print the consecutive numbers from 1 to n, each one on a separate line
However any numbers divisible by 3,5 and 5 should be replaced with word Codility, Test or Coders respectively.
If a number is divisible by more than one of the numbers; 2,3,5, it should be replaced by the concatenation of the
3 respective words.

output:
1
Codility
Test
Codility
Coders
CodilityTest

etc
 */
