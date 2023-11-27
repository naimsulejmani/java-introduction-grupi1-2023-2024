package selection_decision;

import java.util.Scanner;

public class TwoSort {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Nr1 = ");
        int a = reader.nextInt();
        System.out.println("Nr2 = ");
        int b = reader.nextInt();

        if (b < a) {
            int t = a;
            a = b;
            b = t;
        }
        System.out.println(a);
        System.out.println(b);
    }
}













