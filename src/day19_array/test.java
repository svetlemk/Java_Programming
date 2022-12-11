package day19_array;

public class test {
    public static void main(String[] args) {
        int a = 0;
        
        while(a<=6){
            a += 2; //a(0)+2 =2, a(2) +2 = 4 , a(4) +2 = 6, a(6)+
        }
        System.out.println("a = " + a); //8
        System.out.println("--------------------");

        int j = 7;
        for (int i = 0; i < j-1; i+=2) {
                            //6    //8
            System.out.println(i);  //0 2 4
        }

       // for (int i = 0; i < 5; i--) {
           // System.out.println("hello");// infinite loop

        //5 4321 15
        int z =5;
        for(int k = 5; k > 0; k--) {
            z+=k;

        }
        System.out.println(z +"question 8"); // 5 1 1 1 1 1 = 10

        String s = "Cydeo";

        for (int i = 0; i < s.length(); i+=3) {
            System.out.println(s.charAt(i));// Ce

        }

        int num = 10;

        do{
            num += 5;
        }while(num <15);
        System.out.println(num); //15



    }
    
}
