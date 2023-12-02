package selection_decision.ushtrime;

import java.util.Scanner;

public class Rangu {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Jep nje vlere(prej -10000 deri 10000): ");
        int vlera = reader.nextInt();

        if (vlera >= -10000 && vlera <= 10000) {
            System.out.println("Numri eshte brenda rangut");
        } else {
            System.out.println("Numri nuk eshte brenda rangut");
        }

        System.out.println(vlera >= -10000 && vlera <= 10000
                ? "Numri eshte brenda rangut" : "Numri nuk eshte brenda rangut");

        System.out.printf("Numri %seshte brenda rangut",
                vlera >= -10000 && vlera <= 10000 ? "" : "nuk ");
    }
}














