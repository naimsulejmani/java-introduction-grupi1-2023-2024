package other_operators;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj vitin: ");
        int year = reader.nextInt();

        // a eshte viti i plotpjestueshem me 4 por jo me 100
        boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0);

        // a eshte viti i brisht i meparshem ose i plotpjestueshem me 400
        isLeapYear = isLeapYear || (year % 400 == 0);

       // isLeapYear = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));

        System.out.println(isLeapYear);
    }
}


















