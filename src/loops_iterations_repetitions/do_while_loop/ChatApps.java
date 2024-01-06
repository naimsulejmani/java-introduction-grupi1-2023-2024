package loops_iterations_repetitions.do_while_loop;

import java.util.Scanner;

public class ChatApps {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String personi1 = "", personi2 = "";

        do {
            System.out.println("Personi 1 :");
            personi1 = reader.nextLine();

            if (personi1.equalsIgnoreCase(personi2)
                    && personi1.equalsIgnoreCase("stop"))
                break;

            System.out.println("Personi 2 : ");
            personi2 = reader.nextLine();
        } while (!personi1.equalsIgnoreCase("Stop")
                || !personi2.equalsIgnoreCase("Stop"));

        System.out.println("Biseda perfundoi! Chat-i u ruajt per procesim te metutjeshem nga adminat!");
    }
}















