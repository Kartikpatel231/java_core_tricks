package skillShareDataStructure;

import java.util.Arrays;

public class BubbleSort {
    public static int[] sortArray(int[] arr){
        int size=arr.length;
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static int[] selection(int[] arr){
        int size=arr.length;
        for(int i=0;i<size-1;i++){
            int minIndex=i;
            for(int j=i+1;j<size;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
    public static void main(String[] args){
        int arr[]=new int[]{1,5,2,3,2};
        int[] myans=sortArray(arr);
        System.out.println(Arrays.toString(myans));
        int[] myans1=selection(arr);
        System.out.println(Arrays.toString(myans1));
    }
}
