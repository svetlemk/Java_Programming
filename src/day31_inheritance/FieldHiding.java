package day31_inheritance;

import org.w3c.dom.ls.LSOutput;

class A{
    public int a = 100;
}

public class FieldHiding extends A{

    public int a = 300;

    public static void main(String[] args) {

        System.out.println( new FieldHiding().a);
    }

}
