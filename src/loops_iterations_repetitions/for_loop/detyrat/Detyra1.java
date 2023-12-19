package loops_iterations_repetitions.for_loop.detyrat;

import java.util.Scanner;

public class Detyra1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Shkruaj numrin: ");
        int numri = sc.nextInt();

        for (int i = 0; i < numri; i++) {
            System.out.println("**********");
        }
        System.out.println("----------------------------------");
        for (int i = 1; i <= numri; i++) {
            System.out.println("**********");
        }
        System.out.println("-----------------------------");
        for (int i = numri; i > 0; i--) {
            System.out.println("**********");
        }
        System.out.println("-----------------------------");

        for (int i = 1; i <= numri; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            // pasi te perfundon shtypja e yllave shto nje rresht te ri
            System.out.println();
        }
    }
}















