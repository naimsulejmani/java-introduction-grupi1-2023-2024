package loops_iterations_repetitions.do_while_loop;

import java.util.Scanner;

public class TabelaEShumzimit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje numer: ");
        int num = reader.nextInt();
        if (num >= 1 && num <= 10) {
            int i = 1;
            do {
                System.out.printf("%d * %2d = %3d%n", i, num, i * num);
                i++;
            } while (i <= 10);

        } else {
            System.out.println("Nuk pranohen numrat tjere");
        }
    }
}

















