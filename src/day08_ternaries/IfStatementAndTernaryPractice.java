package day08_ternaries;

public class IfStatementAndTernaryPractice {
    public static void main(String[] args) {
        int score = 150;
        String result = "";

        if ( score >= 0 && score <= 100){
            result = (score >= 90)? "A":(score >= 80)?"B"
                    :(score >= 70)?"C":(score >= 60)?"D": "F";

        }else{
            result= "Invalid score";
        }

        System.out.println(result);



    }
}
