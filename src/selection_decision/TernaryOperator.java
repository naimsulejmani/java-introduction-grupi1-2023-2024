package selection_decision;

public class TernaryOperator {
    public static void main(String[] args) {
        int age = 17;
        System.out.println(age >= 18 ? "Ke drejte me ble duhan" : "Nuk ke drejte me ble duhan");

        if (age >= 18) {
            System.out.println("Ke drejte me ble duhan");
        } else {
            System.out.println("Nuk ke drejte me ble duhan");
        }

        int pareFalas = age >= 18 ? 500 : 200;

        if (age >= 18) {
            pareFalas = 500;
        } else {
            pareFalas = 200;
        }
        System.out.println(pareFalas);

    }
}

















