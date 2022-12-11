package day27_Access_Modifier;

public class InstanceInitialisationBlock {

    public String name;
    public int age;
/*
    {
        // can only initialize known data- instance block

        name = "James"; // will be given by default
        age = 10; // all the objects will be given age 10 by default

    }
*/// instance block for the default value
    public static void main(String[] args) {
        InstanceInitialisationBlock obj1 = new InstanceInitialisationBlock("Aaron",25);
        InstanceInitialisationBlock obj2 = new InstanceInitialisationBlock("Ali", 34);

        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }

    public InstanceInitialisationBlock(String name, int age) {
        this.name = name;// contructor
        this.age = age;
    }
}
