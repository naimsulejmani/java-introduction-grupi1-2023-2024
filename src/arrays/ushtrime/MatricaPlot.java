package arrays.ushtrime;

public class MatricaPlot {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 5, 4, 3, 7, 8, 9, 10},
                {5, 4, 2, 6, 1, 1},
                {5, 7, 8, 1},
                {9, -5, 3, 1}
        };
        int shuma = matrixSum(matrix);
        System.out.println("Shuma e antareve te matrices eshte e barabarte: " + shuma);
        System.out.printf("Mesatarja e antareve te matrixes eshte: %.2f%n", matrixAverage(matrix));
        System.out.printf("Numri me i vogel ne matrice eshte : %d%n", minValue(matrix));
    }

    public static int matrixSum(int[][] matrix) {
        int sum = 0;
        for (int[] array : matrix) {
            for (int number : array) {
                sum += number;
            }
        }
        return sum;
    }

    public static int countElements(int[][] matrix) {
        int count = 0;
        for (int[] array : matrix) {
            count += array.length;
        }
        return count;
    }

    public static double matrixAverage(int[][] matrix) {
        double sum = matrixSum(matrix);
        int count = countElements(matrix);
        return sum / count;
    }

    public static int minValue(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        //int min = matrix[0][0];
        for (int[] array : matrix) {
            for (int number : array) {
                if (number < min) {
                    min = number;
                }
            }
        }
        return min;
    }


    public static int maxValue(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        //int min = matrix[0][0];
        for (int[] array : matrix) {
            for (int number : array) {
                if (number > max) {
                    max = number;
                }
            }
        }
        return max;
    }
}















