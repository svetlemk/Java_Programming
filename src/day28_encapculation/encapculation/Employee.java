package day28_encapculation.encapculation;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private String jobTitle;

    public Employee(String name, int age, double salary, String jobTitle) {
       setName(name);
       setAge(age);
       setSalary(salary);
       setJobTitle(jobTitle);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 16){
            System.err.println("Invalid age " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public String getJobTitle() {
        if(jobTitle.isEmpty()|| jobTitle.isBlank()){
            System.err.println("Job title can not be empty or blank");
            System.exit(1);
        }
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getName() {
        if (name == null) {
            name = "Unknown";
        }
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            System.err.println("Employee name can not empty or blank");
            System.exit(1);
        }
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            System.err.println("salary can not be negative " + salary);
            System.exit(1);
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" +getSalary() +
                ", jobTitle='" + getJobTitle() + '\'' +
                '}';
    }
}
