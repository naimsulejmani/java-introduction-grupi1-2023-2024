package selection_decision;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje numer: ");
        int number = reader.nextInt();

        if (number > 0)
            System.out.println("Numri eshte pozitiv");
        else if (number < 0)
            System.out.println("Numri eshte negativ");
        else
            System.out.println("Numri eshte 0");
    }
}











