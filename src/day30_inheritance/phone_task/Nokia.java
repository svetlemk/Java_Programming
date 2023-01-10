package day30_inheritance.phone_task;

public class Nokia extends Phone {


    public Nokia(String model, String size, String color, double price) {
        super("Nokia", model, size, color, price);
    }
    public void selfDefense(){
        System.out.println(getColor()+ " "+ getBrand() + " " + getModel() + " can be used for self defense.");
    }


}
