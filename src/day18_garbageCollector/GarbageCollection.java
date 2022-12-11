package day18_garbageCollector;

public class GarbageCollection {
    public static void main(String[] args) {
        String s1 = "Java"; // this object will be eligible for Garbage collector
        s1 = null; // after this line this object becomes unferrenced.

        System.out.println(s1);

        System.out.println("----------------------");

        String str1 = "Python";
        str1 = null;

        str1 = "Cydeo"; // referenced to the new object

        System.out.println(str1);




    }

}
