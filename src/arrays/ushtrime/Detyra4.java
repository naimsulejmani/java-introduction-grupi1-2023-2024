package arrays.ushtrime;

import java.util.Scanner;

public class Detyra4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Shtyp numrin e rreshtave: ");
        int rreshti = sc.nextInt();
        System.out.println("Shtyp numrin e shtyllave: ");
        int shtylla = sc.nextInt();

        int[][] matrica = new int[rreshti][shtylla];

        for (int row = 0; row < matrica.length; row++) {
            for (int col = 0; col < matrica[row].length; col++) {
                matrica[row][col] = (int) (Math.random() * 10000) + 1;
            }
        }


        for (int row = 0; row < matrica.length; row++) {
            for (int col = 0; col < matrica[row].length; col++) {
                System.out.printf("%5d", matrica[row][col]);
            }
            System.out.println();
        }
        System.out.println();
        for (int row = 0; row < matrica.length; row++) {
            for (int col = 0; col < matrica[row].length; col++) {
                if (row == col) {
                    System.out.printf("%5d", matrica[row][col]);
                } else {
                    System.out.printf("%5s", "");
                }
            }
            System.out.println();
        }

        System.out.println("\n\n Matrica e transponuar");

        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica.length; j++) {
                System.out.printf("%5d", matrica[j][i]);
            }
            System.out.println();

        }

    }

//    public static void printMatrixDiagonal(int[][] matrix) {}
}














