package loops_iterations_repetitions.for_loop.detyrat;

import java.util.Scanner;

public class Detyra3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj nje numer: ");
        int n = reader.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("&");
            }
            System.out.println();
        }
    }
}














