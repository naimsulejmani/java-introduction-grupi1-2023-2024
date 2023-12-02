package selection_decision.ushtrime;

import java.util.Scanner;

public class Calculatori {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj numrin e pare: ");
        int nr1 = reader.nextInt();
        System.out.print("Shkruaj numrin e dyt: ");
        int nr2 = reader.nextInt();
        System.out.print("Shkruaj njerin nga operatoret (+,-,*,/,%): ");
        char op = reader.next().charAt(0);

        if (op == '+') {
            System.out.printf("%d %c %d = %d%n", nr1, op, nr2, nr1 + nr2);
        } else if (op == '-') {
            System.out.printf("%d %c %d = %d%n", nr1, op, nr2, nr1 - nr2);
        } else if (op == '*') {
            System.out.printf("%d %c %d = %d%n", nr1, op, nr2, nr1 * nr2);
        } else if (op == '/') {
            if (nr2 != 0) {
                System.out.printf("%d %c %d = %d%n", nr1, op, nr2, nr1 / nr2);
            } else {
                System.out.println("Numri nuk pjestohet me 0");
            }
        } else if (op == '%') {
            if (nr2 != 0) {
                System.out.printf("%d %c %d = %d%n", nr1, op, nr2, nr1 % nr2);
            } else {
                System.out.println("Nuk lejohet pjestimi me 0");
            }
        } else {
            System.out.println("Nuk keni zgjedhur operatorin e duhur");
        }
    }
}
























