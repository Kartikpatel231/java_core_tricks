package recursion;


import java.util.Arrays;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
public class Find {
  static     int p1=0;
  static   int p2=0;

    public static int maximumdata(int arr[],int size) {
        //base
        if (size == 0) {
            return 0;
        }
        //check condition
        if (arr[size - 1] == 1) {
            p1++;
        } else {
            p2++;
        }
        maximumdata(arr, size - 1);
        if (p1 > p2) {
            return p1;
        } else {
            return p2;
        }
    }
     public static int[] sortmyarr(int[] aarr,int size){
             int newArr[]=new int[size];
             int j=0;
        //base
         if(size==0){
             return aarr;
         }
         if(aarr[size-1]<=aarr[size-2]){
             newArr[size-1]=aarr[size-2];
         }
         else {
             newArr[size-2]=aarr[size-1];
         }
         sortmyarr(aarr,size-1);

         return newArr;
        }


    public static void main(String[] args) {

        int[] arr={2,1,2};
         int aarr[]= {0 ,2 ,1 ,2 ,0};
         int sizee=aarr.length;
        int size=arr.length;
        int ans=maximumdata(arr,size);
        System.out.println(ans);
        int myans[]=sortmyarr(aarr,sizee);
        System.out.println(Arrays.toString(myans));
    }
}
