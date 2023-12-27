package loops_iterations_repetitions.do_while_loop;

import java.util.Scanner;

public class DoWhileExample1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please, enter a positive number: ");
        int num;

        do {
            num = reader.nextInt();
            if (num <= 0)
                System.out.println("Input error! Try again!?");
        } while (num <= 0);

        System.out.println("Ma ne fund!");
    }
}












