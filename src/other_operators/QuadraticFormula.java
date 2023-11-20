package other_operators;

import java.util.Scanner;

public class QuadraticFormula {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Shkuraj a: ");
        double a = reader.nextDouble();

        System.out.print("Shkruaj b: ");
        double b = reader.nextDouble();

        System.out.print("Shkruaj c: ");
        double c = reader.nextDouble();

        double discriminant = Math.sqrt(b * b - 4 * a * c);
        double x1 = (-b + discriminant) / (2 * a);
        double x2 = (-b - discriminant) / (2 * a);

        System.out.printf("%.2fX^2 + %.2fx + %.2f = 0%n", a, b, c);

        System.out.printf("x1 eshte e barabarte me %.2f %n", x1);
        System.out.printf("x2 eshte e barabarte me %.2f %n", x2);
    }

}










