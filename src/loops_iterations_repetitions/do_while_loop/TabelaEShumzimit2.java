package loops_iterations_repetitions.do_while_loop;

import java.util.Scanner;

public class TabelaEShumzimit2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje numer: ");
        int num = reader.nextInt();
        if (num >= 1 && num <= 10) {

            int count = 1;
            while (count <= 10) {
                System.out.printf("%2d * %2d = %3d%n", count, num, count * num);
                count++;
            }

        } else {
            System.out.println("Nuk pranohen numrat tjere");
        }
    }
}

















