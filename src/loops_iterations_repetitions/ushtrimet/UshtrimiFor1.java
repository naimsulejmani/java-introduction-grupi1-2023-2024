package loops_iterations_repetitions.ushtrimet;

import java.util.Scanner;

public class UshtrimiFor1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj tekstin: ");
        String text = reader.nextLine();
        System.out.println("Rezultati: ");
        System.out.println("---------------");
        for (int i = 0; i < text.length(); i++) {
//            System.out.print(text.charAt(i) + " " + text.charAt(text.length() - 1 - i));
//            System.out.println();

            System.out.printf("%C %C%n", text.charAt(i), text.charAt(text.length() - 1 - i));
        }


    }

}




















