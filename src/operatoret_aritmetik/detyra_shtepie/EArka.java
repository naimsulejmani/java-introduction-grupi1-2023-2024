package operatoret_aritmetik.detyra_shtepie;

import java.time.LocalDate;
import java.util.Scanner;

public class EArka {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.print("Shkruaj sa 1-centshe i keni: ");
        int cent1 = user.nextInt();
        System.out.print("Shkruaj sa 2-centsha i keni: ");
        int cent2 = user.nextInt();
        System.out.print("Shkruaj sa 5-centsha i keni: ");
        int cent5 = user.nextInt();
        System.out.print("Shkruaj sa 10-centsha i keni: ");
        int cent10 = user.nextInt();
        System.out.print("Shkruaj sa 20-centsha i keni: ");
        int cent20 = user.nextInt();
        System.out.print("Shkruaj sa 50-centsha i keni: ");
        int cent50 = user.nextInt();
        System.out.print("Shkruaj sa 1 Euro monedha i keni: ");
        int euro1 = user.nextInt();
        System.out.print("Shkruaj sa 2 Euro monedha i keni: ");
        int euro2 = user.nextInt();

        System.out.println("__________________________________________");

        System.out.printf("1 centshe:   %5d %15.2f EUR %n", cent1, cent1 * 0.01);
        System.out.printf("2 centshe:   %5d %15.2f EUR %n", cent2, cent2 * 0.02);
        System.out.printf("5 centshe:   %5d %15.2f EUR %n", cent5, cent5 * 0.05);
        System.out.printf("10 centshe:  %5d %15.2f EUR %n", cent10, cent10 * 0.10);
        System.out.printf("20 centshe:  %5d %15.2f EUR %n", cent20, cent20 * 0.20);
        System.out.printf("50 centshe:  %5d %15.2f EUR %n", cent50, cent50 * 0.50);
        System.out.printf("1 Euro:      %5d %15.2f EUR %n", euro1, euro1 * 1.00);
        System.out.printf("2 Euro:      %5d %15.2f EUR %n", euro2, euro2 * 2.00);

        System.out.println("__________________________________________");
        double total = cent1 * 0.01 + cent2 * 0.02 + cent5 * 0.05 + cent10 * 0.10
                + cent20 * 0.20 + cent50 * 0.50 + euro1 * 1.00 + euro2 * 2.00;

        System.out.printf("Total: %27.2f EUR %n",total);

        System.out.println("__________________________________________");
        System.out.printf("Date: %32s %n", LocalDate.now());
        System.out.println("__________________________________________");

    }
}

















