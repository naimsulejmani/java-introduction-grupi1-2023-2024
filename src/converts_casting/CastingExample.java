package converts_casting;

public class CastingExample {
    public static void main(String[] args) {
        int i = 123;
        byte b = (byte) i;
        System.out.println(i);
        System.out.println(b);

        i = (int) 2.71828;
        System.out.println(i);
        System.out.println(Math.round(2.71828));
        System.out.println(Math.round(2.1999));
        i = 11 * (int) 0.25;
        System.out.println(i);
        i = (int) (11 * 0.25);
        System.out.println(i);
    }
}



















