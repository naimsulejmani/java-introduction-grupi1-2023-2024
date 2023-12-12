package selection_decision.detyrat_extra;

import java.util.Scanner;

public class Simboli {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Shkruaj nje karakter: ");

        char karakteri = reader.next().charAt(0);

        if (karakteri >= 'a' && karakteri <= 'z') {
            System.out.println("shkronje e vogel");
        } else if (karakteri >= 'A' && karakteri <= 'Z') {
            System.out.println("Shkronje e madhe");
        } else if (karakteri >= '0' && karakteri <= '9') {
            System.out.println("Eshte numer");
        } else {
            System.out.println("Simbol tjeter");
        }
    }
}












