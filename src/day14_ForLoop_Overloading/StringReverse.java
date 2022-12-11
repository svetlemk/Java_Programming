package day14_ForLoop_Overloading;

public class StringReverse {

    public static void main(String[] args) {

        String str = "Java";
        String reverse = ""; // "avaJ"

        for (int i =str.length()-1; i >=0; i--) {
          reverse +=  str.charAt(i);
        }

        System.out.println(reverse);

        System.out.println(reverse("Hello how are you today"));
    }



    public static String reverse(String str){
        String reverse= "";

        for (int i = str.length()-1; i >=0; i--) {

            reverse +=  str.charAt(i);
        }
            return reverse;

    }


    }
