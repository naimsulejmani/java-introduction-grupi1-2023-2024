package methods.detyrat;

public class D1 {
    public static void main(String[] args) {
        System.out.println(getTotal(12, 10));
        int x = getTotal(10, 15);
        System.out.println(x);
        System.out.println(isEven(10));
        System.out.println(isEven(7));
    }

    public static int getTotal(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int number) {
//        if (number % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
        return number % 2 == 0;
    }
}













