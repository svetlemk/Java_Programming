package day30_inheritance.phone_task;

public class TestPhoneObjects {
    public static void main(String[] args) {

IPhone iphone = new IPhone("IPhone 12", "Large","Black", 1200);

Samsung samsung = new Samsung("Galaxy s22", "Medium", "White",590);

Nokia nokia = new Nokia("Brick", "Small","Pink", 50);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

iphone.call(911);
samsung.call(933);
nokia.call(988);

iphone.text(78789);
samsung.call(678);
nokia.call(78989);

        System.out.println("-------------------");

        iphone.faceTime(798799);
        //samsung.faceTime(7897);

        samsung.freeze();

        nokia.selfDefense();


    }
}
