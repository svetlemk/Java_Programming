package day24_ArrayList_JavaDateTime;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {
        LocalDate.of(1979, 8, 24);
        LocalDate today = LocalDate.now();

        System.out.println(today);

        System.out.println("----------------------");

        LocalDate birthDay = LocalDate.of(2002, 4, 10);
        System.out.println(birthDay);

        System.out.println("------------------");
        System.out.println(today.getYear());

        System.out.println(today.getDayOfMonth());
        System.out.println(today.getMonthValue());
        System.out.println(today.getMonth());

        System.out.println(today.getDayOfWeek());
        System.out.println(birthDay.getDayOfWeek());

        LocalDate svetaBirthday = LocalDate.of(1990, 1, 14);
        System.out.println(svetaBirthday.getDayOfWeek());

        LocalDate year1 = today.plusYears(1);

        System.out.println(year1);

        System.out.println("-------------------");

        LocalDate graduationDate = LocalDate.of(2024, 10, 10);

        LocalDate threeYearsAfter = graduationDate.plusYears(3);

        System.out.println(threeYearsAfter);
        graduationDate = graduationDate.plusMonths(7);

        System.out.println("-------------------------");
        LocalDate birthday1 = LocalDate.of(1994, 7, 7);
        LocalDate birthday2 = LocalDate.of(1995, 6, 7);
        boolean r1 = birthday1.isEqual(birthday2);
        System.out.println(r1);

        System.out.println("+++++++++++++++++");

        LocalDate grad_date = LocalDate.of(2023, 1, 1);

        System.out.println(grad_date.isBefore ( LocalDate.now()) );
        System.out.println(grad_date.isAfter ( LocalDate.now()) );

        System.out.println("-----------------------");

        System.out.println( LocalDate.of(2022,6, 20));




    }
}
