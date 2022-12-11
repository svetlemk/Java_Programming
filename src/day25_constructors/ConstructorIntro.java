package day25_constructors;

public class ConstructorIntro {


    public ConstructorIntro(int i) {
        System.out.println(" Object is created by using dafault constructor");
    }

    public ConstructorIntro(int i, int k) {
        System.out.println(" Object is created by using int argument constructor");

    }


    public void add() { // name it anything as long as you follow the naming rule

    }

    public static void main(String[] args) { // return type is a must
        // specifier is optional, it will become instant if you do not give // static

        ConstructorIntro obj = new ConstructorIntro(10); // constructor-- define explicitly(by programmer) and
        ConstructorIntro obj1 = new ConstructorIntro(120);
        ConstructorIntro obj2 = new ConstructorIntro(222);


    }
}
