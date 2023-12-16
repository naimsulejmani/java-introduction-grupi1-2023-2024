package loops_iterations_repetitions.for_loop;

public class ForNewYear {
    public static void main(String[] args) throws InterruptedException {
        for (int second = 10; second >= 1; second--) {
            System.out.println(second);
            Thread.sleep(1000);
        }
        System.out.println("Urime Viti i ri me speca turshi!");
    }
}












