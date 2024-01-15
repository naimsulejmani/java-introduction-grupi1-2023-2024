package methods.detyrat;

public class Slide1Ushtrime {
    public static void main(String[] args) {
        printOk();
        printOk();
        printOk();
        print("Urime Real Madridi!!");
        zbritja(10, 7);
        System.out.println(deduction(10, 6));
        double res = deduction(20, 10);
        System.out.println(res);
        shtypAlfabetin();
        System.out.println();
        shtypAlfabetin(true);
        System.out.println();
        shtypAlfabetin(false);
        System.out.println();
        System.out.println(shumezimi(20, 7));
    }

    public static void print(String message) {
        System.out.println(message);
    }

    public static void printOk() {
        System.out.println("OK");
    }

    static void zbritja(double a, double b) {
        System.out.println(a - b);
    }

    public static double deduction(double a, double b) {
        return a - b;
    }

    public static void shtypAlfabetin() {
        char shkronja = 'a';
        while (shkronja <= 'z') {
            System.out.printf("%c ", shkronja++);
        }
    }

    public static void shtypAlfabetin(boolean printToLowerCase) {
        if (printToLowerCase) {
            shtypAlfabetin();
        } else {
            char shkronja = 'A';
            while (shkronja <= 'Z') {
                System.out.printf("%c ", shkronja++);
            }
        }

    }

    public static int shumezimi(int a, int b) {
        return a * b;
    }
}






















