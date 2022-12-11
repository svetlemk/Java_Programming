package day27_Access_Modifier;

public class TestNestedClassObjects {

    public static void main(String[] args) {

        Car obj1 = new Car();// car object

        Car.CarEngine obj2 = obj1.new CarEngine(); // inner class CarEngine object
                                // nested class

        Car.StaticInnerClass obj3 = new Car.StaticInnerClass();

    }
}
