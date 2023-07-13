package JavaQustions;
import java.util.Arrays; //to iterate array without for loop
public class PlusOne {//PlusOne Class and constructor

    public static int[] PlusOne(int[] arr) {//with return array
        int n = arr.length - 1;    //size of an array start with 1
        int carry = 1;   //variable to add one in array

        for (int i = n; i >= 0; i--) { //iterate to add one
            if (carry == 1) {// condition will true
                int temp = arr[i] + carry; //add one
                if (temp >= 10) {  //check digit is 10 if so
                    arr[i] = temp % 10; //get reminder value & update
                    carry = 1;   //carry will still one
                } else {
                    arr[i] = temp;//update value
                    carry = 0; //make carry 0
                }
            }
        }
        if (carry == 1) { //if carry is still one
            int newarr[] = new int[arr.length+1]; //make new array
            newarr[0] = 1; //add carry at first position
            for (int j = 1; j < newarr.length; j++) {//iterate
                newarr[j] = arr[j - 1]; //put all value in new array
            }
            return newarr; //return updated new array
        }
        return arr;//return updated same array;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{9, 9, 9}; //array value 999
        System.out.println(Arrays.toString(arr));//print
        int ans[] = PlusOne(arr);//get array after adding 1
        for (int i = 0; i < ans.length; i++) { //iterate
            System.out.print(ans[i]);      //print;
        }
    }
}
