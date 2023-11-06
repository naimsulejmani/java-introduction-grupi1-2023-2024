package operatoret_aritmetik.ushtrimet;

import java.util.Scanner;

public class LigjiNjutonit {
    public static void main(String[] args) {
        // F = m*a
        double force;
        double a;
        double mass;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jepni vleren e nxitimit te trupit ne m/s: ");
        a = scanner.nextDouble();

        System.out.println("Jepni vleren e mases se trupit ne kg: ");
        mass = scanner.nextDouble();

        force = mass * a;
        System.out.printf("Forca eshte e barabarte me: %.2f N%n", force);
    }
}
