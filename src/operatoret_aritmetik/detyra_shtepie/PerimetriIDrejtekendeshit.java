package operatoret_aritmetik.detyra_shtepie;


import java.util.Scanner;

public class PerimetriIDrejtekendeshit {
    public static void main(String[] args) {
        final int NR_OF_PAIR_SIDES = 2;
        // P = 2(l+w)
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj gjatesine e brinjes: ");
        double length = reader.nextDouble();
        System.out.print("Shkruaj gjeresine e brinjes: ");
        double width = reader.nextDouble();
        double perimeter = NR_OF_PAIR_SIDES * (length + width);

        System.out.printf("Perimetri i drejtekendeshit eshte: %.2f %n",
                perimeter);

    }
}











