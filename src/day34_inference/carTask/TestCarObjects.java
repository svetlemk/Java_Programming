package day34_inference.carTask;

public class TestCarObjects {

    public static void main(String[] args) {

        //Car car1 = new Car("X6","Red", 2020, 45000)
        Honda honda1 = new Honda("Pilot", "Black", 2019, 35000);

        Audi audi1 = new Audi("Q6", "silver", 2020, 60000);

        Tesla tesla = new Tesla("Model Y", "blue", 2022, 60000);

        System.out.println(honda1);
        System.out.println(audi1);
        System.out.println(tesla);
        System.out.println("-------------------------");
        audi1.stop();
        honda1.stop();
        tesla.stop();

        System.out.println("--------------------------------");

        audi1.start();
        honda1.start();
        tesla.start();

        System.out.println("------------------------------");
        audi1.autoPark();
        tesla.autoPilot();

    }
}
