package loops_iterations_repetitions.do_while_loop;

import java.util.Scanner;

public class DoWhileExample2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x = 1;
        System.out.println("Enter an integer: ");
        int num = reader.nextInt();

        do {
            x *= num--;
        } while (num >= 1);

        System.out.println("X = " + x);
    }
}











