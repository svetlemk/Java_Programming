package day38_exception_continue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {
    public static void main(String[] args) throws  InterruptedException, FileNotFoundException {
        /*
        System.out.println("program1 started");

      try{
          Thread.sleep(5000);
      }catch(InterruptedException e){
          e.printStackTrace();
      }
        System.out.println("Program1 ended");

        System.out.println("-------------");

        System.out.println("Program2 started");

        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Program2 ended");
*/

        System.out.println("program1 started");

        Thread.sleep(5000);

        System.out.println("Program1 ended");

        System.out.println("---------------");

        System.out.println("program2 started");

        Thread.sleep(5000);

        System.out.println("Program2 ended");

        System.out.println("----------------");

        System.out.println("program3 started");

        FileInputStream file = new FileInputStream("hello");
        System.out.println("program3 ended");
    }
}
