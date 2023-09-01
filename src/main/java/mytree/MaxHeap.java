package mytree;

public class MaxHeap {
    public static int[] MaxHeap(int[] arr,int size){
        for(int i=size/2;i>=0;i--){
            buildHeap(arr,i,size);
        }
        return arr;
    }
    public static void buildHeap(int arr[],int index,int size){
        int left=2*index+1;
        int right=left+1;
        int max=index;

        if(left<size && arr[left]>arr[max]){
            max=left;
        }
        if(right<size && arr[right]>arr[max]){
            max=right;
        }
        if(max!=index){
            int temp=arr[index];
            arr[index]=arr[max];
            arr[max]=temp;
            buildHeap(arr,max,size);


        }
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8};
        int[] results=MaxHeap(arr,arr.length);
        for(int ans:results)
        System.out.println(ans);
    }
}
