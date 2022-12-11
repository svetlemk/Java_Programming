package day17_customClass;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Sumaye", 34, 'F', "Manager",769990, "id123");

        Employee employee2 = new Employee();
        employee2.setInfo("Lana",43,'F',"QA Engineer",130000,"R234");

        Employee employee3 = new Employee();
        employee3.setInfo("Alex",29,'M',"Back-end developer", 13000,"E234");

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        employee2.name = "Popka";

        System.out.println(employee2);



    }
}
