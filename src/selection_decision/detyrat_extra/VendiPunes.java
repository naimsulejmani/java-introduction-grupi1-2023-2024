package selection_decision.detyrat_extra;

import java.util.Scanner;

public class VendiPunes {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruani sa vjeq jeni: ");
        int mosha = reader.nextInt();
        System.out.println("Shkruani gjinine(M ose F): ");
        char gjinija = reader.next().charAt(0);
        System.out.println("A jeni te martuar?(P ose J): ");
        char martesa = reader.next().charAt(0);

        switch (gjinija) {
            case 'f', 'F':
                System.out.println("Ju mund te punoni vetem ne zona urbane");
                break;
            case 'm', 'M':
                if ((mosha >= 20) && (mosha <= 40)) {
                    System.out.println("Ju mund te punoni kudoni!");
                } else if ((mosha > 40) && (mosha <= 60)) {
                    System.out.println("Ju duhetv te punoni vetem ne zona urbane!");
                } else {
                    System.out.println("Gabim");
                }
                break;
            default:
                System.out.println("Gabim gjinija!");
                break;
        }


    }
}






