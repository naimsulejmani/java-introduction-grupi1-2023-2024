package methods.detyrat;

public class Detyra3 {
    public static void main(String[] args) {
        System.out.println(getNumberOfMaxParam(12, 3, 12));
        System.out.println(getNumberOfMaxParam(12, 15, 12));
        System.out.println(getNumberOfMaxParam(12, 3, 16));
    }

    public static int getNumberOfMaxParam(int a, int b, int c) {
        if (a >= b && a >= c) {
            return 1;
        } else if (b > a && b >= c) {
            return 2;
        } else {
            return 3;
        }
    }
}




















