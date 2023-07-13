package recursion;

public class SumOfArray1 {
    static int SumOfArray1(int arr[] ,int size){
        if(size==0){
            return 0;
        }
        int sum=arr[size-1]+SumOfArray1(arr,size-1);
        return sum;

    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,10,2};
        int size=arr.length;
        int ans=SumOfArray1(arr,size);
        System.out.println("sum  of array = " + ans);
    }
}
