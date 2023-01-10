package day000_mentor_java.week2;

public class SwapMethod {

    public static void SwapNumbers(int x, int y){
        System.out.println("Before swapping: "+x+" "+y);

        x = x +y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping: "+x+" "+y);

    }

    public static void main(String[] args) {
        SwapNumbers(5,9);
    }

}
