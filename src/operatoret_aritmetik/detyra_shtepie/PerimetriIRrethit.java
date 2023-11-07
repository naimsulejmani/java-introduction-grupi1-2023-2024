package operatoret_aritmetik.detyra_shtepie;

import java.util.Scanner;

public class PerimetriIRrethit {
    //P=2*PI*r
    public static void main(String[] args) {
        final int SHUMEZUESI = 2;
        Scanner reader = new Scanner(System.in);
        System.out.print("jepni rrezen e rrethit ne cm: ");
        double radius = reader.nextDouble();
        double perimeter = SHUMEZUESI * Math.PI * radius;
        System.out.printf("Perimetri i rrethit me rreze %.2fcm eshte: %.2fcm%n",
                radius, perimeter);

    }
}






