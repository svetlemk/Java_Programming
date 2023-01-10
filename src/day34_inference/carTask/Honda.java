package day34_inference.carTask;

public class Honda extends Car{

    public Honda(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start(){
        System.out.println("Use voice control to start " + getMake()+ " "+getModel());
    }

    public void autoPilot(){
        System.out.println(getMake()+ " "+getModel()+" has auto pilot feature.");
    }
}
