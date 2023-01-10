package day32_final_keyword.carTask_methodOverridding;

public class Car {

    private String make,model,color;
    private int year;
    private double price;

    public static int numberOfWheels;
    public static boolean hasBattery;

    public Car(String model, String color, int year, double price) {
        setMake( getClass().getSimpleName() );
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);
    }
    static{
        numberOfWheels = 4;
        hasBattery= true;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year <= 0){
            System.err.println("Invalis year "+ year);
            System.exit(1);
        }
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            System.err.println("Invalid price "+ price);
            System.exit(1);
        }
        this.price = price;
    }

    public void start(){
        System.out.println("Press the brake and twist the key on to ignition to start " + make + model);
    }

    @Override
    public String toString() {
        return getMake()+"{" +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", number of wheels=" + numberOfWheels +
                '}';
    }
}
/*
1. Create a class named Vehicle
			Variables:
				brand, model, year, color, price

			Encapsulate all the fields

			Add a constructor that can set all the fields

			Methods:
				toString()

	2. Create a sub class of Vehicle named Car

			Extra methods:
				drive()

	3. Create a sub class of Vehicle named Bike

			Extra methods:
				ride()

	4. Create a sub class of Vehicle named Boat

			Extra methods:
				sail()

	5. Create a sub class of Vehicle named AirPlane

			Extra methods:
				fly()




this keyword: reffers to the instances. current class

		this. : calls instance variables & instance methods
		this() : calls the constructor


super keyword: refers to the instances. parent class

		super. : calls instance variables & instance methods
		super() :  calls the constructor

 */
