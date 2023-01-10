package day34_inference.carTask;

public class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    protected void start() {
        System.out.println("Use voice to start "+getMake()+" "+ getModel());
    }

    public void autoPilot(){
        System.out.println(getMake()+ getModel()+ " has auto pilot feature");
    }
}
