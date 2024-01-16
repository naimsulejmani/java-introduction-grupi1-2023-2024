package methods.detyrat;

import java.util.Scanner;

public class Zanore {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj textin: ");
        String text = reader.nextLine();

        int vowelCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char shkronja = text.charAt(i);
            if (isVowel(shkronja))
                vowelCount++;
        }
        System.out.println("Total Zanore: " + vowelCount);
    }

    public static boolean isVowel(char shkronja) {
        final String ZANORET = "aeoiuyAEOIUY";
        return ZANORET.contains(shkronja + "");
    }
}












