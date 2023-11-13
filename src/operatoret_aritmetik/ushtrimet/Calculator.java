package operatoret_aritmetik.ushtrimet;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Shkruaj numerin e pare: ");
        int nr1 = reader.nextInt();

        System.out.print("Shkruaj numerin e dyte: ");
        int nr2 = reader.nextInt();

        System.out.println("Llogaritjet Aritmetike:");
        System.out.println("------------------------");

        System.out.printf("%d + %d = %d%n", nr1, nr2, nr1 + nr2);
        System.out.printf("%d - %d = %d%n", nr1, nr2, nr1 - nr2);
        System.out.printf("%d * %d = %d%n", nr1, nr2, nr1 * nr2);
        System.out.printf("%d / %d = %d%n", nr1, nr2, nr1 / nr2);
        System.out.printf("%d %% %d = %d%n", nr1, nr2, nr1 % nr2);


    }
}













