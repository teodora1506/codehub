public class MinMax {

    static int findMinimum(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int findMaximum(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int[] calculateSums(int[] arr) {
        int[] result = new int[2];
        int max = findMaximum(arr);
        int min = findMinimum(arr);
        int minSum = 0;
        int maxSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) {
                minSum += arr[i];
            }
        }
        result[0] = minSum;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                maxSum += arr[i];
            }
        }
        result[1] = maxSum;

        return result;
    }

    static void printResult(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 3, 4};
        int[] result = calculateSums(arr);
        printResult(result);
    }
}


