package selection_decision.detyrat;

import java.util.Scanner;

public class Plotpjestushem1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Shkruaj numrin e pare: ");
        int nr1 = reader.nextInt();

        System.out.print("Shkruaj numrin e dyte: ");
        int nr2 = reader.nextInt();

        if (nr1 % nr2 == 0) {
            System.out.printf("%d eshte i plotpjestushem me %d", nr1, nr2);

        } else {
            System.out.printf("%d nuk eshte i plotpjestueshem me %d", nr1, nr2);
        }
        System.out.println();
        System.out.printf("%d %seshte i plotpjestueshem me %d",
                nr1, (nr1 % nr2 == 0 ? "" : "nuk "), nr2);


    }


}














