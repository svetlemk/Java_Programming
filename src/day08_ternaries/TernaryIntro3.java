package day08_ternaries;

public class TernaryIntro3 {
    public static void main(String[] args) {
        int score = 150;
        String score1 = (score >= 0 && score <= 100 )?
                (score >= 60)?"Passed":"Failed"
                :"Invalid";

        System.out.println("score1 = " + score1);

        System.out.println("-----------------------");

        int day = 5;
        String dayName = (day >=1 && day <= 7)?
                (day == 1)?"Monday": (day == 2)?"Tuesday": (day ==3 )?"Wednesday" :(day == 4)?"Thursday"
                        : (day == 5 )?"Friday":( day ==6)?"Saturday":"Sunday"
                :"No such a day exists";

        System.out.println(dayName);



    }



}
