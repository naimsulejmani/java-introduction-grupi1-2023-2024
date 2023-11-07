package operatoret_aritmetik.detyra_shtepie;

import java.util.Scanner;

public class VellimiIKubit {
    public static void main(String[] args) {
        //  V = a * a * a
        // v = a^3
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj brinjen e kubit A: ");
        double side = reader.nextDouble();
        double volume = side * side * side;
        System.out.printf("Vellimi eshte %.2f %n", volume);


    }
}










