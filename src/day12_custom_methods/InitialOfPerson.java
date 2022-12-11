package day12_custom_methods;

public class InitialOfPerson {
    public static void main(String[] args) {
        initials("Svetlana", "Noginova");


    }



    // create a method which prints the initials of the person
    public static void initials(String first_name, String last_name ){
        String name = first_name.toUpperCase().substring(0,1);
        String last = last_name.toUpperCase().substring(0,1);
        System.out.println("Initials are: " + name +"."+ last + ".");
        }


}
