package operatoret_aritmetik.ushtrimet;

import java.util.Scanner;

public class SyprinaEKatrorit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Shkruaje brinjen e katrorit: ");
        double side = reader.nextDouble();

        double area = side * side;

        System.out.printf("Syprina e katrorit me brinjen %.2f eshte %.2f %n", side, area );




    }
}
