package selection_decision;

import java.util.Scanner;

public class SimpleIf2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje numer: ");
        int number = reader.nextInt();
        if (number < 0)
            number = -number;

        System.out.println(number);
    }
}
