package loops_iterations_repetitions.do_while_loop;

import java.util.Scanner;

public class DoWhileExample3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje numer: ");
        int num = reader.nextInt();
        int i = 1;
        do {
            System.out.printf("%d %15d %15d %n", i, i * i, i * i * i);
            i++;
        }while (i <= num);
    }
}














