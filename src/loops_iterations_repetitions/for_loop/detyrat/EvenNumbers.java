package loops_iterations_repetitions.for_loop.detyrat;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Shkruaj numrin N: ");
        final int N = input.nextInt();
        System.out.println("Numrat cift: ");
        for (int i = 2; i <= N; i += 2) {
            System.out.printf("%d ", i);
        }

        System.out.println("\nNumrat tek: ");
        for (int i = 1; i <= N; i += 2) {
            System.out.printf("%d ", i);
        }

    }
}











