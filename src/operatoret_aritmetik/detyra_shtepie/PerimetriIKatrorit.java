package operatoret_aritmetik.detyra_shtepie;

import java.util.Scanner;

public class PerimetriIKatrorit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        final int NR_OF_SIDES = 4;
        //  P = 4 * side

        System.out.print("Jepni brinjen e katrorit: ");
         double side = reader.nextDouble();

         double perimeter = NR_OF_SIDES * side;
        System.out.printf("Perimetri i katrorit me brinjen %.2f eshte: %.2f %n",
                side , perimeter);


    }
}












