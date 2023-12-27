package loops_iterations_repetitions.while_loop;

import java.util.Scanner;

public class WhileSentinel {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0, count = 0, num;
        double average;
        System.out.print("Enter an integer (0 to quit): ");
        num = reader.nextInt();
        //perderisa je i ndryshum prej variables kontrolluese - sentinelit
        while (num != 0) {
            count++;
            sum += num;
            System.out.print("Enter an integer (0 to quit): ");
            num = reader.nextInt();
        }
        average = (double) sum / count;
        System.out.printf("The average is: %.2f%n", average);
    }
}












