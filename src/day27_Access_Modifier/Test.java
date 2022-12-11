package day27_Access_Modifier;

public class Test {

    public static void main(String[] args) {

        System.out.println(StaticInitializationBlock.a);
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);

        System.out.println("------------------------");

        System.out.println(AccessModifiers.publicData); // same package accesseble in the same pachage
        System.out.println(AccessModifiers.protectedData); // same package
        System.out.println(AccessModifiers.defaultData); //default is accessible within the same package
        //System.out.println(AccessModifiers.privateData); // private is not accessible within the same package

        new AccessModifiers();

        AccessModifiers.publicMethod();
        AccessModifiers.protectedMethod();
        AccessModifiers.defaultMethod();
       // AccessModifiers.privateMethod();; // private not visible in different class


    }
}
