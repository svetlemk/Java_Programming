package day28_encapculation.encapculation;

public class TestEmployeeObject {

    public static void main(String[] args) {
        /*
        Employee employee1 = new Employee();

       employee1.setSalary(2000);
       System.out.println(employee1.getSalary());

       // employee1.setName("         ");
        System.out.println(employee1.getName());*/

        Employee employee1 = new Employee("Lili", 32, 2000,"QA");

        System.out.println(employee1);
    }
}
