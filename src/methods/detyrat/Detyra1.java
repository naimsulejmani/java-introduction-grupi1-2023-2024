package methods.detyrat;

public class Detyra1 {
    public static void main(String[] args) {
        System.out.println(divide(5000, 2000));
        System.out.println(sign(10));
        System.out.println(sign(-10));
        System.out.println(sign(0));

    }

    public static double divide(long a, long b) {
        return (double) a / b;
    }

    public static int sign(int a) {
        if (a > 0) {
            return 1;
        } else if (a == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}







