package day14_ForLoop_Overloading;

public class WarmUpTasks {

    public static void main(String[] args) {
        String str3 = combine("java","apple");
        System.out.println(str3);

        System.out.println(sumOf2Numbers(33,345));

        System.out.println( sumOf4Numbers(78,878,89,79));
    }

    public static String combine(String str1, String str2) {
        String result;

       /* if(str1.endsWith(str2.charAt(0)+"")){// if the first string ends with first character of the second string
            result = str1 + str2.substring(1);
        }else{
            result= str1 + str2;
        }*/

        if(str1.charAt(str1.length()-1) == str2.charAt(0)){
            result = str1 +str2.substring(1);
        }else{
            result = str1 +str2;
        }


        return result;
    }

    public static int sumOf2Numbers( int n1, int n2){
        int result = n1 +n2;
        return result;
    }

    public static int sumOf3Numbers(int n1, int n2, int n3){

        return sumOf2Numbers(n1, n2) + n3;
    }

    public static int sumOf4Numbers( int n1, int n2, int n3, int n4){
       // return sumOf3Numbers(n1,n2,n3) + n4;

       // return sumOf2Numbers(n1,n2)+sumOf2Numbers(n3,n4);

        return sumOf2Numbers(sumOf3Numbers(n1,n2,n3) ,  n4);
    }

}


/*
Warmup Tasks:
	Task1:
	    Create a method named combine that can take two string and
	    then add them together and returns it.
        	But if the last letter of the first word and
        	the first letter of the last letter are the same, return that character once.

	        combine("one", "eight")  ==> oneight

	Task 2:
	    1. create a method that can find the sum of two integer numbers
	                method name: sumOf2Numbers

	    2. create a method that can find the sum of three integer numbers
	                method name: sumOf3Numbers

	    3. create a method that can find the sum of four integer numbers
	                method name: sumOf4Numbers

 */