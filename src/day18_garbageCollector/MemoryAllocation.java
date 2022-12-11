package day18_garbageCollector;

import day17_customClass.Employee;


public class MemoryAllocation {

    public static void main(String[] args) {

        System.out.println("-------------");

        Employee employee1 = new Employee();
        Employee employee2 = employee1;

        employee1.setInfo("Rehene",23,'M',"Manager",230000,"AC33");
        System.out.println(employee1);
        System.out.println(employee2);

        System.out.println("----------------------");
        String batch1 = new String("Java"); // memory consupmtion
        String bath2 = batch1; //new String("Java");
        String batch3 = batch1;//new String("Java"); // 3 different opbects


        int a = 100; // stack

       Car car1 = new Car();
       //
    }

    public static void method1(){
        int b = 200; // stack
    }

    public static void method2(){
        String c = "Hello world"; // local variable(referencing) === stack
                                 // to a variable in stack and object is == Heap
                      // heap - in the String pool
        String d = new String("Hello world"); // new keyword opens new memory
        //stack       //heap

    }



}

