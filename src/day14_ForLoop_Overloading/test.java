package day14_ForLoop_Overloading;

public class test {

    public static void main(String[] args) {
        boolean x = true;

        if(x == false){
            System.out.println("1");
        } else if( x == false != true){
            System.out.println("2");
        }else if (x == true){
            System.out.println("3");
        }else if ( x == !false){
            System.out.println("4");
        }


    }
}
