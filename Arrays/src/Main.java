import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Array array=new Array();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nOriginal array:");
        array.displayElements(numbers);

        System.out.println("\nElement at index 3: " + array.getElementAtIndex(numbers, 2));

        System.out.println("\nElements in the array:");
        array.printAllElements(numbers);

        int sum = array.sumArray(numbers);
        System.out.println("\nSum of all elements: " + sum);

        int[] evenPositionElements = array.getElementsAtEvenPositions(numbers);
        System.out.println("\nElements at even positions:");
        array.displayElements(evenPositionElements);

        int[] greaterThanAverage = array.getElementsGreaterThanAverage(numbers);
        System.out.println("\nElements greater than average:");
        array.displayElements(greaterThanAverage);

        array.reverseArray(numbers);
        System.out.println("\nReversed array:");
        array.displayElements(numbers);

        array.swapPairs(numbers);
        System.out.println("\nArray with swapped adjacent elements:");
        array.displayElements(numbers);

        array.bubbleSort(numbers);
        System.out.println("\nSorted array (Bubble Sort):");
        array.displayElements(numbers);



    }

}
