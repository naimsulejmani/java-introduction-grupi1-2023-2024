package other_operators;

public class BitWiseExample {
    public static void main(String[] args) {
        System.out.println(42 & 15);
        System.out.println(42 | 15);
        System.out.println(42 ^ 15);
        byte b = 42;
        System.out.println(~b);
        int numri = 1;
        System.out.println(numri << 1);
        System.out.println(numri << 2);
        System.out.println(numri << 3);

        System.out.println(b << 1);
        System.out.println(b << 2);
        System.out.println(b << 3);
    }
}
