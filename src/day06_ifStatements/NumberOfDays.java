package day06_ifStatements;

public class NumberOfDays {
    public static void main(String[] args) {


    int n = 2;

    boolean has28Days = n == 2;
    boolean has30Days = n == 4 || n == 6 || n == 9 || n == 11;
    boolean has31Days = !has30Days && !has28Days;

    String result = "";

    if(has28Days){
        result = "28 days";
    }

    if(has30Days){
        result ="30 days";
    }

    if(has31Days){
        result ="Has 31 days";
    }

    }
}
