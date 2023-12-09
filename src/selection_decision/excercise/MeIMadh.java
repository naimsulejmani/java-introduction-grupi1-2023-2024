package selection_decision.excercise;

import java.util.Scanner;

public class MeIMadh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruaj numrin e pare: ");
        int nr1 = sc.nextInt();

        System.out.print("Shkruaj numrin e dyte: ");
        int nr2 = sc.nextInt();

        if (nr1 >= nr2) {
            System.out.println("Numri me i madh eshte: " + nr1);
        } else {
            System.out.println("Numri me i madh eshte: " + nr2);
        }

        System.out.println(
                nr1 >= nr2
                        ? "Numri me i madh eshte " + nr1
                        : "Numri me i madhe eshte " + nr2);
    }
}









