package other_operators.ushtrime;

import java.util.Scanner;

public class Detyra1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Shkruaj nr1: ");
        int nr1 = reader.nextInt();
        System.out.print("Shkruaj nr2: ");
        int nr2 = reader.nextInt();

        System.out.printf("%d & %d = %d%n", nr1, nr2, nr1 & nr2);
        System.out.printf("%d | %d = %d%n", nr1, nr2, nr1 | nr2);


    }

}






