package day07_ifStatements2;

public class MonthName3 {
    public static void main(String[] args) {
        int n = 2;
        String month = "";

        if(n>=1 && n<=12){
            if(n==1) month = "January";
            else if(n==2) month = "Feb";
            else if(n==3) month = "March";
            else if(n==4) month = "May";
            else if(n==5) month = "April";
            else if(n==6) month = "June";
            else if(n==7) month = "July";
            else if(n==8) month = "Aug";
            else if(n==9) month = "Sept";
            else if(n==10) month = "Oct";
            else if(n==11) month = "Nov";
            else month = "December";

        }else month = "Invalid number";

        System.out.println(month);

    }
}
