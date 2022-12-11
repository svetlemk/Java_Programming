package day06_ifStatements;

public class test6 {
    public static void main(String[] args) {

        boolean X = true;
        boolean Y = !X == false;
        boolean Z = Y;

        if (X) {
            System.out.println("hello");
        }
        if ( Y){
            System.out.println("today");
        }
        if (Z){
            System.out.println("we");
        }
    }
}
