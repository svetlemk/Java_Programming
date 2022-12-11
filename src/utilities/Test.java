package utilities;

import day27_Access_Modifier.AccessModifiers;
import day27_Access_Modifier.Data;

public class Test {
    public static void main(String[] args) {

        System.out.println(Data.d);
        System.out.println(Data.e);
        Data.method3();

        Data obj1 = new Data();

        System.out.println(obj1.a);
        System.out.println(obj1.b);

        obj1.method1();

        System.out.println("---------------------");

        System.out.println(AccessModifiers.publicData);
        // System.out.println(AccessModifiers.protectedData); //is not always accessibale in
        // System.out.println(AccessModifiers.defaultData);
        //System.out.println(AccessModifiers.privateData); // private is not accessible in different packages
        new AccessModifiers();

    }


}
