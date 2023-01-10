package day33_abstraction.employee_task;

public class TestEmployeeObjects {

    public static void main(String[] args) {
        //Employee employee = new Employee("Daniel", 23,'F',"H99","QA", 12000);
        // can not create an object in the abstract class, mucst be concrete clas
        Teacher teacher = new Teacher("James", 34, 'M', "M22", "Math teacher", 12000);

        Driver driver1 = new Driver("Lucy", 23, 'F', "A22", "Driverr", 23344);

        Developer developer = new Developer("Pony", 34,'F', "S11","Prorgam", 100000, "Java");

        Tester tester = new Tester("Olena", 32, 'F',"E11","QA tester",23000);

        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(driver1);
        System.out.println(tester);

        tester.work();
        developer.work();
        driver1.work();
        tester.work();
    }
}




