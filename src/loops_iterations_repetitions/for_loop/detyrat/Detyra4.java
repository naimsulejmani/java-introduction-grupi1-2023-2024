package loops_iterations_repetitions.for_loop.detyrat;

import java.util.Scanner;

public class Detyra4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Shruaj numrin e rreshtave: ");
        int rows = reader.nextInt();

        System.out.print("Shkruaj numrin e kolonave: ");
        int cols = reader.nextInt();

        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= cols; col++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}












