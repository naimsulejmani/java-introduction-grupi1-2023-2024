package converts_casting;

public class Example2 {
    public static void main(String[] args) {
        byte b;
        int i = 122;
        double d = 105.142;
        System.out.println("Konvertimi i llojit int ne byte: ");
        b = (byte) i;
        System.out.println("i = " + i);
        System.out.println("b = " + b);
        System.out.println("Konvertimi i llojit double ne int: ");
        i = (int) d;
        System.out.println("d = " + d);
        System.out.println("i = " + i);
        System.out.println("Konvertimi i double ne byte: ");
        b = (byte) d;
        System.out.println("d = " + d);
        System.out.println("b = " + b);
    }
}
