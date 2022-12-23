package day31_inheritance.VehicleTask;

public class AirPlane extends Vehicle{

    public AirPlane(String brand, String model, int year, String color, double price) {
        super(brand, model, year, color, price);
    }

    public void fly(){
        System.out.println("Is flying " + getBrand() +" "+ getModel());
    }
}
