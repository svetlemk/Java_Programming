package day37_exceptions;

import day35_polymorphism.transport_task.Car;

public class MultiCatchBlock {
    public static void main(String[] args) {
        System.out.println("Program started");
        Car car = null;
        try{
            car.drive();
        }catch(ArithmeticException e){
            System.out.println("First Catch Block");
            e.printStackTrace();
        }catch(ClassCastException e){
            System.out.println("Second Catch Block");
            e.printStackTrace();
        }catch(NullPointerException e){
            System.out.println("Third Catch Block");
            e.printStackTrace();
        }catch(IndexOutOfBoundsException e){
            System.out.println("Forth Catch Block");
            e.printStackTrace();
        }catch(RuntimeException e){
            System.out.println("Fifth Catch Block");
            e.printStackTrace();
        }

        System.out.println("Program ended");





    }
}
