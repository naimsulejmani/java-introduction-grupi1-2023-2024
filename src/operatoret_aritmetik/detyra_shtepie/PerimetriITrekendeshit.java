package operatoret_aritmetik.detyra_shtepie;

import java.util.Scanner;

public class PerimetriITrekendeshit {
    public static void main(String[] args) {
        // P = a + b + c
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruani brinjen a: ");
        double sideA = reader.nextDouble();

        System.out.print("Shkruani brinjen b: ");
        double sideB = reader.nextDouble();

        System.out.print("Shkruani brinjen c: ");
        double sideC = reader.nextDouble();

        double perimeter = sideA + sideB + sideC;
        System.out.printf("Perimetri i trekendeshit eshte: %.2f %n ", perimeter);
        System.out.println("Perimetri i trekendeshit eshte: " + perimeter);

    }
}









