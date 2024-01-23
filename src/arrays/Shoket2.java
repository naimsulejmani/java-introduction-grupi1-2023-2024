package arrays;

import java.util.Scanner;

public class Shoket2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Shtyp vleren e N: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = (int) (Math.random() * 100 + 1);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%4d", numbers[i]);
        }
        System.out.println();
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.printf("%4d", numbers[i]);
        }
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("\n\n sum = " + sum);

    }
}













