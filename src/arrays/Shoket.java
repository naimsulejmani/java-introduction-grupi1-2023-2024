package arrays;

import java.util.Scanner;

public class Shoket {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Sheno gjatesine e vargut");
//        int n = reader.nextInt();
//        reader.nextLine();

        int n = Integer.parseInt(reader.nextLine());
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Sheno emrin e shokut %d: ", i + 1);
            names[i] = reader.nextLine();
        }
        System.out.println("Lista e shokeve");
        System.out.println("__________________");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%d - %s%n", i + 1, names[i]);
        }
    }
}





















