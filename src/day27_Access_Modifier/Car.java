package day27_Access_Modifier;

public class Car {// outer class
    public String make, model, color;
    public int year;
    public double price;

    public static int wheels = 4;

    public class CarEngine { // inner class which can access
        // inner class can access outer class
        public void method() {
            System.out.println(make);
            System.out.println(wheels);
        }
    }

    public static class StaticInnerClass { // only accepts static members

        public void method() {
            // System.out.println(make);
            System.out.println(wheels);
        }


    }
}
