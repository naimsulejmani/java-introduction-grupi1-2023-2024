package loops_iterations_repetitions.while_loop;

import java.util.Scanner;

public class SaHereWhile {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Sheno dy numra");
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();
        int count = 0;
        while (num1 >= num2) {
            count++;
            num1 -= num2;
        }
        System.out.println(count);
    }
}

























