package loops_iterations_repetitions.for_loop.detyrat;

import java.util.Scanner;

public class Detyra2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj nje numer: ");
        int n = reader.nextInt();

        //for - per cdo rresht
        for (int i = 1; i <= n; i++) {
            //for - per cdo kolone
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}















