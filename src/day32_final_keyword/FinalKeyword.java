package day32_final_keyword;

import java.time.LocalDate;

class Student{
    public void language(){
        System.out.println("Java Programming");
    }
}

public class FinalKeyword  extends Student{

    public static void main(String[] args) {

        final char gender = 'M';
        System.out.println(gender);

        //gender = 'F';
        System.out.println(gender);

        System.out.println("------------------");

       final LocalDate dateOfBirth = LocalDate.now();

        System.out.println(dateOfBirth);

       // dateOfBirth = dateOfBirth.plusYears(1);

        System.out.println(dateOfBirth);
        System.out.println("------------------------------");

        new Student().language();
        new FinalKeyword().language();

        System.out.println("---------------------------");

        String name = "James";
       // name = null;

        System.out.println(name);






    }





}
