package loops_iterations_repetitions.debugging_nested;

import java.util.Scanner;

public class ShumaRandom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Shkruaj nje numer: ");
        int nr = input.nextInt();

        int sum = 0;
        for (int i = 1; i<=nr; i++){
            int random = (int) (Math.random()*100+1);
            sum += random;
            System.out.printf(" %d  ", random);
        }
        System.out.printf("\n\nShuma e numrave random eshte: %d ", sum);
    }
}














