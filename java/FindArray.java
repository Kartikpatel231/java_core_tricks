import java.util.Scanner;
public class FindArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("array size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean ans=isSorted(arr,0);
       System.out.println(ans);
    }
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
}
