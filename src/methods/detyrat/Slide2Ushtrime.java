package methods.detyrat;

import java.util.Scanner;

public class Slide2Ushtrime {
    public static void main(String[] args) {
        printNumbers(10);
        printNumbers(20);
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj numrin: ");
        int numri = reader.nextInt();
        printNumbers(numri);
    }

    public static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}












