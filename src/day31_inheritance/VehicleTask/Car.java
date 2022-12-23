package day31_inheritance.VehicleTask;

public class Car extends Vehicle {
    public Car(String brand, String model, int year, String color, double price) {
        super(brand, model, year, color, price);
    }

    public void drive(){
        System.out.println("Driving " + getBrand() +" "+ getModel());
    }
}
