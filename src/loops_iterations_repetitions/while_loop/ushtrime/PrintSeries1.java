package loops_iterations_repetitions.while_loop.ushtrime;

public class PrintSeries1 {
    public static void main(String[] args) {

        int num = 1;

        while (num <= 100) {
            System.out.printf("%d %20d %n", num, num * num);
            num++;
        }


        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d %20d %n", i, i * i);
        }
    }
}








