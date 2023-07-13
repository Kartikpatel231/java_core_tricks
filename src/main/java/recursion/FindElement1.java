package recursion;

public class FindElement1 {
    public static int method1(int[] arr,int size, int find){
       if(size==0){
        return -1;
    }
        if(arr[size-1]==find){
        return size-1;
    }
        return method1(arr,size-1,find);
}
    public static void main(String[] args){
        int arr[]={1,3,5,4,9,0};
        int size=arr.length;
        int find=1;
        int ans=method1(arr,size,find);
        System.out.println("find elements = "+ans);
    }
}
