package loops_iterations_repetitions.for_loop;

public class NotStandardForLoop {
    public static void main(String[] args) {

        int i = 0; // inicializimi jasht for loop
        for (; i < 10; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println("\n---------------------");
        i = 0;
        for (; i < 10; ) {
            System.out.printf("%d ", i++);
        }

        //endless loop
        for(;;) {
            System.out.println("Nalu more");
        }
    }
}


















