package operatoret_aritmetik.ushtrimet;

import java.util.Scanner;

public class SyprinatETrekendeshit {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Jepni bazen e trekendeshit ne m: ");
        double base = reader.nextDouble();

        System.out.print("Jepni larttesine e trekendeshit ne m: ");
        double height = reader.nextDouble();

        double area = 1/2.0 * base * height;

        System.out.printf("Syprina e trekendeshit eshte: %.3f m^2%n", area );


    }
}






