package selection_decision.excercise;

import java.util.Scanner;

public class SasiaCmimi {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj sasine e deshiruar: ");
        double sasia = reader.nextDouble();

        double njesia = 100;
        double kostoja = sasia * njesia;

        System.out.printf("Sasia:   %20.2f%n", sasia);
        System.out.printf("Qmimi:   %20.2f EUR%n", njesia);
        System.out.printf("Kostoja: %20.2f EUR%n", kostoja);

        if (kostoja > 1000) {
            double zbritja = kostoja * 0.10;
            double kostojaTotale = kostoja - zbritja;
            System.out.printf("Zbritja: %20.2f EUR%n", zbritja);
            System.out.printf("Totali:  %20.2f EUR%n", kostojaTotale);
        } else {
            System.out.printf("Zbritja: %20.2f EUR%n", 0.0);
            System.out.printf("Totali:  %20.2f EUR%n", kostoja);
        }


    }
}



















