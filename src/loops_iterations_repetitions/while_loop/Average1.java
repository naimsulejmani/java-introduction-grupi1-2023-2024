package loops_iterations_repetitions.while_loop;

public class Average1 {
    public static void main(String[] args) {

        int count = 1;
        int sum = 0;

        while (count <= 10) {
            sum += count++;
        }
        double average = sum / 10.0;

        System.out.printf("Average = %.2f%n", average);
    }
}















