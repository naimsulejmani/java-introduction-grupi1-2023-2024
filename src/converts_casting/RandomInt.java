package converts_casting;

import java.util.Scanner;

public class RandomInt {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje numer per kufirin e randomit: ");
        final int N = Integer.parseInt(reader.nextLine()); // reader.nextInt();
        double random = Math.random(); // nje numer random prej [0, 1) >=0 dhe <1
        int t = (int) (N * random); // merre pjesen e plote (cast)
        System.out.printf("Numri i rastesishem deri me %d eshte: %d%n", N, t);

    }
}






