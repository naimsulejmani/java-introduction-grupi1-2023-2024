package loops_iterations_repetitions.ushtrimet;

import java.util.Scanner;

public class Ushtrimi4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Jep nje tekst: ");
        String text = reader.nextLine().toLowerCase();

        final String ZANORET = "aeoyiu";
        final String PIKSIMET = ".,:;!?";

        int countZanoret = 0;
        int countBashtinglloret = 0;
        int countPiksimi = 0;

        for (int i = 0; i < text.length(); i++) {
            char shkronja = text.charAt(i);
            if (ZANORET.contains(shkronja + "")) {
                countZanoret++;
            } else if (shkronja > 'a' && shkronja <= 'z') {
                countBashtinglloret++;
            } else if (PIKSIMET.contains(shkronja + "")) {
                countPiksimi++;
            }
        }
        System.out.println("-----------------");
        System.out.println("Zanoret: " + countZanoret);
        System.out.println("Bashtinglloret: " + countBashtinglloret);
        System.out.println("Shenjat e piksimit: " + countPiksimi);
        System.out.println("-----------------");


    }
}












