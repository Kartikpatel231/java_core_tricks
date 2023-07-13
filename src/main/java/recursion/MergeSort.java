package recursion;

import java.util.Arrays;

public class MergeSort {
    //divide original array into two half we are doing same thing
    public static void mergeSort(int[] arr,int end){
        if(end<2){   //base case for recursion 6<2
            return;   //until condition not reach function will repeat
        }
        int mid=end/2;         // 6/2 = 3
        int x[]=new int[mid];   //take 1 fixed size array x to 3
        int y[]=new int[end-mid];    //take 2 fixed size array y to 3

        for(int i=0;i<mid;i++){  //store half element into x
            x[i]=arr[i];           //copy in x from arr
        }
        for (int j=mid;j<end;j++){ //store remaining half element
            y[j-mid]=arr[j];           //copy in y from arr
        }
        //repeat function for  sort x
        mergeSort(x,mid);//1 to 3
        //repeat funtion for sort y
        mergeSort(y,end-mid);//3 to 6
        // we get x and y  two sorted array and pass to merge both the array
        mergeArray(arr,x,y,mid,end-mid);
    }
    public static void mergeArray(int arr[],int x[],int y[],int start,int end){
          //merge two sorted array code by two pointer approach;
            int i = 0, j = 0, k = 0;
            while (i < start && j < end) {
                if (x[i] <= y[j]) {
                    arr[k++] = x[i++];
                }
                else {
                    arr[k++] = y[j++];
                }
            }
            while (i < start) {
                arr[k++] = x[i++];
            }
            while (j < end) {
                arr[k++] = y[j++];
            }
    }

    public static void main(String[] args){
        int arr[]=new int[]{1,2,3,9,1,0};
        System.out.println("Original Array"+Arrays.toString(arr));
        int size=arr.length;
        mergeSort(arr,size);
        System.out.println("Sorted Array using using Recursion "+Arrays.toString(arr));
    }
}