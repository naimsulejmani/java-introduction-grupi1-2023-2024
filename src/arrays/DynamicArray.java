package arrays;

import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Sa nota doni me i ruajt: ");
        final int N = reader.nextInt();

        int[] notat = new int[N];

        for (int i = 0; i < notat.length; i++) {
            System.out.printf("Shkruaj noten e %d: ", i + 1);
            notat[i] = reader.nextInt();
        }
        System.out.println("-----------------------------");
        System.out.println("Notat e studentit");
        System.out.println("-----------------------------");

        for (int i = 0; i < notat.length; i++) {
            System.out.printf("Nota e %d eshte: %d %n", i + 1, notat[i]);
        }

        System.out.println("-----------------------------");

        double sum = 0;
        for (int i = 0; i < notat.length; i++) {
            sum += notat[i];
        }
        System.out.printf("Mesatarja e notave eshte: %.2f%n", sum / notat.length);
        System.out.println("-----------------------------");


    }
}













