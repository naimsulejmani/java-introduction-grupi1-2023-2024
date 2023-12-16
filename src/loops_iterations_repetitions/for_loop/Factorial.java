package loops_iterations_repetitions.for_loop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter an integer: ");
        int n = reader.nextInt();

        int factorial = 1;

        for (int i = n; i >= 1; i--) {
            factorial *= i;
            // factorial = factorial * i;
        }
        System.out.println("factorial is " + factorial);
    }
}















