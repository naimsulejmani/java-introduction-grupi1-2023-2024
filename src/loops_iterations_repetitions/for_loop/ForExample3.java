package loops_iterations_repetitions.for_loop;

import java.util.Scanner;

public class ForExample3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje numer ");
        int n = reader.nextInt();
        for (int k = 0; k <= n; k++) {
            System.out.printf("%d %20.2f%n", k, 2 * Math.PI * k / n);
        }

    }
}















