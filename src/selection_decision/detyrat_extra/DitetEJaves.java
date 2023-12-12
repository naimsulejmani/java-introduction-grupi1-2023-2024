package selection_decision.detyrat_extra;

import java.util.Scanner;

public class DitetEJaves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Shkruaj nje numer dhe une te kthej nje dite te javes: ");
        int ditaJaves = sc.nextInt();

        switch (ditaJaves) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Nuk eshte dite e javes");

        }
    }
}














