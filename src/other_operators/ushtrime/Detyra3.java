package other_operators.ushtrime;

import java.util.Scanner;

public class Detyra3 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Shkruani numrin e pare: ");
        int nr1 = reader.nextInt();

        System.out.print("Shkruani numrin e dyte: ");
        int nr2 = reader.nextInt();

        nr1 = nr1 ^ nr2;
        nr2 = nr1 ^ nr2;
        nr1 = nr1 ^ nr2;

        System.out.println(nr1);
        System.out.println(nr2);


    }


}
