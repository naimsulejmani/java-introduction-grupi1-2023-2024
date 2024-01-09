package loops_iterations_repetitions.debugging_nested;

import java.util.Scanner;

public class UsaTaxes {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj te hyrat ne $:");
        double income = reader.nextDouble();
        double taxPercentage = 0.0;
        if (income < 0) {
            System.out.println("Ty veq met tmyte!");
        } else {
            if (income < 47_450) {
                taxPercentage = 0.22;
            } else if (income < 114_650) {
                taxPercentage = 0.25;
            } else if (income < 174_700) {
                taxPercentage = 0.28;
            } else if (income < 311_950) {
                taxPercentage = 0.33;
            } else {
                taxPercentage = 0.35;
            }
            System.out.printf("Tatimi: %.2f %%%n", taxPercentage * 100);
            System.out.printf("Vlera e tatimit: %.2f $%n", income * taxPercentage);
            System.out.printf("Vlera e mbetur: %.2f $%n",
                    income - income * taxPercentage);

        }

    }
}














