package day24_ArrayList_JavaDateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeIntro {
    public static void main(String[] args) {

        LocalTime starting_time = LocalTime.of(4,34);
        System.out.println(starting_time);

        LocalTime right_now = LocalTime.now();
        System.out.println(right_now);

        System.out.println("-----------------");

        LocalTime time1 = LocalTime.of(23,59);
        System.out.println(time1.plusHours(1));

        time1 = time1.plusMinutes(45);
        System.out.println(time1);




    }







}
