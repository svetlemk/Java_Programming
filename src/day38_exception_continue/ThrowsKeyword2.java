package day38_exception_continue;

public class ThrowsKeyword2 {
    public static void main(String[] args) throws InterruptedException {

        method1();
    }

    public static void pauseFor5Seconds() throws InterruptedException {
        Thread.sleep(500);
    }

    public static void method1() throws InterruptedException {
        System.out.println("Hello world");
        pauseFor5Seconds();
        System.out.println("Hello Cydeo");
    }


}
