package day26_statics;

public class IPhone {
    public static String brand = "Apple"; // static: apple os the same
    public String model; //instance: initialised in the contructor, he will get
    // executed separate;y for each object
    public String color;
    public double price;
    public static String OS = "IOS";// same operating system
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;
    public static boolean isExpensiveToFix = true;

    public IPhone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;

    }


    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    /*  public static void printPhoneInfo(){ // static only accepts static
                System.out.println("model " + model);
            }*/
    public void printPhoneInfo(){// instance are accessped too
        System.out.println("brand = " + brand);
        System.out.println("model = " + model);
        System.out.println("color = " + color);
        System.out.println("price = " + price);




    }// you have to create object to use instance variables

  //  public static void printOperatingSystem{
   //     System.out.println("Operating system = " + OS);
   // }

}
/*
attributes:
brand:

model:
color
price
OS
madeIn
 */