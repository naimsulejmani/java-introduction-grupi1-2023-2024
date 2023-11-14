package operatoret_aritmetik.detyra_shtepie;

import java.util.Scanner;

//ENIS ARIFI
public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Shkruaj 3 me radhe : ");
        int numri1 = input.nextInt();
        int numri2 = input.nextInt();
        int numri3 = input.nextInt();
        final double TOTALI_I_NUMRAVE = 3;
        double average = (numri1 + numri2 + numri3) / TOTALI_I_NUMRAVE;
        System.out.printf("Mesatarja e numrave %d, %d dhe %d eshte %.2f%n",
                numri1, numri2, numri3, average);
    }
}














