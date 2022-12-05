package twoDimensionalArray;

public class ArrayFunctions{
    public static void myarray(int[][] values){
        int row=values.length;    //to calculate row length
        int col=values[0].length; //to calculate column length
        int max=Integer.MIN_VALUE; //const min value
        int sum=0;                 //initialize sum for calculation
        for(int j=0;j<col;j++){     //first col  loop to count value
            for(int i=0;i<row;i++){  //second row loop
             sum +=values[i][j];
        }
        if(sum>max){
                max=sum;
        }
        }
        System.out.println("maximum sum for column ="+max);
    }
    public static void main(String []args){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        myarray(arr);
    }
}
