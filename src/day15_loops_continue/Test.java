package day15_loops_continue;

public class Test {

    public static void main(String[] args) {
        for (char k = 'A'; k <= 'G'; k++) {
            if (k == 'B'){
                continue;
            }

            if(k == 'E'){
                continue;
            }
            System.out.print(k + " ");

        }
    }
}
