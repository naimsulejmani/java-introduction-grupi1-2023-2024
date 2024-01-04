package loops_iterations_repetitions.ushtrimet;

import java.util.Scanner;

public class UshtrimiWhile1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj tekstin: ");
        String text = reader.nextLine();
        System.out.println("Rezultati: ");
        System.out.println("---------------");

        int i = 0;

        while (i < text.length()) {
            System.out.printf("%C %C %n", text.charAt(i), text.charAt(text.length() - 1 - i));
            i++;
        }


    }
}







