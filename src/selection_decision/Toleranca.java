package selection_decision;

public class Toleranca {
    public static void main(String[] args) {
        final double TOLERANCE = 0.00001;
        double numri = 1;
        System.out.println(numri);
        numri -= 0.1;
        System.out.println(numri);
        numri -= 0.1;
        System.out.println(numri);
        numri -= 0.1;
        System.out.println(numri);
        numri -= 0.1;
        System.out.println(numri);
        numri -= 0.1;
        System.out.println(numri);
        if (numri == 0.5) {
            System.out.println("I barabarte");
        } else {
            System.out.println("Jo i barabarte");
        }
        if (Math.abs(numri - 0.5) <= TOLERANCE) {
            System.out.println("Numrat jane te barabarte");
        } else {
            System.out.println("Numrat nuk jane te barabarte");
        }
    }
}










