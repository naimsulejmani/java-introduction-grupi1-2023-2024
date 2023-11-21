package other_operators.ushtrime;

import java.util.Scanner;

public class Detyra2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Shtyp numrin: ");
        int numri1 = sc.nextInt();
        System.out.println("Sa bita po zhvendosim: ");
        int bita = sc.nextInt();

        System.out.printf("%d >> %d = %d%n", numri1, bita, numri1 >> bita);
        System.out.printf("%d << %d = %d%n", numri1, bita, numri1 << bita);

    }
}
























