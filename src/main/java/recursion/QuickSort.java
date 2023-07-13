package recursion;
import java.util.Arrays;

public class QuickSort {
    // Define partition method to find the partition index
    private static int partition(int arr[], int begin, int end) {
        int pivot = arr[end];  // Select the last element as the pivot
        int i = (begin-1);     // Initialize i to point to the element
                             // before the first element in the subarray

        // Loop through the subarray from begin to end-1
        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {     // If the current element is less
                                       // than or equal to the pivot
                i++;                    // Increment i
                int swapTemp = arr[i];  // Swap arr[i] and arr[j]
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        // Swap arr[i+1] and arr[end] to put the pivot in its correct position
        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;     // Return the partition index
    }

    // Define quickSort method to sort the array using recursion
    public static void quickSort(int arr[], int begin, int end) {
        if (begin < end) {      // If there are at least two elements in the subarray
            int partitionIndex = partition(arr, begin, end);
            // Partition the subarray and get the partition index
            // Recursively sort the two resulting subarrays
            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 4, 2, 5, 3, 6, 9};
        System.out.println("Original Array"+Arrays.toString(arr));
        int size = arr.length;
        int start = 0;
        quickSort(arr, start, size - 1);    // Call quickSort method to sort
        System.out.println("Sorted Array by QuickSort"+Arrays.toString(arr));
    }
}
