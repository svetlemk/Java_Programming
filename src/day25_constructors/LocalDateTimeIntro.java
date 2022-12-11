package day25_constructors;

import java.time.LocalDateTime;

public class LocalDateTimeIntro {
    public static void main(String[] args) {

        LocalDateTime starts = LocalDateTime.now();
        System.out.println(starts);

        LocalDateTime ends = LocalDateTime.of(2023, 5, 18, 11, 23);
        System.out.println(ends);

        System.out.println(starts.getDayOfWeek());

        System.out.println(starts.getHour());

        int[] nums ={1, 2, 3, 4, 5, 6};
        System.out.println(nums[1] + nums[3]);
        //



    }
}
