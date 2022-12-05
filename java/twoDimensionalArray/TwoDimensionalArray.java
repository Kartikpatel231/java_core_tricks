package twoDimensionalArray;

import java.util.Scanner;

public class TwoDimensionalArray{
    public static void main(String[] args){
        System.out.println("Two Dimensional Array by input by user ");
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of row = ");
        int row=sc.nextInt();
        System.out.println("Enter the number of column =" );
        int column=sc.nextInt();
        int arr2d[][]=new int[row][column];

        for(int i=0;i<arr2d.length;i++){
            for(int j=0;j<arr2d.length;j++){
                System.out.print("enter at row "+i+" enter at column "+j+" = ");
                arr2d[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr2d.length;i++){
            for(int j=0;j<arr2d.length;j++){
                System.out.print(arr2d[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Length of 2d array it is for row "+arr2d.length);
        System.out.println("Length of 2d array it is in column "+arr2d[0].length);
    }
}
