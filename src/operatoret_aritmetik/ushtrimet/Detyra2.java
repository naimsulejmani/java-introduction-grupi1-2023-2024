package operatoret_aritmetik.ushtrimet;

import java.util.Scanner;

public class Detyra2 {
    public static void main(String[] args) {
        Scanner gola = new Scanner(System.in);
        System.out.print("Sa gola ka dhene BARCELONA: ");
        byte golaBarcelona = gola.nextByte();
        System.out.print("Sa gola ka dhene real madridi: ");
        byte golaRealMadridi = gola.nextByte();
        System.out.println("-----------------------------------------------");
        System.out.println("BARCELONA - real madrid " + golaBarcelona + ":" + golaRealMadridi);
        System.out.printf("BARCELONA - real madrid %d:%d%n", golaBarcelona, golaRealMadridi);
        System.out.println("-----------------------------------------------");

    }
}
