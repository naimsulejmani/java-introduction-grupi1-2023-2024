package loops_iterations_repetitions.jump_statement;

import java.util.Scanner;

public class Ushtrimi1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj nr: ");
        int n = reader.nextInt();

        for (int row = 1; row <= n; row++) {
            char symbol = row % 2 == 1 ? '$' : '*';
            for (int col = 1; col <= row; col++) {
                System.out.printf("%c", symbol);
            }
            System.out.println();
        }
    }
}














