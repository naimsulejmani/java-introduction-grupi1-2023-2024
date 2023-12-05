package selection_decision.detyra_switch;

import java.util.Scanner;

public class Detyra1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sa eshte gjeresia");
        int width = sc.nextInt();
        System.out.println("Sa eshte gjatesia");
        final int height = sc.nextInt();

        if (width == height) {
            System.out.println("eshte katror");
        } else {
            System.out.println("eshte drejtkendesh");
        }

        System.out.println(width == height ? "eshte katror" : "eshte drejtkendesh");

        //TO COMPLICATED AND DONT DO IT
//        switch (height / width) {
//            case 1:
//                switch (height % width) {
//                    case 0:
//                        System.out.println("Katrore");
//                    default:
//                        System.out.println("Drejtkendesh");
//                }
//                break;
//            default:
//                System.out.println("Drejtkendesh");
//        }

    }
}



















