package tcs;

public class QuickSort {
    public static int[] QuickSort(int arr[],int start,int end){
        if (start < end) {
            int pivot = partision(arr, start, end);
            QuickSort(arr, start, pivot - 1);
            QuickSort(arr, pivot + 1, end);
        }
        return arr;
    }
    public static int partision(int[] arr,int s,int e){
        int i=s;
        int k=arr[e];
        for(int j=s;j<e;j++){
            if(arr[j]<k){
                  int temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
                  i++;
            } }
        int temp=arr[i];
        arr[i]=arr[e];
        arr[e]=temp;
        return i;
    }

    public static void main(String[] args){
        int arr[]={1,5,3,6,7,2,4};
        int result[]=QuickSort(arr,0,arr.length-1);
        for(int ans:result){
            System.out.println(ans);
        }
    }
}
