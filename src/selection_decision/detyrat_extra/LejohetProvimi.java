package selection_decision.detyrat_extra;

import java.util.Scanner;

public class LejohetProvimi {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruani oret e planifikuara te lendes: ");
        int oretEPlanifikuara = reader.nextInt();
        System.out.print("Shkruani oret qe ju keni ndjekur: ");
        int oretENdjekura = reader.nextInt();

        double percentage = (double) oretENdjekura / oretEPlanifikuara * 100;
        System.out.printf("Lenda eshte ndjekur %.2f%%%n", percentage);

        if (percentage >= 75) {
            System.out.println("Ju plotesoni kushtet per te hyre ne provim!");
        } else {
            System.out.print("A keni arsyje shendetesore per munges(p ose j): ");
            char arsyeja = reader.next().toLowerCase().charAt(0);
            if (arsyeja == 'p')
                System.out.println("I plotesoni kushtet per te hyr ne provim");
            else
                System.out.println("Ju nuk plotesoni kriteret per te hyre ne provim!");
        }

    }
}














