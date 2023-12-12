package selection_decision.detyrat_extra;

import java.util.Scanner;

public class Qelluar {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Sheno nje numer nga 0-10");
        int numri = reader.nextInt();
        int zari = (int) Math.round(Math.random() * 10);

        if (numri == zari) {
            System.out.println("Urime ja keni qelluar");
        } else {
            System.out.println("Fat herave tjera: " + zari);
        }

        System.out.println(
                numri == zari ? "Urime ja keni qelluar"
                        : "Fat herave tjera: " + zari
        );

    }
}













