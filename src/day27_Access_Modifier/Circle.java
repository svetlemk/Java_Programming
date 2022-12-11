package day27_Access_Modifier;

public class Circle {

    public double radius, diameter; // instance cause it is different
    public static double pi = 3.14;// if more info needed, use block

    public Circle(double radius){
        this.radius = radius;
        diameter = radius * 2;
    }

    public double calcArea(){ // static only accepts statics
        return radius * radius * pi;
    }

    public double calcPerimeter(){
        return 2 * pi * radius;
    }

    public static void printPi(){
        System.out.println("The pi value is: " + pi);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", pi=" + pi +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }

    //we need a constructor to enable to create object




}
/*
Create a class named Circle:

		Attributes:
			radius, diameter, pi

		Add a constructor that can set All the fields (instances)

		Actions:
			calcArea(): returns the area of Circle
			calcPerimeter(): returns the perimeter of Circle
			printPi(): displays PI value
			toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement



 */