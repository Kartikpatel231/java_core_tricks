package tcs;
public class MergeSort {
    public static int[] MergeSorted(int arr1[],int arr2[],int aSize,int bSize){
        if(aSize<=0){
            return arr2;
        }
        if(bSize<=0){
            return arr1;
        }
        int[] arr3=new int[arr1.length+arr2.length];
        int left=0;
        int right=0;
        int k=0;
        while (left<aSize && right<bSize){
            if(arr1[left]>=arr2[right]) {
                arr3[k] = arr2[right];
                k++;
                right++;
            }
                else{
                arr3[k]=arr1[left];
                k++;
                left++;
                }
            }
            while (left<aSize){
            arr3[k]=arr1[left];
            k++;
            left++;
            }
            while (right<bSize){
            arr3[k]=arr2[right];
            k++;
            right++;
            }
            return arr3;
        }
public static  int[] mergeSort1(int arr[],int left,int right){
        if(left>=right){
            int base[]={arr[left]};
            return base;
        }
        int mid=(right+left)/2;
      int arr1[]=  mergeSort1(arr,left,mid);
      int arr2[]=  mergeSort1(arr,mid+1,right);
        return  MergeSorted(arr1,arr2,arr1.length,arr2.length);
}
    public static void main(String[] args){
        int arr[]={1,2,3,6,10,8,3};
  //      int arr2[]={4,5,7,8};
        int left=0;
        int right=arr.length-1;
        int result[]=mergeSort1(arr,left,right);
        for(int ans:result){
            System.out.println(ans);
        }
    }
}
