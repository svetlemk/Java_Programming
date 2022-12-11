package day27_Access_Modifier;

public class InstanceBlock {

    {
        System.out.println("Instance block");// runs first
    }

    public InstanceBlock(){
        System.out.println("Constructor");// runs second
    }

    public static void main(String[] args) {
        new InstanceBlock(); // create an object - instanceblock runs and teh constructor


    }

}
