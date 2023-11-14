package operatoret_aritmetik.detyra_shtepie;

import java.util.Scanner;

public class Swap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Shkruaj dy numra me rradhe");
        int nr1 = scanner.nextInt();
        int nr2 = scanner.nextInt();

        int temp;
        temp = nr1;
        nr1 = nr2;
        nr2 = temp;

        System.out.println("Rezultati");
        System.out.println(nr1);
        System.out.println(nr2);

    }
}












