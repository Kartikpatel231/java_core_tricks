package JavaQustions;

import java.util.Arrays;

public class Product_Self {
    public static int[] Product_Self(int[] arr){
        int len=arr.length;
        int answer[]=new int[len];
        answer[0]=1;
        for(int i=1;i<len;i++){
            answer[i]=answer[i-1]*arr[i-1];
        }
        int right=1;
        for(int i=len-1;i>=0;i--){
            answer[i]=answer[i]*right;
            right=right*arr[i];
        }
        return answer;

    }
    public static void main(String[] args){
        int arr[]=new int[]{1,2,3,4};
        int ans[]=Product_Self(arr);
        System.out.println(Arrays.toString(ans));
    }
}