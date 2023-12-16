package loops_iterations_repetitions.for_loop;

import java.util.Scanner;

public class ForExample2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje numer");
        int n = reader.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}












