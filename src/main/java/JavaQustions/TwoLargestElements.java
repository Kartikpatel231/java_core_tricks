package JavaQustions;

public class TwoLargestElements {
    public static void main(String[] args){
        int arr[]=new int[]{1,2,8,3,10,7}; //array declaration
        int n=arr.length;     //get array length
        int max1=Integer.MIN_VALUE;  //set variable1 to 0
        int max2=Integer.MIN_VALUE;  //set variable2 to 0
        for(int i=0;i<n;i++){       //run a loop to iterate
            if(arr[i]>max1){        //condition check
                max2=max1;          //put first value in max2
                max1=arr[i];        //put value in max1
            }              //if there is more than two value in array
            else if(arr[i]>max2){ // check again
                max2=arr[i];
            }
        }
        System.out.println("Largest two Value = "+max1+","+max2);
    }
}
