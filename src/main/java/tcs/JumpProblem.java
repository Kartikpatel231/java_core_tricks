package tcs;

public class JumpProblem {
    public static int minimumJump(int[] arr, int size) {
        int distance = 0;
        int position = 0;
        int jump = 0;
        for (int i = 0; i < size - 1; i++) {
            distance = Math.max(distance, arr[i] + i);
            if (position == i) {
                position = distance;
                jump++;
            }
        }
        return jump;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 3, 5, 8, 9, 3};
        int size = arr.length;
        int result = minimumJump(arr, size);
        System.out.println(result);
    }
}
