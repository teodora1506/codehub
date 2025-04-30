import java.util.Scanner;

public class Array {

    public  void displayElements(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private void swapElements(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public  int getElementAtIndex(int[] array, int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        }
       throw  new IndexOutOfBoundsException("Index is out of boundaries: " +index);

    }

    public  void printAllElements(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }

    }

    public  int sumArray(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    public  int[] getElementsAtEvenPositions(int[] array) {
        int count = (array.length + 1) / 2;
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i += 2) {
            result[index++] = array[i];
        }
        return result;
    }

    public  int[] getElementsGreaterThanAverage(int[] array) {
        int sum = sumArray(array);

        double average = (double) sum / array.length;

        int count = 0;
        for (int number : array) {
            if (number > average) count++;
        }

        int[] result = new int[count];
        int index = 0;
        for (int number : array) {
            if (number > average) {
                result[index++] = number;
            }
        }

        return result;
    }

    public int [] reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            swapElements(array, left, right);
            left++;
            right--;
        }
        return array;
    }

    public  void swapPairs(int[] array) {
        for (int i = 0; i < array.length - 1; i += 2) {
            swapElements(array, i, i + 1);
        }
    }

    public  void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swapElements(array, j, j + 1);
                }
            }
        }
    }


}
