package JavaQustions;
import java.util.ArrayList;
import java.util.List;

public class FindDisappear {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i : nums) {
            int index = Math.abs(i);
            if (nums[index - 1] > 0) {
                nums[index - 1] *= -1;
            }
        }
        List<Integer> obj = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                obj.add(i + 1);
            }
        }

        return obj;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{4,3,2,7,8,2,3,1};
         List<Integer> ans=findDisappearedNumbers(arr);
        System.out.println(ans);
    }
}
