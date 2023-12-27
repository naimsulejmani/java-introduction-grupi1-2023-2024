package loops_iterations_repetitions.while_loop.ushtrime;

import java.util.Scanner;

public class Palondrome1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje tekst: ");
        String text = reader.nextLine();
        String reversedText = "";
        int index = text.length() - 1;// shkronja e fundit
        while (index >= 0) {
            reversedText += text.charAt(index);
            index--;
        }
        if (text.equals(reversedText)) {
            System.out.println("Eshte palindrome");
        } else {
            System.out.println("Nuk eshte palindrome");
        }
    }
}











