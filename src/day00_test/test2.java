package day00_test;

public class test2 {
    public static void main(String[] args) {
        int[] numbers = {20, 30, 25, 35, -16, 60, -100};
        int result = 0;

        for (int each : numbers) {
            if (each % 2 != 0) {
                result += each;
            }
        }
        System.out.println(result);

    }
}
