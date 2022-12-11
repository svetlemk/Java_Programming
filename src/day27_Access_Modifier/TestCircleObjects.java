package day27_Access_Modifier;

public class TestCircleObjects {
    public static void main(String[] args) {

        Circle circle1 = new Circle(15);
        Circle circle2 = new Circle(3.5);
        Circle circle3 = new Circle(7);



        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);

        System.out.println(circle1.radius);

        System.out.println(Circle.pi);

    }
}
