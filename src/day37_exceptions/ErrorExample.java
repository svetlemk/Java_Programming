package day37_exceptions;

import java.util.ArrayList;

public class ErrorExample {
    public static void main(String[] args){
        ArrayList<Pizza> pizzas = new ArrayList<>();
        int i = 0;
        while(true){
            System.out.println(++i);
            pizzas.add( new Pizza('S',2,3));
        }
    }// lack or the system resources - error can not be handles.
}
