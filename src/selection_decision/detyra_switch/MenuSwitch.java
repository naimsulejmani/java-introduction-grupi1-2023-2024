package selection_decision.detyra_switch;

import java.util.Scanner;

public class MenuSwitch {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Shkruaj menune e deshiruar : ");

        System.out.println("1-File");
        System.out.println("2-Edit");
        System.out.println("3-View");
        System.out.println("4-Help");
        System.out.println("5-Tools");
        System.out.println("tjeter-exit");

        int menu = reader.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Keni zgjedhur menune File");
                break;
            case 2:
                System.out.println("Keni zgjedhur menune Edit");
                break;
            case 3:
                System.out.println("Keni zgjedhur menune view");
                break;
            case 4:
                System.out.println("keni zgjedhur menune Help");
                break;
            case 5:
                System.out.println("Keni zgjedhur menune Tools");
                break;
            default:
                System.out.println("Exit");
                break;
        }

    }
}



















