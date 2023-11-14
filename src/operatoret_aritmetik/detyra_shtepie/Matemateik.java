package operatoret_aritmetik.detyra_shtepie;

import java.util.Scanner;

public class Matemateik {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        System.out.print("shkruaj vleren e a: ");
        double a = reader.nextDouble();
        System.out.print("shkruaj vleren e b: ");
        double b = reader.nextDouble();
        System.out.print("shkruaj vleren e c: ");
        double c = reader.nextDouble();
        System.out.print("shkruaj vleren e d: ");
        double d = reader.nextDouble();
        System.out.print("shkruaj vleren e e: ");
        double e = reader.nextDouble();
        System.out.print("shkruaj vleren e x: ");
        double x = reader.nextDouble();

        double m = (a + b + c + d + e) / (a * Math.pow(x, e - 1))
                - Math.sqrt(Math.pow(a + b * c, 3));

        System.out.printf("Rezultati: %.2f%n", m);


    }
}













