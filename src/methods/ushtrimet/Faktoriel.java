package methods.ushtrimet;

import java.util.Scanner;

public class Faktoriel {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("shkruaj nr: ");
        int nr = reader.nextInt();
        long fact = factoriel(nr);
        System.out.println(fact);
    }
    static long factoriel(int n) {
        int fact = 1, i = 1;
        do {
            fact *= i;
            i++;
        } while (i <= n);
        return fact;
    }
}









