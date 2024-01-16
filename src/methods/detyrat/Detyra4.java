package methods.detyrat;

public class Detyra4 {
    public static void main(String[] args) {
        System.out.println(sumInRange(1, 2));
        System.out.println(sumInRange(5, 5));
        System.out.println(sumInRange(10, 20));
    }

    public static int sumInRange(int from, int to) {
        int sum = 0;
        while (from < to) {
            sum += from;
            from++;
        }
        return sum;
    }
}


















