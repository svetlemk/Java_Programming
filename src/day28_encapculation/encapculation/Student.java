package day28_encapculation.encapculation;

public class Student {


    private String name;
    private int age;

    public String getName() {
        if (name == null){
            System.err.println("Name is not set");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {
        boolean hasDigit = false, hasSpecialChar = false;
        for (char each : name.toCharArray()) {
            if(Character.isDigit(each)){
                hasDigit = true;
            }
        }
        if(hasDigit){
            System.err.println("invalid name: "+name);
            System.exit(1);
        }

        this.name = name;
    }

    public int getAge(){
        if(age == 0 || age > 100){
            System.err.println("Age has not be set");
            System.exit(1);
        }
        return age;
    }

    public void setAge(int age){ // writing the data
        if( age < 1 ){
            System.err.println("Invalid age: " + age);
            System.exit(1);
        }
        this.age = age;
    }
}
