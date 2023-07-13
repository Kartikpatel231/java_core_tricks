package recursion;


import java.util.Vector;

public class PrintAllElement {
    public static String printEle(int[] arr,int size,int x){
        if(size==0){
            return " ";
        }

        String sum= printEle(arr,size-1,x);
     //   if(sum==" ")
        if(arr[size-1]==x){
            System.out.println(size-1);
        }
        return sum;

    }
    public static int printEle1(int[] arr,int size,int x,int store[],int j,Vector<Integer> ans){
        if(size==0){
            return 0;
        }
        if(arr[size-1]==x){
            store[j]=size-1;
            ans.addElement(size-1);
            return 1+printEle1(arr,size-1,x,store,j++,ans);
        }
        return 0+printEle1(arr,size-1,x,store,j,ans);
    }


    public static void main(String[] args){
        int arr[]=new int[]{1,2,3,4,5,5,5,5,10};
        int x=5;
        int size=arr.length;
       // System.out.println(printEle(arr,size,x));
        int store[]=new int[8];
        Vector<Integer> ans=new Vector<Integer>();
        int out=printEle1(arr,size,x,store,0,ans);
        for(int i=0;i<out;i++){
            System.out.println(arr[i]);
        }
        for (int i:ans
             ) {
            System.out.println(i);

        }
    }
}
