package loops_iterations_repetitions.jump_statement;

import java.util.Scanner;

public class Ushtrimi3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje numer: ");
        int n = reader.nextInt();

        if (n >= 1 && n <= 100) {
            int sum = 0;

            for (int x = 0; x <= n; x++) {
                sum += (x - 2);
            }
            System.out.println("Shuma eshte: " + sum);

        } else {
            System.out.println("Numrat nuk jane te rangut prej 1 deri ne 1000!");
        }
    }
}













