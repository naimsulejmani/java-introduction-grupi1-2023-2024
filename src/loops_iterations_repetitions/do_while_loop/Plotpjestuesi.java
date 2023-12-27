package loops_iterations_repetitions.do_while_loop;

import java.util.Scanner;

public class Plotpjestuesi {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje numer:");
        int num = reader.nextInt();
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0)
                System.out.println(i);
        }

        System.out.println(num);
    }
}














