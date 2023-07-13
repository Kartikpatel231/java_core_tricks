package recursion;
import sun.invoke.empty.Empty;

import java.util.*;
public class ReplaceElement {
    public static void replace(int[] arr,int size,int a){
    List<Integer> obj=new ArrayList<>(size);
        for (Integer var : arr) {      //iterate using for each  1
            obj.add(var);
        }
        obj.remove(a); //remove element
        obj.forEach(n -> System.out.println(n));   //using lambda 2

        obj.set(3,10);  //replace element
        System.out.println(Arrays.asList(obj));   //using collection 3
    }
    public static int[] removefor(int[] ar,int rem){
        int size=ar.length;
        int newArr[] = new int[size];
        for(int i=0;i<size;i++){
            if(ar[i]==rem){
                size++;
            }
            else {
                newArr[i]=ar[i];

            }


        }
        return newArr;
    }
    public static void main(String[] args){
        int arr[]=new int[]{1,2,3,4,5};
        System.out.println("Original array "+Arrays.toString(arr)); //toString method 4
        int size=arr.length;
        replace(arr,size,1);
        int ar[]=removefor(arr,4);
        System.out.println(Arrays.toString(ar));
    }
}
