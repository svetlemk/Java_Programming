package day04_concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        String name = "Aaron Kissinger",
                streetName = "Legacy Circle,",
                city = "Fairfax",
                state = "VA";
        int zipcode = 22030,
                buildingNumber = 1361;

        System.out.println("Your Shipping address" +
                " is:\n\t"+ name + "\n\t"+ buildingNumber + "" +
                " " +streetName + " \n\t" + city + " " + state + " " + zipcode);
    }
}
/*
Declare the following variables:
1. name
2. buildingNumber 3. streetName
4. city
5. state
6. zipCode
Use concatenation to print the full shipping address Ex:
Your Shipping address is:
Aaron Kissinger 13621A Legacy Circle Fairfax, VA 22030


 */