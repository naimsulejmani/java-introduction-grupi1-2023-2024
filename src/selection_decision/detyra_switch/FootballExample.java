package selection_decision.detyra_switch;

import java.util.Scanner;

public class FootballExample {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Shkruani ekipin vendas: ");
        String home = reader.nextLine();
        System.out.print("Shkruani ekipin musafir: ");
        String away = reader.nextLine();
        System.out.print("Shkruani parashikimin tuaj per ndeshjen (1, X, 2): ");
        char result = reader.next().charAt(0);

        switch (result) {
            case '1':
                System.out.printf("%s - %s - Fiton %s", home, away, home);
                break;
            case '2':
                System.out.printf("%s - %s - Fiton %s", home, away, away);
                break;
            case 'x', 'X':
                System.out.printf("%s - %s - Barazim", home, away);
                break;
            default:
                System.out.println("Nuk eshte e mundur kjo prognoze");
                break;
        }
    }
}











