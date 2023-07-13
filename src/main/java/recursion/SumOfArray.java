package recursion;

public class SumOfArray {
   static int SumOfArray(int arr[] ,int size,int i){
        if(size==0){
            return 0;
        }
        if(i==size){
            return 0;
        }
        int sum=arr[i]+SumOfArray(arr,size,i+1);
        return sum;
    }
    public static void main(String[] args){
        int arr[]={1,3,4,7,8,10,10};
        int size=arr.length;
        int answer=SumOfArray(arr,size,0);
        System.out.println("sumOfArray = "+answer);
    }
}
