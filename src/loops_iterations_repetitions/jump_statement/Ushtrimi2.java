package loops_iterations_repetitions.jump_statement;

import java.util.Scanner;

public class Ushtrimi2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje numer: ");
        int num = reader.nextInt();

        for (int row = 1; row <= num; row++) {
            for (int i = 1; i <= row; i++) {
                int rreshti = num - row;
                System.out.printf("%d ", rreshti);
            }
            System.out.println();
        }
    }
}













