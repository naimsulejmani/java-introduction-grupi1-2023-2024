package selection_decision.detyrat;

import java.util.Scanner;

public class Plotpjestushem2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Shkruaj numrin e pare: ");
        int nr1 = reader.nextInt();

        System.out.print("Shkruaj numrin e dyte: ");
        int nr2 = reader.nextInt();

        if (nr1 % nr2 == 0) {
            System.out.printf("%d eshte i plotpjestushem me %d", nr1, nr2);
        } else if (nr2 % nr1 == 0) {
            System.out.printf("%d eshte i plotpjestume me %d", nr2, nr1);
        } else {
            System.out.printf("numrat %d dhe %d nuk jane te plotpjestushem mes veti"
                    , nr1, nr2);
        }
    }
}
