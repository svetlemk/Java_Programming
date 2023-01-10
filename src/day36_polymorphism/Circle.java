package day36_polymorphism;

public class Circle {

    private double radius;
    public final static double PI = 3.14;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return radius * radius* PI;
    }

    public double perimeter(){
        return 2 * radius* PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                " ,area=" + area() +
                " ,perimeter=" + perimeter() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

       if( !(obj instanceof Circle) ){ // if as specified object in not ceirle
           // we should not be comparing the,
           System.err.println("Invalid object");
           System.exit(1);
       }
       if(radius == ((Circle)obj).radius){ // if current circle radius is equalt yo
           // given circle radius, then 2 circles are equal/
           return true;
       }
       return false;

    }

}
