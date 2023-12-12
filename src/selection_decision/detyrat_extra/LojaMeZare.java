package selection_decision.detyrat_extra;

import java.util.Scanner;

public class LojaMeZare {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruani numrin te cilin po e luni: ");
        int guess = reader.nextInt();

        int dice1 = (int) (Math.random() * 6) + 1;
        int dice2 = (int) (Math.random() * 6) + 1;

        switch (dice1) {
            case 1:
                System.out.println("Zari 1: \u2680");
                break;
            case 2:
                System.out.println("Zari 1: \u2681");
                break;
            case 3:
                System.out.println("Zari 1: \u2682");
                break;
            case 4:
                System.out.println("Zari 1: \u2683");
                break;
            case 5:
                System.out.println("Zari 1: \u2684");
                break;
            case 6:
                System.out.println("Zari 1: \u2685");
                break;
        }


        switch (dice2) {
            case 1 -> System.out.println("Zari 2: \u2680");
            case 2 -> System.out.println("Zari 2: \u2681");
            case 3 -> System.out.println("Zari 2: \u2682");
            case 4 -> System.out.println("Zari 2: \u2683");
            case 5 -> System.out.println("Zari 2: \u2684");
            case 6 -> System.out.println("Zari 2: \u2685");
        }

        System.out.println("Zari 1: " + (char) (9855 + dice1));
        System.out.println("Zari 2: " + (char) (9855 + dice2));

        if (guess == (dice1 + dice2)) {
            System.out.println("Urime keni fituar");
        } else {
            System.out.println("Fat herave tjera");
        }

    }
}













