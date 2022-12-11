package day14_ForLoop_Overloading;

public class MethodOverloadingPractice {

    public static int sum(int n1, int n2) {
        return n1 + n2;
    }

    public static int sum(int n1, int n2, int n3) {
        return sum(n1, n2) + n3;
    }

    public static double sum(double n1, double n2, double n3) {
        return sum(n1, n2, n3);
    }


}
