package skillShareDataStructure;

import java.util.Arrays;
public class SetMatrix {
    public static void SetMatrix(int arr[][]){
        int rowLen=arr.length;
        int colLen=arr[0].length;
        boolean isCol=false;

        for(int i=0;i<rowLen;i++){             //Since first cell for both first row and
            if(arr[i][0]==0){                 //Since first cell for both first row and
                isCol=true;
            }
            for(int j=1;j<colLen;j++){         // If an element is zero, we set
                if(arr[i][j]==0){              //the first element of the corresponding
                    arr[0][j]=0;               //row and column to 0
                    arr[i][0]=0;
                }
            }
        }
        // Iterate over the array once again and using the first row & col, update the elements
        for(int i=1;i<rowLen;i++){
            for(int j=1;j<rowLen;j++){
                if(arr[0][j]==0 | arr[i][0]==0){
                    arr[i][j]=0;
                }
            }
        }
        if(arr[0][0]==0){  // See if the first row needs to be set to zero as well
            for(int j=0;j<colLen;j++){
                arr[0][j]=0;
            }
        } // See if the first column needs to be set to zero as well
        if(isCol){
            for(int i=0;i<rowLen;i++){
                arr[i][0]=0;
            }
        }
    }
    public static void main(String[] args){
        int arr[][]=new int[][]{{1,0,2},{1,2,3},{4,5,0}};
        System.out.println("The original 2D Array is : ");
        System.out.println(Arrays.deepToString(arr));

        SetMatrix(arr);
        System.out.println("The SetMatrix 0 in place");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] +" ");
                }
            System.out.println(" ");
        }
    }
}
