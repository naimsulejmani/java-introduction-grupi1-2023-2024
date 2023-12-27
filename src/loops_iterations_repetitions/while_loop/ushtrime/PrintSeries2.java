package loops_iterations_repetitions.while_loop.ushtrime;

import java.util.Scanner;

public class PrintSeries2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int i = 1;
        System.out.print("Shkruani nje vlere n: ");
        int n = reader.nextInt();

        System.out.printf("Nr %15s %15s %n", "Katrori", "Kubi");
        while (i <= n) {
            System.out.printf("%d %15d %15.0f %n", i, i * i, Math.pow(i, 3));
            i++;
        }
    }
}





























