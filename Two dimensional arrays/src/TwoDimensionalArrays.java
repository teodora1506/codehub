public class TwoDimensionalArrays {


    public static void print2DArray(int[][] array) {
        for (int[] row : array) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public int[][] fillArray(int rows, int cols) {
        int[][] array = new int[rows][cols];
        int value = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = value++;
            }
        }
        return array;
    }

    public static double averageOfRow(int[][] array, int rowIndex) {
        int sum = 0;
        int cols = array[rowIndex].length;
        for (int j = 0; j < cols; j++) {
            sum += array[rowIndex][j];
        }
        return (double) sum / cols;
    }


    public static void printDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][i] + "\t");
        }
        System.out.println();
    }

    public static void printAboveDiagonal(int[][] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        int[][] X = {
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 2, 2, 2},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6}
        };



        System.out.println("1) Štampanje niza:");
        print2DArray(X);

        System.out.println("\n2) Prosek reda 2:");
        System.out.println(averageOfRow(X, 2)); // Output: 3.5

        System.out.println("\n3) Dijagonala:");
        printDiagonal(X); // Output: 1 1 3 4 5 6

        System.out.println("\n4) Iznad dijagonale:");
        printAboveDiagonal(X);
    }
}
