package selection_decision;

import java.util.Scanner;

public class SwitchExample1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj menyne e aplikacionit: ");
        String menu = reader.nextLine();

        //varibla duhet me qene e tipit char, byte, short, int , String ose Enum
        switch (menu) {
            case "Administration":
                System.out.println("Welcome to Administration menu");
                System.out.println("You can change what you want here");
                break;
            case "Dashboard":
                System.out.println("Welcome to dashboard information menu");
                break;
            default:
                System.out.printf("%s menu doesnt exists or you dont have access!", menu);
                break;
        }


        switch (menu) {
            case "Administration" -> {
                System.out.println("Welcome to Administration menu");
                System.out.println("You can change what you want here");

            }
            case "Dashboard" -> System.out.println("Welcome to dashboard information menu");

            default -> System.out.printf("%s menu doesnt exists or you dont have access!", menu);

        }
    }
}


















