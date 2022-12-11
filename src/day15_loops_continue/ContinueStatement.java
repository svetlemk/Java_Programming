package day15_loops_continue;

public class ContinueStatement {

    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {

            if (i == 4) {
                continue;
            }

            System.out.println(i);
        }

        System.out.println("------");

        for (int i = 0; i < 21; i++) {

            if (i % 2 == 0) { // if it is even
                continue; // skips the number
            }

            for (char k = 'A'; k <= 'G'; k++) {
                if (k == 'B') {
                    continue;
                }

                if (k == 'E') {
                    continue;
                }

                System.out.print(k + " ");

            }


        }


    }
}

