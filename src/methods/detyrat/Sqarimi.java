package methods.detyrat;

import java.util.Scanner;

public class Sqarimi {
    public static void main(String[] args) {
        System.out.println("TEST");
        Sqarimi.kushFitoi();
        kushFitoi();

        Scanner reader = new Scanner(System.in);

        int nr = reader.nextInt();

        Sqarimi obj = new Sqarimi();
        obj.kushMungoi();
    }


    public static void kushFitoi() {
        System.out.println("Barca pat qejf!");
    }

    public void kushMungoi() {
        System.out.println("Olti mungon  kur humb Barcelona!");
    }
}















