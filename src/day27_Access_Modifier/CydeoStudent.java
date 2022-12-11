package day27_Access_Modifier;

public class CydeoStudent {
    public String name;
    public int age;
    public char gender;

    public static String schoolName;
    public static String secretCode;

    public CydeoStudent(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
       // schoolName = "Cydeo"; need to set only one time
    }

    static{
        schoolName = "Cydeo";
        secretCode = "Wooden spoon";
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
