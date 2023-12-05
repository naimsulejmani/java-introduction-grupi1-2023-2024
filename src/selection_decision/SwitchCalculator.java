package selection_decision;

import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj numrin e pare: ");
        int nr1 = reader.nextInt();
        System.out.print("Shkruaj numrin e dyte: ");
        int nr2 = reader.nextInt();
        System.out.print("Zgjedh njerin nga operatoret (+,-,/,*,%): ");
        char operator = reader.next().charAt(0);

        switch (operator) {
            case '+' -> System.out.printf("%d + %d = %d", nr1, nr2, nr1 + nr2);
            case '-' -> System.out.printf("%d - %d = %d", nr1, nr2, nr1 - nr2);
            case '*' -> System.out.printf("%d * %d = %d", nr1, nr2, nr1 * nr2);
            case '/' -> System.out.printf("%d / %d = %d", nr1, nr2, nr1 / nr2);
            case '%' -> System.out.printf("%d %% %d = %d", nr1, nr2, nr1 % nr2);
            default -> System.out.println("Nuk keni zgjedhur operator valid!");
        }

    }
}



















