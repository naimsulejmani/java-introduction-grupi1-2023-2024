package operatoret_aritmetik;

public class PrintFExample {
    public static void main(String[] args) {
        System.out.printf("Hello %s!%n", "Agoni"); //souf - eshte shkurtesa
        System.out.printf("Une jam %s %S dhe i kam %d vjet!%n", "Naim", "Sulejmani", 36);

        System.out.printf("Shkronja %c eshte e tepert! Paguni nga %f EUR per mos me qene!",
                'r', 267.5);

        System.out.printf("%n%nBorxhi juaj ka tejkaluar vleren e %.2f EUR! Ju lutem paguani",
                267.666);

        System.out.printf("%n%n%20s %30s", "Emri", "Mbiemri");
        System.out.printf("%n%20s %30s", "Abdurrahman", "Testeri");

    }
}
