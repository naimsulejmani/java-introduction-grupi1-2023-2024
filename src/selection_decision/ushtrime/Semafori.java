package selection_decision.ushtrime;

import java.util.Scanner;

public class Semafori {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int a = reader.nextInt();

        if (a == 1) {
            System.out.println("Semafori eshte i kuq");
        } else if (a == 2) {
            System.out.println("Semafori eshte i verdhe");
        } else if (a == 3) {
            System.out.println("Semafori eshte i gjelbert");
        } else if (a == 4) {
            System.out.println("SEmafori eshte duke blinkuar");
        } else {
            System.out.println("Nuk ka rryme!");
        }

    }
}















