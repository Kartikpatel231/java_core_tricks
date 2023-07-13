package JavaQustions;

public class BinarySearch {
    private static int findSearch(int[] arr, int search) {
        int left = 0; // initialize left pointer to 0
        int right = arr.length - 1; // initialize right pointer to the last index of the array

        while (left <= right) { // continue the loop till left pointer is less than or equal to right pointer
            int mid = left + (right - left) / 2; // calculate the middle index of the array

            if (arr[mid] == search) { // check if the middle element is equal to target
                return mid; // return the middle index
            } else if (arr[mid] < search) { // check if the middle element is less than target
                left = mid + 1; // move the left pointer to the right of middle element
            } else { // if the middle element is greater than target
                right = mid - 1; // move the right pointer to the left of middle element
            }
        }

        return -1; // target not found in the array
    }
    public static void main(String[] args){
        int arr[]=new int[]{1,4,6,7,8,9};
        int search=6;
        int ans=findSearch(arr,search);{
            System.out.println("number present at "+ans);
        }
    }


}
