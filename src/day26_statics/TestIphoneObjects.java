package day26_statics;

public class TestIphoneObjects {

    public static void main(String[] args) {
        IPhone iphone1 = new IPhone("iPhone12","Black", 1200);

        System.out.println(iphone1);
        System.out.println(iphone1.model); // access instances though teh object
        System.out.println(iphone1.color);
        System.out.println(iphone1.price);
        System.out.println("-------------");
        iphone1.printPhoneInfo();// print all

        System.out.println(IPhone.isExpensiveToFix); // static need to be called through class
        System.out.println(iphone1.OS); /// not from the object -->> wrong way


    }
}
