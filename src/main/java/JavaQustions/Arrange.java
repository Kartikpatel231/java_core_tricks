package JavaQustions;

import java.util.Arrays;

public class Arrange { //class
    public static int[] Arrange(int arr[]){ //constructor
        int n=arr.length; //size of array
        int index=0;     //initial index
        int newArr[]=new int[n];//create new array
        for(int i=0;i<n;i++){   //insert all non zero value
            if(arr[i]!=0){       //check condition
                newArr[index++]=arr[i]; //insert in new array
            }
        }
        for(int j=index;j<n;j++){ //remaining zero put in the last
            newArr[j]=0;      //zero
        }
        return newArr;    //return
    }
    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 0, 4, 5};
        System.out.println(Arrays.toString(arr));//print array
        int ans[] = Arrange(arr);
        System.out.println(Arrays.toString(ans));//print array

    }
}
