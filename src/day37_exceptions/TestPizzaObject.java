package day37_exceptions;

import day36_polymorphism.Circle;

public class TestPizzaObject {

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza('M', 2, 3);
        Pizza pizza2 = new Pizza('M', 2, 3);

        System.out.println(pizza1 == pizza2);// false since they are different objects

        System.out.println(pizza1.equals(pizza2));// we overidden the equil to method, that is
        // why it is true // eguals accepts everything

        Object obj = new Pizza('S', 4, 3);

        boolean r = obj.equals(pizza2);
        System.out.println(r);

        double total = ((Pizza)obj).calcCost();

        System.out.println(total);
        double area = ((Circle)obj).area();

        System.out.println(area);


    }
}
