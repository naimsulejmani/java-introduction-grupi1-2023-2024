package operatoret_aritmetik.ushtrimet;

import java.util.Scanner;

public class Detyra3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Ekipi vendas: ");
        String ekipiVendas = reader.nextLine();

        System.out.print("Ekipi musafir: ");
        String ekipiMusafir =reader.nextLine();

        System.out.print("Numri i tifozeve: ");
        int numriTifozeve = reader.nextInt();

        reader.nextLine(); //
        System.out.print("Fusha/Arena: ");
        String fusha = reader.nextLine();

        System.out.printf("Sa gola ka shenuar %s: ", ekipiVendas);
        int golaVendas = reader.nextInt();

        System.out.printf("Sa gola ka shenuar %s: ", ekipiMusafir);
        int golaMusafir = reader.nextInt();

        System.out.print("Qmimi i biletes: ");
        float qmimiIBiletes = reader.nextFloat();

        System.out.println("-------------------------------------------------");
        System.out.println("Rezultati perfundimtare");
        System.out.printf("%s - %s  %d - %d%n", ekipiVendas, ekipiMusafir, golaVendas, golaMusafir);
        System.out.printf("Stadiumi %s me gjithsej %d spektatore prezent%n", fusha, numriTifozeve);
        System.out.printf("Fitimet nga shitja e biletave eshte: %.2f%n", qmimiIBiletes * numriTifozeve);
        System.out.println("-------------------------------------------------");



    }
}







