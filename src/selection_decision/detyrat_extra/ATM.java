package selection_decision.detyrat_extra;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("ATM MENU:");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit Money");
        System.out.println("3.Withdraw Money");
        System.out.println("4.Transfer Money");
        System.out.println("5.Exit");
        System.out.println("Enter your Choice");
        int choice = reader.nextInt();

        switch (choice){
            case 1 -> System.out.printf("You have chose %s %n","Check Balance");
            case 2 -> System.out.printf("You have chose %s %n","Deposit Money");
            case 3 -> System.out.printf("You have chose %s %n","Withdraw Money");
            case 4 -> System.out.printf("You have chose %s %n","Transfer Money");
            case 5 -> System.out.printf("You have chose %s %n","Exit");
            default -> System.out.println("Ju keni zgjedhur nje menu gabim");
        }





















    }
}
