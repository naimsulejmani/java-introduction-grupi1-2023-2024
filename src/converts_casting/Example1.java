package converts_casting;

public class Example1 {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a'; // c = 97
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double rezultati = (f * b) + (i / c) - (d * s);
        System.out.println("f*b = " + (f * b));
        System.out.println("i / c = " + (i / c));
        System.out.println("d * s = " + (d * s));
        System.out.println("Rezultati perfundimtar= " + rezultati);

    }
}
