package arrays.ushtrime;

public class TestArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = {3, 3, 3, 5, 5, 5, 7, 7, 7, 8, 8, 8, 9, 9, 9};
        int[] d = new int[a.length + b.length];
        int dIndex = 0;
        for (int number : a) {
            d[dIndex++] = number;
        }
        for (int number : b) {
            d[dIndex++] = number;
        }
        for (int number : d){
            System.out.printf("%4d", number);
        }
    }

}























