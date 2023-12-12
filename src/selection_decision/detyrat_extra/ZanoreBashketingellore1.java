package selection_decision.detyrat_extra;

import java.util.Scanner;

public class ZanoreBashketingellore1 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Shkruaj nje simbol: ");

        char simboli = user.next().toLowerCase().charAt(0);

        if ("aeiouy".contains(simboli + "")) {
            System.out.println("Zanore!");
        } else if (simboli >= 'a' && simboli <= 'z') {
            System.out.println("Bashketingellore!");
        } else {
            System.out.println("Nuk eshte pjese e alfabetit anglez");
        }


    }
}















