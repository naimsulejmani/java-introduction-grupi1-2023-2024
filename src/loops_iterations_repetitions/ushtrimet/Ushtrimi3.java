package loops_iterations_repetitions.ushtrimet;

import java.util.Scanner;

public class Ushtrimi3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Te shkruhet numri: ");
        int n = reader.nextInt();

        // shko per secilin rresht prej 1 deri ne n
        for (int row = 1; row <= n; row++) {
            // System.out.println(row);
            // per cdo kolone qe niset prej 1 dhe shkon deri tek row
            for (int i = 1; i < row; i++) {
                System.out.printf("%d", i);
            }
            for (int j = row; j >= 1; j--) {
                System.out.printf("%d", j);
            }
            System.out.println();
        }
    }
}
