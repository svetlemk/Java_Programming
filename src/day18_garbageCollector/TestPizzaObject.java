package day18_garbageCollector;

public class TestPizzaObject {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();
        pizza1.setInfo('L', 2, 6);

        Pizza pizza2 = new Pizza();
        pizza2.setInfo('s',3,2);

        System.out.println(pizza1);
        System.out.println(pizza2);

        System.out.println("----------------------");

        double total= 0;
        
        for (int i = 0; i < 20; i++) {
            Pizza small = new Pizza();
            small.setInfo('l',3,2);
            total += small.calcCost();

            
            Pizza medium = new Pizza();
            medium.setInfo('m',2,2);
            total += medium.calcCost();

            Pizza large = new Pizza();
            large.setInfo('s',1,3);
            total += large.calcCost();
            
        }

        System.out.println("total = " + total);





    }

}
