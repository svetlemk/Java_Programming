package day30_inheritance.phone_task;

public class Nokia extends Phone {


    public Nokia(String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }
    public void selfDefense(){
        System.out.println(getBrand() + " " + getModel() + "can be used for self defense.");
    }


}
