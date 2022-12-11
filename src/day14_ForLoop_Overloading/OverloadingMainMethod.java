package day14_ForLoop_Overloading;

public class OverloadingMainMethod {

    public static void main(String[] args) {/// ony one method get executed. The first came from the library
        System.out.println("A");
    }

    public static void main(int[] args) {// fake method, created by user
        System.out.println("B");
    }

    public static void main(double[] args) {
        System.out.println("C");
    }

    public static void main(boolean[] args) {
        System.out.println("D");
    }







}