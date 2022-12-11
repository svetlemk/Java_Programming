package day27_Access_Modifier;

public class AccessModifiers {
    // variables and methods

    public static int publicData = 200;

    protected static int protectedData = 300;

    static int defaultData = 400; // if there is no access modifier->

    private static int privateData = 500;

    public AccessModifiers(){
        System.out.println("Access modifier of constructor");
    }

    public static void publicMethod(){
        System.out.println("Public");
    }

    protected static void protectedMethod(){
        System.out.println("Protected");
    }

    static void defaultMethod(){
        System.out.println("Default");
    }

    private static void privateMethod(){
        System.out.println("Private");
    }


    public static void main(String[] args) {
        System.out.println(publicData);
        System.out.println(protectedData);
        System.out.println(defaultData);// never visible in different packages.
        System.out.println(privateData);

        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod(); // all accessible



    }


}
