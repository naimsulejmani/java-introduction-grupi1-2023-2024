package selection_decision.detyrat_extra;

import java.util.Scanner;

public class ZanoreBashktingellore {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Shkruaj nje simbol: ");

        char simboli = user.next().charAt(0);

        if ((simboli >= 'a' && simboli <= 'z')
                || (simboli >= 'A' && simboli <= 'Z')) {
            switch (simboli) {
                case 'a', 'e', 'i', 'o', 'y', 'u',
                        'A', 'E', 'I', 'O', 'Y', 'U':
                    System.out.println("Zanore!");
                    break;
                default:
                    System.out.println("Bashktingellore! ");
                    break;
            }
        } else {
            System.out.println("Nuk eshte pjese e alfabetit anglez!");
        }

    }
}












