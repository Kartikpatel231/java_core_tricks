package tcs;
import java.util.HashSet;
import java.util.Scanner;

public class longestConsecutive {
    public static int LongesSub(int[] arr){
        int n=arr.length;
        if(arr==null || n==0){
            return 0;
        }
        HashSet<Integer> obj=new HashSet<>();
        for (int i:arr){
            obj.add(i);
        }
        int logestStreak=0;
        for (int i:arr){
            if(!obj.contains(i-1)) {
                int currentArr = i;
                int currentStreak = 1;

                while (obj.contains(currentArr+1)) {
                     currentArr++;
                     currentStreak++;
                }
                logestStreak = Math.max(logestStreak,currentStreak );

            }
        }
        return logestStreak;
    }
    public static void main(String[] srgs){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int result = LongesSub(nums);
        System.out.println("The length of the longest consecutive sequence is: " + result);
    }
    }


