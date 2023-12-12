package selection_decision.detyrat_extra;

import java.util.Scanner;

public class VijueshmeriaEStudentit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Shkruaj emrin dhe mbiemrin: ");
        String emriMbiemri = in.nextLine();

        System.out.println("Shkruaj numrin e oreve per lende: ");
        int oret = in.nextInt();

        System.out.println("Shkruaj numrin i oreve te ndjekura: ");
        int oretENdjekura = in.nextInt();

        double perqindja = (oretENdjekura * 100.0) / oret;
        if (perqindja >= 50) {
            System.out.println("Studenti lejohet te hyje ne provim!");
            if (perqindja == 100) {
                System.out.println("Studenti ka 10 pike bonus!");
            }
        } else {
            System.out.println("Studenti nuk lejohet te hyje ne provim!");
        }
    }
}
























