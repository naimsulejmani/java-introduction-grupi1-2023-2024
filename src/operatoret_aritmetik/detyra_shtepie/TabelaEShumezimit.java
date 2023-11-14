package operatoret_aritmetik.detyra_shtepie;

import java.util.Scanner;

public class TabelaEShumezimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruaj numrin: ");
        int numri = sc.nextInt();

        System.out.printf("Tabela e shumezimit me %d:%n", numri);
        System.out.println("___________________________________");

        System.out.printf("1       x     %d   =  %6d %n", numri, numri * 1);
        System.out.printf("2       x     %d   =  %6d %n", numri, numri * 2);
        System.out.printf("3       x     %d   =  %6d %n", numri, numri * 3);
        System.out.printf("4       x     %d   =  %6d %n", numri, numri * 4);
        System.out.printf("5       x     %d   =  %6d %n", numri, numri * 5);
        System.out.printf("6       x     %d   =  %6d %n", numri, numri * 6);
        System.out.printf("7       x     %d   =  %6d %n", numri, numri * 7);
        System.out.printf("8       x     %d   =  %6d %n", numri, numri * 8);
        System.out.printf("9       x     %d   =  %6d %n", numri, numri * 9);
        System.out.printf("10      x     %d   =  %6d %n", numri, numri * 10);
        System.out.println("___________________________________");



        //different idea
        System.out.printf("1 %10s %10d =  %10d %n", "x", numri, numri * 1);
        System.out.printf("2 %10s %10d =  %10d %n", "x", numri, numri * 2);
        System.out.printf("3 %10s %10d =  %10d %n", "x", numri, numri * 3);
        System.out.printf("4 %10s %10d =  %10d %n", "x", numri, numri * 4);
        System.out.printf("5 %10s %10d =  %10d %n", "x", numri, numri * 5);
        System.out.printf("6 %10s %10d =  %10d %n", "x", numri, numri * 6);
        System.out.printf("7 %10s %10d =  %10d %n", "x", numri, numri * 7);
        System.out.printf("8 %10s %10d =  %10d %n", "x", numri, numri * 8);
        System.out.printf("9 %10s %10d =  %10d %n", "x", numri, numri * 9);
        System.out.printf("10 %9s %10d =  %10d %n", "x", numri, numri * 10);

        System.out.println("___________________________________");

    }
}













