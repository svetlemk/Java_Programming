package day33_abstraction.employee_task;

import day33_abstraction.employee_task.Employee;

public class Developer extends Employee {

    public Developer(String name, int age, char gender, String id, String jobTitle, double salary, String programmingLanguage) {
        super(name, age, gender, id, jobTitle, salary);
       setProgrammingLanguage(programmingLanguage);

    }

    public void work(){
        System.out.println(getName() + " is coding in " + getProgrammingLanguage());
    }

    private String ProgrammingLanguage;

    public String getProgrammingLanguage() {
        return ProgrammingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        ProgrammingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return super.toString().replace("}","")+
                ", Programming language=" +getProgrammingLanguage()+ "}";

    }
}
