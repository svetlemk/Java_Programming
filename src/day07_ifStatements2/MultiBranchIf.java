package day07_ifStatements2;

public class MultiBranchIf {
    public static void main(String[] args) {

        int num = 0;
        String result = "";

        if (num > 0 ){
            result = "Positive";
        }
        if (num < 0 ){
            result = "Negative";
        }
        System.out.println("result = " + result);
        System.out.println("--------------------------");

        String result2 = "";

        if (num > 0){ result2 = "Positive2";

        }else if(num < 0){ result2 = "Negative2";

        }else{ result2 = "Zero";

        }
        System.out.println("result2 = " + result2);
    }
}
