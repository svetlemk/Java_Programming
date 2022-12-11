package day25_constructors;

public class Rectangle { // create a custom class

    public double length, width;// rectangle object

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /*public Rectangle(double length, double width){
        this.length = length; // arguments will be
        this.width = width;   // set to length and
                             // width rectangle object
    }*/
    /*// attributes and actions we need for this class???
                                // each object have different length and width: you need to have an instance
                                // variables

    // actions- we need to calculate the area, instance method too, since they  have different
*/

   /* public void setInfo(double length, double width){ // setInfo works but need to be optimized
        this.length = length; // use this keyword to call the instance variable and assign the argument to it.
        this.width= width;

    }*/

    public double area(){
        return length * width;
    }

    // be able to print area   // we generate toSting method

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area() +
                '}';
    }
}
