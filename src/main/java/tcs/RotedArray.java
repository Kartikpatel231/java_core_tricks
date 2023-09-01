package tcs;

public class RotedArray {
    public static int minElement(int arr[],int low,int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                return mid;
            } else if (arr[mid] < arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                 high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return -1;

    }
    public static void main(String[] args){
        int arr[]={12,13,14,15,2,7,8};
        int min=minElement(arr,0,arr.length);
        if (min != -1) {
            System.out.println("Minimum element found at index: " + min);
            System.out.println("Minimum element value: " + arr[min]);
        } else {
            System.out.println("Minimum element not found in the array.");
        }
    }
}
