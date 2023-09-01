package tcs;
import java.util.Scanner;
public class ArrayOperations {
    //for user input we user Scanner
    Scanner sc = new Scanner(System.in);

    public int[] insertArray(int n) {
        int arr[] = new int[n];
        System.out.println("enter element in array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public int[] deleteElement(int[] arr) {
        int delete = 4;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == delete) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Element not found in the array.");
            return null; // or throw an exception
        }
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        int result[] = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    public int[] updateElement(int[] arr, int index) {
                int update = 9;
                if(index>=0 && index<arr.length){
                arr[index] = update;
            }

        return arr;
    }
    public int[] rotateArray(int[] arr, int rotations) {
        int n = arr.length;

        // Calculate the effective number of rotations (reduce unnecessary rotations)
        rotations = rotations % n;
        if (rotations < 0) {
            rotations = n + rotations;
        }

        // Perform rotation using the Block-Swap algorithm
        reverseArray(arr, 0, n - 1); // Reverse the entire array
        reverseArray(arr, 0, rotations - 1); // Reverse the first part up to rotations
        reverseArray(arr, rotations, n - 1); // Reverse the remaining part

        return arr;
    }

    private void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args){
        ArrayOperations obj=new ArrayOperations();
        System.out.println("enter the size of array : ");
        int n=obj.sc.nextInt();
        int arr[]=obj.insertArray(n);
        System.out.println("Print element using for each loop");
        for(int element:arr){
            System.out.println(element);
        }
        int arr1[]=obj.deleteElement(arr);
        System.out.println("Print element using for each loop");
        for (int element:arr1){
            System.out.println(element);
        }
        int[] arr12 = {1, 2, 3, 4, 5};
        int rotations = 3;
        int[] rotatedArr = obj.rotateArray(arr12, rotations);

// Print the rotated array
        for (int element : rotatedArr) {
            System.out.println(element);
        }


             int arr2[]=obj.updateElement(arr,2);
       System.out.println("Delete element");
          for(int element:arr2){
                System.out.println(element);
            }
        System.out.println("roted an array");
    }
}
