package JavaQustions;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.StrictMath.abs;

public class FindDublicate {
    public static ArrayList<Integer> dublicate(int arr[]){
         ArrayList<Integer> obj=new ArrayList<>();

        int n=arr.length;
        for(int i=0;i<n;i++){
            int value=abs(arr[i]);
            if(arr[value-1]<0){
                obj.add(arr[i]);
            }
            else {
                arr[value-1]=-1*arr[value-1];
            }
        }
        return obj;
    }
public static void main(String[] args){
    int arr[]={1,2,2,3,5,6,5};
    System.out.println(Arrays.toString(arr));
    ArrayList<Integer> ans=dublicate(arr);
    ans.forEach(obj-> System.out.println(obj));
}
}

