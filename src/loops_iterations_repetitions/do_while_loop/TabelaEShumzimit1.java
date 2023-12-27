package loops_iterations_repetitions.do_while_loop;

import java.util.Scanner;

public class TabelaEShumzimit1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje numer: ");
        int num = reader.nextInt();
        if (num >= 1 && num <= 10) {
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %2d = %3d%n", i, num, i * num);
            }

        } else {
            System.out.println("Nuk pranohen numrat tjere");
        }
    }
}

















