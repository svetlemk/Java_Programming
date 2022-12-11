package day16_nested_loops;

public class Initials {
    public static void main(String[] args) {
    String name = "  chuck norris   ";
    name = name.trim().toUpperCase().charAt(0)+"."+ name.trim().toUpperCase().charAt(6)+".";// name = first line of code
   // name += name.charAt(0).charAt(6) + "."// name = second line of code

        System.out.println(name);



    }

}
