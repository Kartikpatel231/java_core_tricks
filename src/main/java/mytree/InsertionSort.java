package mytree;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 3, 6, 2, 3};
        System.out.println("Orignal Array");
        for (int ans : arr) {
            System.out.print(" " + ans);
        }
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int index = i;
            while (index >= 0 && arr[index - 1] > value) {
                arr[index] = arr[index - 1];
                index--;
            }
            arr[index] = value;
        }
        System.out.println("\n Sorted Array");
        for (int i : arr) {
            System.out.print(" " + i);
        }
    }
}
