package operatoret_aritmetik.detyra_shtepie;

import java.util.Scanner;

public class Hipotenuza {
    public static void main(String[] args) {
        // c^2 = a^2 + b^2
        // c = sqrt (a^2 + b^2)
        Scanner reader = new Scanner(System.in);

        System.out.print("Shkruani kateten a ne cm: ");
        double sideA = reader.nextDouble();

        System.out.print("Shkruani kateten b ne cm: ");
        double sideB = reader.nextDouble();

        double sideC = Math.sqrt(sideA * sideA + sideB * sideB);
        System.out.printf("Hipotenuza c eshte: %.2f cm %n", sideC);
    }
}









