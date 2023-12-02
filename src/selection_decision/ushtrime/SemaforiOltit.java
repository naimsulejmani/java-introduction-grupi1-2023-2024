package selection_decision.ushtrime;

import java.util.Scanner;

public class SemaforiOltit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Shkruaj nje numer");
        int num = in.nextInt();
        if (num == 1) {
            System.out.println("Semafori eshte i kuq");
        }
        if (num == 2) {
            System.out.println("Semafori eshte i verdhe");
        }
        if (num == 3) {
            System.out.println("Semafori eshte i gjelbert");
        }
        if (num >= 4) {
            System.out.println("Semafori nuk eshte leshuar");
        }
    }
}
