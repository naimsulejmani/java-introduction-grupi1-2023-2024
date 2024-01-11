package methods;

public class MethodSignature {
    public static void main(String[] args) {
        double max1 = max(2.3,3);
        System.out.println(1);
    }

    public static int max(int x, int y) {
        return x > y ? x : y;
    }

    public static long max(long x, int y) {
        return x > y ? x : y;
    }

    public static long max(int x, long y) {
        return x > y ? x : y;
    }

    public static double max(double x, double y) {
        return x > y ? x : y;
    }

    public static int min(int x, int y) {
        return x > y ? x : y;
    }
}













