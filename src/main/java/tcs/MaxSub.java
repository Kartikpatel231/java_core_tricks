package tcs;

public class MaxSub {
    public static void main(String[] args){
        int arr[] = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = arr[0];   // Initialize maxSum and currentSum
        int currentSum = arr[0];//with the first element of the array

        for (int i = 1; i < arr.length; i++) {
            //maximum of the current element and the sum of
            // the current subarray ending at index i
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            // Update maxSum with the larger of currentSum and the previous maxSum
            maxSum = Math.max(currentSum, maxSum);
        }

        System.out.println(maxSum);  // Print the maximum subarray sum
    }
}
