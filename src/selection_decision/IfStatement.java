package selection_decision;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Shkruaj nje numer: ");
        int number = user.nextInt(); // int number = 10;

        if (number > 0) {
            System.out.println("Numri eshte pozitive.");
        }
        System.out.println("This statement always will be executed!");
    }
}



















