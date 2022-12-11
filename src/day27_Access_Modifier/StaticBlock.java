package day27_Access_Modifier;

import java.security.PublicKey;
import java.sql.SQLOutput;

public class StaticBlock {

    public  StaticBlock(){
        System.out.println("Constructor");
    }
    static{
        System.out.println("Static block");

        new StaticBlock(); // 3 time constuctor gets executed.
        new StaticBlock();
        new StaticBlock();

    }

    public static void main(String[] args) {
        System.out.println("Main method");

    }
}
