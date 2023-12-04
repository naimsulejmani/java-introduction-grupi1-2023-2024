package selection_decision.detyrat;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj piket: ");
        float piket = reader.nextFloat();

        if (piket < 0) {
            System.out.println("ti sje per shkolle");
        } else if (piket >= 0 && piket < 50) {
            System.out.println("nota 5");
        } else if (piket >= 50 && piket < 60) {
            System.out.println("nota 6");
        } else if (piket >= 60 && piket < 70) {
            System.out.println("nota 7");
        } else if (piket >= 70 && piket < 80) {
            System.out.println("nota 8");
        } else if (piket >= 80 && piket < 90) {
            System.out.println("nota 9");
        } else if (piket >= 90 && piket <= 100) {
            System.out.println("nota 10");
        } else {
            System.out.println("gjeni bre");
        }
    }
}















