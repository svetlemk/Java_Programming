package day25_constructors;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DayTimeFormatterIntro {
    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern(" EEE, MM/dd/y");

        LocalDate today = LocalDate.now();
        System.out.println(today.format(df));
        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime time1 = LocalTime.of(17,5);
        System.out.println(time1.format(df1));

        System.out.println(df1);

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh: mm a");

        LocalTime time11 = LocalTime.of(7,7);

        System.out.println(time11.format(tf)); //
    }

}
