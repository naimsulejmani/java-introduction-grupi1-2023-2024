package methods.ushtrimet;

public class Slide1Ushtrime {
    public static void main(String[] args) {
        printOk();
        print("Hi!");
        zbritja(2.5, 3.4);
        double rez = deduction(10, 5);
        System.out.println(rez);
        shtypAlfabetin();
        System.out.println();

        shtypAlfabetin(true);
        System.out.println();
        shtypAlfabetin(false);
        System.out.println();
        int rez1 = prodhimiIDyNumrave(2, 34);
        System.out.println(rez1);
        printNumbers(10);
        printNumbers(20);
    }

    public static double deduction(double a, double b) {
        return a - b;
    }

    public static void zbritja(double a, double b) {
        System.out.println(a - b);
    }

    //detyra 1
    public static void printOk() {
        System.out.println("OK");
    }

    //detyra 2
    public static void print(String message) {
        System.out.println(message);
    }

    public static void shtypAlfabetin() {
        char shkronja = 'A';
        while (shkronja <= 'Z') {
            System.out.printf("%c ", shkronja);
            shkronja++;
        }
    }

    static void shtypAlfabetin(boolean printToLowerCase) {
        if (printToLowerCase) {
            for (char shkr = 'a'; shkr <= 'z'; shkr++) {
                System.out.printf("%c ", shkr);
            }
        } else shtypAlfabetin();

    }

    public static int prodhimiIDyNumrave(int x, int y) {
        return x * y;
    }
    static void printNumbers(int n){
        for (int i = 1;i <= n;i++){
            System.out.printf("%d ",i);
        }
        System.out.println();
    }

}






