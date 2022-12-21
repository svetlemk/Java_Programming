package day30_inheritance.phone_task;

public class IPhone extends Phone {

 /*   public IPhone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }*/
    public static boolean hasApplePay = true;


    public IPhone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }

    public void faceTime(long phoneNumber){
        System.out.println(getModel() + " is calling using " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(getModel() + " is facetime calling you using " + email);
    }


}
