package selection_decision.excercise;

import java.util.Scanner;

public class PagaBonusi {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Shkruani pagen");
        double paga = reader.nextDouble();
        System.out.println("Shkruani vitet e sherbimit:");
        int vitetESherbmit = reader.nextInt();

        if (vitetESherbmit >= 5) {
            System.out.printf("bonusi juaj eshte %.2f%n", paga * 0.05);
            System.out.printf("Paga juaj eshte %.2f%n", paga * 1.05);
        } else {
            System.out.println("Nuk i mberrin vitet per bonus");
        }
    }
}














