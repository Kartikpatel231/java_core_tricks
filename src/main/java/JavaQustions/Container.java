package JavaQustions;

public class Container {
    public static int Container(int arr[]) {
        int max = 0;                // Initialize the maximum area
        int left = 0;               // Initialize the left pointer to
        int right = arr.length - 1; // Initialize the right pointer to the end

        // Iterate until the left pointer is less than the right pointer
        while (left < right) {
            int w = right - left;                    // Calculate the width of the container
            int h = Math.min(arr[left], arr[right]); // Calculate the height of the container
                          // as the minimum value between the heights of the left and right bars
            int area = w * h;                        // Calculate the area of the container
            max = Math.max(max, area); // Update the maximum area if the current area is larger
            if (arr[right] < arr[left]) {
                right--;   // If the right bar is shorter, move the right pointer inward
            } else if (arr[right] > arr[left]) {
                left++;      // If the left bar is shorter, move the left pointer inward
            } else {
                right--; // If the heights of the left and right bars are equal, move both pointers inward
                left++;
            }
        }
        return max;                 // Return the maximum area found
    }
    public static void main(String[] args){
        int arr[]=new int[]{1,8,6,2,5,4,8,3,7};
        int ans=Container(arr);
        System.out.println(ans);
    }
}
