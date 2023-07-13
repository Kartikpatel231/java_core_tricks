package JavaQustions;
public class MergeTwoSortedArray {
    public static int[] mergeArray(int arr1[], int arr2[]) {
        int mergedLength = arr1.length + arr2.length;
        int[] mergedArray = new int[mergedLength];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j])
                mergedArray[k++] = arr1[i++];
             else
                mergedArray[k++] = arr2[j++];
        }
        while (i < arr1.length)
            mergedArray[k++] = arr1[i++];

        while (j < arr2.length)
            mergedArray[k++] = arr2[j++];

        return mergedArray;
    }
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = {2, 4, 5};
        int arr[] = mergeArray(arr1, arr2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }
}

