package selection_decision.detyrat;

import java.util.Scanner;

public class Paga {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Shkruani pagen: ");
        double paga = reader.nextDouble();

        if (paga < 0) {
            System.out.println("Koke borxh");
        } else if (paga == 0) {
            System.out.println("Pa page");
        } else if (paga <= 80) {
            System.out.println("Social");
        } else if (paga <= 120) {
            System.out.println("Pensioner");
        } else if (paga <= 180) {
            System.out.println("Page minimale");
        } else if (paga <= 300) {
            System.out.println("Page mesatare");
        } else if (paga <= 400) {
            System.out.println("Page e mire");
        } else if (paga <= 600) {
            System.out.println("Page mbi mesataren e mire");
        } else {
            System.out.println("Page e larte");
        }
    }
}








