package tcs;

import java.util.Arrays;

public class TopFiveCodingQue {
    public static void main(String[] args){
        System.out.println("1 find largest & smallest number from an array");
        int arr[]=new int[]{5,2,9,2,1,7};
        Arrays.sort(arr);
        System.out.println("Smallest Number : "+arr[0]);
        System.out.println("largest Number : "+arr[arr.length-1]);

        System.out.println("2 Find majority of element from an array");
        int major=0;
        int count=1;
        for(int i=0;i<arr.length;i++){
            count +=arr[i]==arr[major]?1:-1;
            if(count==1){
                major=++i;
                count++;

            }

        }
        System.out.println( arr[major]);

    }
    }


