package day25_constructors;

public class TestRectangleObjects {
    public static void main(String[] args) {

      /*  Rectangle rectangle1 = new Rectangle();
        rectangle1.setInfo(3,5);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setInfo(4,10);

        Rectangle rectangle3 = new Rectangle();
        rectangle3.setInfo(11,50);*/

        Rectangle rectangle1 = new Rectangle(32,10);
        Rectangle rectangle2 = new Rectangle(3,20);
        Rectangle rectangle3 = new Rectangle(2,5);



        System.out.println(rectangle1);// it is 000 cause we created setInfo method
        System.out.println(rectangle2);
        System.out.println(rectangle3);


    }

}
