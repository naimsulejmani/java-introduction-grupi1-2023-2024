package loops_iterations_repetitions.ushtrimet;

import java.util.Scanner;

public class Ushtrimi5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj nje tekst: ");
        String text = reader.nextLine().toLowerCase();

        int dh = 0, ll = 0, nj = 0, sh = 0, xh = 0, zh = 0, rr = 0, th = 0, gj = 0;

        for (int i = 0; i < text.length(); i++) {
            int endIndex = Math.min(i + 2, text.length());
            String subString = text.substring(i, endIndex);
            switch (subString) {
                case "dh" -> { dh++; i++;}
                case "ll" -> { ll++; i++;}
                case "nj" -> { nj++; i++;}
                case "gj" -> { gj++; i++;}
                case "sh" -> { sh++; i++;}
                case "xh" -> { xh++; i++;}
                case "zh" -> { zh++; i++;}
                case "th" -> { th++; i++;}
            }
        }

        System.out.println("--------------------------------");
        System.out.printf("dh: %d%n", dh);
        System.out.printf("ll: %d%n", ll);
        System.out.printf("nj: %d%n", nj);
        System.out.printf("gj: %d%n", gj);
        System.out.printf("sh: %d%n", sh);
        System.out.printf("th: %d%n", th);
        System.out.printf("xh: %d%n", xh);
        System.out.printf("zh: %d%n", zh);
        System.out.println("--------------------------------");

    }
}













